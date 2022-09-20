/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpc.model.TagForCreateSecurityGroupInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateSecurityGroupRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-20T11:35:41.789411+08:00[Asia/Shanghai]")
public class CreateSecurityGroupRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("SecurityGroupName")
  private String securityGroupName = null;

  @SerializedName("Tags")
  private List<TagForCreateSecurityGroupInput> tags = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public CreateSecurityGroupRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public CreateSecurityGroupRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateSecurityGroupRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public CreateSecurityGroupRequest securityGroupName(String securityGroupName) {
    this.securityGroupName = securityGroupName;
    return this;
  }

   /**
   * Get securityGroupName
   * @return securityGroupName
  **/
  @Schema(description = "")
  public String getSecurityGroupName() {
    return securityGroupName;
  }

  public void setSecurityGroupName(String securityGroupName) {
    this.securityGroupName = securityGroupName;
  }

  public CreateSecurityGroupRequest tags(List<TagForCreateSecurityGroupInput> tags) {
    this.tags = tags;
    return this;
  }

  public CreateSecurityGroupRequest addTagsItem(TagForCreateSecurityGroupInput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForCreateSecurityGroupInput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForCreateSecurityGroupInput> getTags() {
    return tags;
  }

  public void setTags(List<TagForCreateSecurityGroupInput> tags) {
    this.tags = tags;
  }

  public CreateSecurityGroupRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSecurityGroupRequest createSecurityGroupRequest = (CreateSecurityGroupRequest) o;
    return Objects.equals(this.clientToken, createSecurityGroupRequest.clientToken) &&
        Objects.equals(this.description, createSecurityGroupRequest.description) &&
        Objects.equals(this.projectName, createSecurityGroupRequest.projectName) &&
        Objects.equals(this.securityGroupName, createSecurityGroupRequest.securityGroupName) &&
        Objects.equals(this.tags, createSecurityGroupRequest.tags) &&
        Objects.equals(this.vpcId, createSecurityGroupRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, description, projectName, securityGroupName, tags, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSecurityGroupRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    securityGroupName: ").append(toIndentedString(securityGroupName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
