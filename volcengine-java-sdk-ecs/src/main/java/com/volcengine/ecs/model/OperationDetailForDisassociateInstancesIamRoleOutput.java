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

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.ecs.model.ErrorForDisassociateInstancesIamRoleOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OperationDetailForDisassociateInstancesIamRoleOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:35.752778+08:00[Asia/Shanghai]")
public class OperationDetailForDisassociateInstancesIamRoleOutput {
  @SerializedName("Error")
  private ErrorForDisassociateInstancesIamRoleOutput error = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  public OperationDetailForDisassociateInstancesIamRoleOutput error(ErrorForDisassociateInstancesIamRoleOutput error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Valid
  @Schema(description = "")
  public ErrorForDisassociateInstancesIamRoleOutput getError() {
    return error;
  }

  public void setError(ErrorForDisassociateInstancesIamRoleOutput error) {
    this.error = error;
  }

  public OperationDetailForDisassociateInstancesIamRoleOutput instanceId(String instanceId) {
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
    OperationDetailForDisassociateInstancesIamRoleOutput operationDetailForDisassociateInstancesIamRoleOutput = (OperationDetailForDisassociateInstancesIamRoleOutput) o;
    return Objects.equals(this.error, operationDetailForDisassociateInstancesIamRoleOutput.error) &&
        Objects.equals(this.instanceId, operationDetailForDisassociateInstancesIamRoleOutput.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, instanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationDetailForDisassociateInstancesIamRoleOutput {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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