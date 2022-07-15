/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.clb.model;

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
 * DescribeHealthCheckLogTopicAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:28.835190+08:00[Asia/Shanghai]")
public class DescribeHealthCheckLogTopicAttributesRequest {
  @SerializedName("LogTopicId")
  private String logTopicId = null;

  public DescribeHealthCheckLogTopicAttributesRequest logTopicId(String logTopicId) {
    this.logTopicId = logTopicId;
    return this;
  }

   /**
   * Get logTopicId
   * @return logTopicId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getLogTopicId() {
    return logTopicId;
  }

  public void setLogTopicId(String logTopicId) {
    this.logTopicId = logTopicId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeHealthCheckLogTopicAttributesRequest describeHealthCheckLogTopicAttributesRequest = (DescribeHealthCheckLogTopicAttributesRequest) o;
    return Objects.equals(this.logTopicId, describeHealthCheckLogTopicAttributesRequest.logTopicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logTopicId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeHealthCheckLogTopicAttributesRequest {\n");
    
    sb.append("    logTopicId: ").append(toIndentedString(logTopicId)).append("\n");
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