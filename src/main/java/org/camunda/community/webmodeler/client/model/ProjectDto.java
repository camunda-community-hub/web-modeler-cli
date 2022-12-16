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
import java.util.Objects;

/** ProjectDto */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2022-12-16T16:31:05.499Z[GMT]")
public class ProjectDto {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("createdBy")
  private UserDto createdBy = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("updatedBy")
  private UserDto updatedBy = null;

  public ProjectDto id(String id) {
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

  public ProjectDto name(String name) {
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

  public ProjectDto created(String created) {
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

  public ProjectDto createdBy(UserDto createdBy) {
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

  public ProjectDto updated(String updated) {
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

  public ProjectDto updatedBy(UserDto updatedBy) {
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
    ProjectDto projectDto = (ProjectDto) o;
    return Objects.equals(this.id, projectDto.id)
        && Objects.equals(this.name, projectDto.name)
        && Objects.equals(this.created, projectDto.created)
        && Objects.equals(this.createdBy, projectDto.createdBy)
        && Objects.equals(this.updated, projectDto.updated)
        && Objects.equals(this.updatedBy, projectDto.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, created, createdBy, updated, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDto {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
