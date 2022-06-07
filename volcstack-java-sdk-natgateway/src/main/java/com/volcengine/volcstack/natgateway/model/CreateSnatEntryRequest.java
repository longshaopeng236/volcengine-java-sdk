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
 * CreateSnatEntryRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:41.250123+08:00[Asia/Shanghai]")
public class CreateSnatEntryRequest {
  @SerializedName("EipId")
  private String eipId = null;

  @SerializedName("NatGatewayId")
  private String natGatewayId = null;

  @SerializedName("SnatEntryName")
  private String snatEntryName = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  public CreateSnatEntryRequest eipId(String eipId) {
    this.eipId = eipId;
    return this;
  }

   /**
   * Get eipId
   * @return eipId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getEipId() {
    return eipId;
  }

  public void setEipId(String eipId) {
    this.eipId = eipId;
  }

  public CreateSnatEntryRequest natGatewayId(String natGatewayId) {
    this.natGatewayId = natGatewayId;
    return this;
  }

   /**
   * Get natGatewayId
   * @return natGatewayId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getNatGatewayId() {
    return natGatewayId;
  }

  public void setNatGatewayId(String natGatewayId) {
    this.natGatewayId = natGatewayId;
  }

  public CreateSnatEntryRequest snatEntryName(String snatEntryName) {
    this.snatEntryName = snatEntryName;
    return this;
  }

   /**
   * Get snatEntryName
   * @return snatEntryName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getSnatEntryName() {
    return snatEntryName;
  }

  public void setSnatEntryName(String snatEntryName) {
    this.snatEntryName = snatEntryName;
  }

  public CreateSnatEntryRequest subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSnatEntryRequest createSnatEntryRequest = (CreateSnatEntryRequest) o;
    return Objects.equals(this.eipId, createSnatEntryRequest.eipId) &&
        Objects.equals(this.natGatewayId, createSnatEntryRequest.natGatewayId) &&
        Objects.equals(this.snatEntryName, createSnatEntryRequest.snatEntryName) &&
        Objects.equals(this.subnetId, createSnatEntryRequest.subnetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eipId, natGatewayId, snatEntryName, subnetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSnatEntryRequest {\n");
    
    sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
    sb.append("    natGatewayId: ").append(toIndentedString(natGatewayId)).append("\n");
    sb.append("    snatEntryName: ").append(toIndentedString(snatEntryName)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
