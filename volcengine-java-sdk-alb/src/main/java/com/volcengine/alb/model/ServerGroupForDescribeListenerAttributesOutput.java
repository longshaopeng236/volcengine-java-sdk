/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

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
 * ServerGroupForDescribeListenerAttributesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-23T17:22:04.615963+08:00[Asia/Shanghai]")
public class ServerGroupForDescribeListenerAttributesOutput {
  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  @SerializedName("ServerGroupName")
  private String serverGroupName = null;

  public ServerGroupForDescribeListenerAttributesOutput serverGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
    return this;
  }

   /**
   * Get serverGroupId
   * @return serverGroupId
  **/
  @Schema(description = "")
  public String getServerGroupId() {
    return serverGroupId;
  }

  public void setServerGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
  }

  public ServerGroupForDescribeListenerAttributesOutput serverGroupName(String serverGroupName) {
    this.serverGroupName = serverGroupName;
    return this;
  }

   /**
   * Get serverGroupName
   * @return serverGroupName
  **/
  @Schema(description = "")
  public String getServerGroupName() {
    return serverGroupName;
  }

  public void setServerGroupName(String serverGroupName) {
    this.serverGroupName = serverGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerGroupForDescribeListenerAttributesOutput serverGroupForDescribeListenerAttributesOutput = (ServerGroupForDescribeListenerAttributesOutput) o;
    return Objects.equals(this.serverGroupId, serverGroupForDescribeListenerAttributesOutput.serverGroupId) &&
        Objects.equals(this.serverGroupName, serverGroupForDescribeListenerAttributesOutput.serverGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverGroupId, serverGroupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerGroupForDescribeListenerAttributesOutput {\n");
    
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
    sb.append("    serverGroupName: ").append(toIndentedString(serverGroupName)).append("\n");
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
