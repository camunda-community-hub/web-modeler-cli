package org.camunda.community.webmodeler.download;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;
import org.apache.commons.io.FileUtils;
import org.camunda.community.webmodeler.client.ApiException;
import org.camunda.community.webmodeler.client.api.ApiBetaApi;
import org.camunda.community.webmodeler.client.model.FileDto;
import org.camunda.community.webmodeler.client.model.FileMetadataDto;

public class Downloader {

  private final ApiBetaApi api;
  private final File folder;

  public Downloader(ApiBetaApi api, File folder) {
    this.api = Objects.requireNonNull(api);
    this.folder = Objects.requireNonNull(folder);
  }

  public void downloadProject(UUID projectUUID, Mode mode) throws ApiException {
    var fileMetadataDto = api.listFiles(projectUUID);

    var idToFile =
        fileMetadataDto.stream()
            .map(this::getFile)
            .collect(Collectors.toMap(item -> item.getMetadata().getId(), item -> item));

    switch (mode) {
      case SIMPLE_PATH -> writeFilesSimplePath(idToFile);
      case CANONICAL_PATH -> writeFilesCanonicalPath(idToFile);
    }
  }

  private void writeFilesSimplePath(Map<String, FileDto> idToFile) {
    idToFile.values().stream()
        .forEach(file -> writeFile(file.getContent(), file.getMetadata().getSimplePath()));
  }

  private void writeFilesCanonicalPath(Map<String, FileDto> idToFile) {
    idToFile.values().stream()
        .forEach(file -> writeFile(file.getContent(), getCanonicalPath(file)));
  }

  private String getCanonicalPath(FileDto file) {
    var pathElements = file.getMetadata().getCanonicalPath();

    var folderPath =
        pathElements.stream()
            .map(pe -> pe.getName() + "[" + pe.getId() + "]")
            .collect(Collectors.joining("/", "", "/"));

    var fileName =
        file.getMetadata().getName()
            + "["
            + file.getMetadata().getId()
            + "]"
            + toExtension(file.getMetadata().getType());

    return folderPath + fileName;
  }

  private String toExtension(String type) {
    return switch (type) {
      case "BPMN" -> ".bpmn";
      case "DMN" -> ".dmn";
      case "CONNECTOR_TEMPLATE" -> ".json";
      case "FORM" -> ".form";
      default -> "." + type.toLowerCase();
    };
  }

  private void writeFile(String content, String fileName) {
    System.out.println("Writing: " + fileName);
    var outputFile = new File(folder, fileName);

    try {
      FileUtils.write(outputFile, content);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public FileDto getFile(FileMetadataDto fileMetadata) {
    try {
      return getFile(UUID.fromString(fileMetadata.getId()));
    } catch (ApiException e) {
      throw new RuntimeException(e);
    }
  }

  public FileDto getFile(UUID fileUUID) throws ApiException {
    return api.getFile(fileUUID);
  }

  public enum Mode {
    SIMPLE_PATH,
    CANONICAL_PATH
  }
}
