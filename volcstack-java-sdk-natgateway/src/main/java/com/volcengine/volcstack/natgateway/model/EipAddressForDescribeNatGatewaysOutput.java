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
 * EipAddressForDescribeNatGatewaysOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:35.637696+08:00[Asia/Shanghai]")
public class EipAddressForDescribeNatGatewaysOutput {
  @SerializedName("AllocationId")
  private String allocationId = null;

  @SerializedName("EipAddress")
  private String eipAddress = null;

  @SerializedName("UsingStatus")
  private String usingStatus = null;

  public EipAddressForDescribeNatGatewaysOutput allocationId(String allocationId) {
    this.allocationId = allocationId;
    return this;
  }

   /**
   * Get allocationId
   * @return allocationId
  **/
  @Schema(description = "")
  public String getAllocationId() {
    return allocationId;
  }

  public void setAllocationId(String allocationId) {
    this.allocationId = allocationId;
  }

  public EipAddressForDescribeNatGatewaysOutput eipAddress(String eipAddress) {
    this.eipAddress = eipAddress;
    return this;
  }

   /**
   * Get eipAddress
   * @return eipAddress
  **/
  @Schema(description = "")
  public String getEipAddress() {
    return eipAddress;
  }

  public void setEipAddress(String eipAddress) {
    this.eipAddress = eipAddress;
  }

  public EipAddressForDescribeNatGatewaysOutput usingStatus(String usingStatus) {
    this.usingStatus = usingStatus;
    return this;
  }

   /**
   * Get usingStatus
   * @return usingStatus
  **/
  @Schema(description = "")
  public String getUsingStatus() {
    return usingStatus;
  }

  public void setUsingStatus(String usingStatus) {
    this.usingStatus = usingStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EipAddressForDescribeNatGatewaysOutput eipAddressForDescribeNatGatewaysOutput = (EipAddressForDescribeNatGatewaysOutput) o;
    return Objects.equals(this.allocationId, eipAddressForDescribeNatGatewaysOutput.allocationId) &&
        Objects.equals(this.eipAddress, eipAddressForDescribeNatGatewaysOutput.eipAddress) &&
        Objects.equals(this.usingStatus, eipAddressForDescribeNatGatewaysOutput.usingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationId, eipAddress, usingStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EipAddressForDescribeNatGatewaysOutput {\n");
    
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
    sb.append("    usingStatus: ").append(toIndentedString(usingStatus)).append("\n");
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
