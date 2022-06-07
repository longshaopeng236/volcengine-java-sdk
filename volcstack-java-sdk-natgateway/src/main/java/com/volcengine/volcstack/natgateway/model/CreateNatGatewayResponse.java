/*
 * natgateway
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.natgateway.model;

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
 * CreateNatGatewayResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:41.250123+08:00[Asia/Shanghai]")
public class CreateNatGatewayResponse {
  @SerializedName("NatGatewayId")
  private String natGatewayId = null;

  @SerializedName("PreOrderNumber")
  private String preOrderNumber = null;

  @SerializedName("RequestId")
  private String requestId = null;

  public CreateNatGatewayResponse natGatewayId(String natGatewayId) {
    this.natGatewayId = natGatewayId;
    return this;
  }

   /**
   * Get natGatewayId
   * @return natGatewayId
  **/
  @Schema(description = "")
  public String getNatGatewayId() {
    return natGatewayId;
  }

  public void setNatGatewayId(String natGatewayId) {
    this.natGatewayId = natGatewayId;
  }

  public CreateNatGatewayResponse preOrderNumber(String preOrderNumber) {
    this.preOrderNumber = preOrderNumber;
    return this;
  }

   /**
   * Get preOrderNumber
   * @return preOrderNumber
  **/
  @Schema(description = "")
  public String getPreOrderNumber() {
    return preOrderNumber;
  }

  public void setPreOrderNumber(String preOrderNumber) {
    this.preOrderNumber = preOrderNumber;
  }

  public CreateNatGatewayResponse requestId(String requestId) {
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
    CreateNatGatewayResponse createNatGatewayResponse = (CreateNatGatewayResponse) o;
    return Objects.equals(this.natGatewayId, createNatGatewayResponse.natGatewayId) &&
        Objects.equals(this.preOrderNumber, createNatGatewayResponse.preOrderNumber) &&
        Objects.equals(this.requestId, createNatGatewayResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(natGatewayId, preOrderNumber, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNatGatewayResponse {\n");
    
    sb.append("    natGatewayId: ").append(toIndentedString(natGatewayId)).append("\n");
    sb.append("    preOrderNumber: ").append(toIndentedString(preOrderNumber)).append("\n");
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
