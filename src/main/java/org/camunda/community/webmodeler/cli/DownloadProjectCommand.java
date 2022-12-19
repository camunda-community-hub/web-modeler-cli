package org.camunda.community.webmodeler.cli;

import java.io.File;
import java.util.UUID;
import org.apache.commons.io.FileUtils;
import org.camunda.community.webmodeler.download.Downloader;
import org.camunda.community.webmodeler.download.Downloader.Mode;
import picocli.CommandLine;

@CommandLine.Command(
    name = "downloadProject",
    description = "Downloads all files of the project.",
    mixinStandardHelpOptions = true)
public class DownloadProjectCommand extends AbstractCommand {

  @CommandLine.Option(
      names = {"--project", "-p"},
      description = "project UUID",
      scope = CommandLine.ScopeType.LOCAL,
      required = true)
  private UUID projectUUID;

  @CommandLine.Option(
      names = {"--output", "-o"},
      description = "output folder",
      scope = CommandLine.ScopeType.LOCAL)
  private String output;

  @CommandLine.Option(
      names = {"--mode", "-m"},
      description = "Overwrite mode for download. Valid values are: ${COMPLETION-CANDIDATES}",
      defaultValue = "SIMPLE_PATH",
      scope = CommandLine.ScopeType.LOCAL)
  private Mode mode;

  @Override
  public Integer call() throws Exception {
    final File folder;
    if (output == null) {
      folder = new File(".");
    } else {
      folder = new File(output);
      FileUtils.forceMkdir(folder);
    }
    var downloader = new Downloader(parent.buildClient(), folder);
    downloader.downloadProject(projectUUID, mode);
    return 0;
  }
}
