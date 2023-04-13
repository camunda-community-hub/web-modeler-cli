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
 * MilestoneMetadataDto
 */
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
        date = "2023-04-13T12:19:16.932483766Z[GMT]")
public class MilestoneMetadataDto {
    @SerializedName("id")
    private String id = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("fileId")
    private String fileId = null;

    @SerializedName("created")
    private String created = null;

    @SerializedName("createdBy")
    private UserDto createdBy = null;

    @SerializedName("updated")
    private String updated = null;

    @SerializedName("updatedBy")
    private UserDto updatedBy = null;

    public MilestoneMetadataDto id(String id) {
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

    public MilestoneMetadataDto name(String name) {
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

    public MilestoneMetadataDto fileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Get fileId
     * @return fileId
     **/
    @Schema(description = "")
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public MilestoneMetadataDto created(String created) {
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

    public MilestoneMetadataDto createdBy(UserDto createdBy) {
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

    public MilestoneMetadataDto updated(String updated) {
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

    public MilestoneMetadataDto updatedBy(UserDto updatedBy) {
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
        MilestoneMetadataDto milestoneMetadataDto = (MilestoneMetadataDto) o;
        return Objects.equals(this.id, milestoneMetadataDto.id)
                && Objects.equals(this.name, milestoneMetadataDto.name)
                && Objects.equals(this.fileId, milestoneMetadataDto.fileId)
                && Objects.equals(this.created, milestoneMetadataDto.created)
                && Objects.equals(this.createdBy, milestoneMetadataDto.createdBy)
                && Objects.equals(this.updated, milestoneMetadataDto.updated)
                && Objects.equals(this.updatedBy, milestoneMetadataDto.updatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, fileId, created, createdBy, updated, updatedBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MilestoneMetadataDto {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
