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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateHaVipResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T20:18:16.579539+08:00[Asia/Shanghai]")
public class CreateHaVipResponse {
  @SerializedName("HaVipId")
  private String haVipId = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  @SerializedName("RequestId")
  private String requestId = null;

  public CreateHaVipResponse haVipId(String haVipId) {
    this.haVipId = haVipId;
    return this;
  }

   /**
   * Get haVipId
   * @return haVipId
  **/
  @Schema(description = "")
  public String getHaVipId() {
    return haVipId;
  }

  public void setHaVipId(String haVipId) {
    this.haVipId = haVipId;
  }

  public CreateHaVipResponse ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @Schema(description = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public CreateHaVipResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateHaVipResponse createHaVipResponse = (CreateHaVipResponse) o;
    return Objects.equals(this.haVipId, createHaVipResponse.haVipId) &&
        Objects.equals(this.ipAddress, createHaVipResponse.ipAddress) &&
        Objects.equals(this.requestId, createHaVipResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(haVipId, ipAddress, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateHaVipResponse {\n");
    
    sb.append("    haVipId: ").append(toIndentedString(haVipId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
