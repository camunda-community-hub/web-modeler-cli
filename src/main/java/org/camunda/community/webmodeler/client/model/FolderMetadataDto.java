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

/**
 * FolderMetadataDto
 */
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
        date = "2023-04-13T12:19:16.932483766Z[GMT]")
public class FolderMetadataDto {
    @SerializedName("id")
    private String id = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("projectId")
    private String projectId = null;

    @SerializedName("parentId")
    private String parentId = null;

    @SerializedName("created")
    private String created = null;

    @SerializedName("updated")
    private String updated = null;

    @SerializedName("createdBy")
    private UserDto createdBy = null;

    @SerializedName("updatedBy")
    private UserDto updatedBy = null;

    public FolderMetadataDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @Schema(description = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FolderMetadataDto name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     **/
    @Schema(description = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FolderMetadataDto projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Get projectId
     * @return projectId
     **/
    @Schema(description = "")
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public FolderMetadataDto parentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Get parentId
     * @return parentId
     **/
    @Schema(description = "")
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public FolderMetadataDto created(String created) {
        this.created = created;
        return this;
    }

    /**
     * Get created
     * @return created
     **/
    @Schema(description = "")
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public FolderMetadataDto updated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * Get updated
     * @return updated
     **/
    @Schema(description = "")
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public FolderMetadataDto createdBy(UserDto createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     **/
    @Schema(description = "")
    public UserDto getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserDto createdBy) {
        this.createdBy = createdBy;
    }

    public FolderMetadataDto updatedBy(UserDto updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Get updatedBy
     * @return updatedBy
     **/
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
        FolderMetadataDto folderMetadataDto = (FolderMetadataDto) o;
        return Objects.equals(this.id, folderMetadataDto.id)
                && Objects.equals(this.name, folderMetadataDto.name)
                && Objects.equals(this.projectId, folderMetadataDto.projectId)
                && Objects.equals(this.parentId, folderMetadataDto.parentId)
                && Objects.equals(this.created, folderMetadataDto.created)
                && Objects.equals(this.updated, folderMetadataDto.updated)
                && Objects.equals(this.createdBy, folderMetadataDto.createdBy)
                && Objects.equals(this.updatedBy, folderMetadataDto.updatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, projectId, parentId, created, updated, createdBy, updatedBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FolderMetadataDto {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
