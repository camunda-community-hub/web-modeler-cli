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
 * CreateMilestoneDto
 */
@javax.annotation.Generated(
        value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
        date = "2023-04-13T12:19:16.932483766Z[GMT]")
public class CreateMilestoneDto {
    @SerializedName("name")
    private String name = null;

    @SerializedName("fileId")
    private String fileId = null;

    public CreateMilestoneDto name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     **/
    @Schema(required = true, description = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateMilestoneDto fileId(String fileId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMilestoneDto createMilestoneDto = (CreateMilestoneDto) o;
        return Objects.equals(this.name, createMilestoneDto.name)
                && Objects.equals(this.fileId, createMilestoneDto.fileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fileId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMilestoneDto {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
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