/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.autoscaling.model;

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
 * InstanceProtectionResultForSetInstancesProtectionOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:12.731669+08:00[Asia/Shanghai]")
public class InstanceProtectionResultForSetInstancesProtectionOutput {
  @SerializedName("Code")
  private String code = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("Message")
  private String message = null;

  @SerializedName("Result")
  private String result = null;

  public InstanceProtectionResultForSetInstancesProtectionOutput code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public InstanceProtectionResultForSetInstancesProtectionOutput instanceId(String instanceId) {
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

  public InstanceProtectionResultForSetInstancesProtectionOutput message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InstanceProtectionResultForSetInstancesProtectionOutput result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @Schema(description = "")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceProtectionResultForSetInstancesProtectionOutput instanceProtectionResultForSetInstancesProtectionOutput = (InstanceProtectionResultForSetInstancesProtectionOutput) o;
    return Objects.equals(this.code, instanceProtectionResultForSetInstancesProtectionOutput.code) &&
        Objects.equals(this.instanceId, instanceProtectionResultForSetInstancesProtectionOutput.instanceId) &&
        Objects.equals(this.message, instanceProtectionResultForSetInstancesProtectionOutput.message) &&
        Objects.equals(this.result, instanceProtectionResultForSetInstancesProtectionOutput.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, instanceId, message, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceProtectionResultForSetInstancesProtectionOutput {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
