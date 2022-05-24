/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BindAssumeRoleRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class BindAssumeRoleRequest {
  @SerializedName("AssumeRole")
  private String assumeRole = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  public BindAssumeRoleRequest assumeRole(String assumeRole) {
    this.assumeRole = assumeRole;
    return this;
  }

   /**
   * Get assumeRole
   * @return assumeRole
  **/
  @Schema(description = "")
  public String getAssumeRole() {
    return assumeRole;
  }

  public void setAssumeRole(String assumeRole) {
    this.assumeRole = assumeRole;
  }

  public BindAssumeRoleRequest instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BindAssumeRoleRequest bindAssumeRoleRequest = (BindAssumeRoleRequest) o;
    return Objects.equals(this.assumeRole, bindAssumeRoleRequest.assumeRole) &&
        Objects.equals(this.instanceId, bindAssumeRoleRequest.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assumeRole, instanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BindAssumeRoleRequest {\n");
    
    sb.append("    assumeRole: ").append(toIndentedString(assumeRole)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
