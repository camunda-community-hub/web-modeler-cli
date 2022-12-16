/*
 * Modeler REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.camunda.community.webmodeler.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** FileMetadataDto */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2022-12-16T16:31:05.499Z[GMT]")
public class FileMetadataDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("folderId")
  private String folderId = null;

  @SerializedName("simplePath")
  private String simplePath = null;

  @SerializedName("canonicalPath")
  private List<PathElementDto> canonicalPath = null;

  @SerializedName("revision")
  private Integer revision = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("createdBy")
  private UserDto createdBy = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("updatedBy")
  private UserDto updatedBy = null;

  public FileMetadataDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FileMetadataDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileMetadataDto projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   *
   * @return projectId
   */
  @Schema(description = "")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public FileMetadataDto folderId(String folderId) {
    this.folderId = folderId;
    return this;
  }

  /**
   * Get folderId
   *
   * @return folderId
   */
  @Schema(description = "")
  public String getFolderId() {
    return folderId;
  }

  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  public FileMetadataDto simplePath(String simplePath) {
    this.simplePath = simplePath;
    return this;
  }

  /**
   * Get simplePath
   *
   * @return simplePath
   */
  @Schema(description = "")
  public String getSimplePath() {
    return simplePath;
  }

  public void setSimplePath(String simplePath) {
    this.simplePath = simplePath;
  }

  public FileMetadataDto canonicalPath(List<PathElementDto> canonicalPath) {
    this.canonicalPath = canonicalPath;
    return this;
  }

  public FileMetadataDto addCanonicalPathItem(PathElementDto canonicalPathItem) {
    if (this.canonicalPath == null) {
      this.canonicalPath = new ArrayList<PathElementDto>();
    }
    this.canonicalPath.add(canonicalPathItem);
    return this;
  }

  /**
   * Get canonicalPath
   *
   * @return canonicalPath
   */
  @Schema(description = "")
  public List<PathElementDto> getCanonicalPath() {
    return canonicalPath;
  }

  public void setCanonicalPath(List<PathElementDto> canonicalPath) {
    this.canonicalPath = canonicalPath;
  }

  public FileMetadataDto revision(Integer revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Get revision
   *
   * @return revision
   */
  @Schema(description = "")
  public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  public FileMetadataDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FileMetadataDto created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   *
   * @return created
   */
  @Schema(description = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public FileMetadataDto createdBy(UserDto createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   *
   * @return createdBy
   */
  @Schema(description = "")
  public UserDto getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UserDto createdBy) {
    this.createdBy = createdBy;
  }

  public FileMetadataDto updated(String updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   *
   * @return updated
   */
  @Schema(description = "")
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public FileMetadataDto updatedBy(UserDto updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Get updatedBy
   *
   * @return updatedBy
   */
  @Schema(description = "")
  public UserDto getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(UserDto updatedBy) {
    this.updatedBy = updatedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMetadataDto fileMetadataDto = (FileMetadataDto) o;
    return Objects.equals(this.id, fileMetadataDto.id)
        && Objects.equals(this.name, fileMetadataDto.name)
        && Objects.equals(this.projectId, fileMetadataDto.projectId)
        && Objects.equals(this.folderId, fileMetadataDto.folderId)
        && Objects.equals(this.simplePath, fileMetadataDto.simplePath)
        && Objects.equals(this.canonicalPath, fileMetadataDto.canonicalPath)
        && Objects.equals(this.revision, fileMetadataDto.revision)
        && Objects.equals(this.type, fileMetadataDto.type)
        && Objects.equals(this.created, fileMetadataDto.created)
        && Objects.equals(this.createdBy, fileMetadataDto.createdBy)
        && Objects.equals(this.updated, fileMetadataDto.updated)
        && Objects.equals(this.updatedBy, fileMetadataDto.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        name,
        projectId,
        folderId,
        simplePath,
        canonicalPath,
        revision,
        type,
        created,
        createdBy,
        updated,
        updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileMetadataDto {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    simplePath: ").append(toIndentedString(simplePath)).append("\n");
    sb.append("    canonicalPath: ").append(toIndentedString(canonicalPath)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
