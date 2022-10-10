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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UnassignPrivateIpAddressesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T13:58:53.827648+08:00[Asia/Shanghai]")
public class UnassignPrivateIpAddressesRequest {
  @SerializedName("NetworkInterfaceId")
  private String networkInterfaceId = null;

  @SerializedName("PrivateIpAddress")
  private List<String> privateIpAddress = null;

  public UnassignPrivateIpAddressesRequest networkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
    return this;
  }

   /**
   * Get networkInterfaceId
   * @return networkInterfaceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getNetworkInterfaceId() {
    return networkInterfaceId;
  }

  public void setNetworkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
  }

  public UnassignPrivateIpAddressesRequest privateIpAddress(List<String> privateIpAddress) {
    this.privateIpAddress = privateIpAddress;
    return this;
  }

  public UnassignPrivateIpAddressesRequest addPrivateIpAddressItem(String privateIpAddressItem) {
    if (this.privateIpAddress == null) {
      this.privateIpAddress = new ArrayList<String>();
    }
    this.privateIpAddress.add(privateIpAddressItem);
    return this;
  }

   /**
   * Get privateIpAddress
   * @return privateIpAddress
  **/
  @Schema(description = "")
  public List<String> getPrivateIpAddress() {
    return privateIpAddress;
  }

  public void setPrivateIpAddress(List<String> privateIpAddress) {
    this.privateIpAddress = privateIpAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnassignPrivateIpAddressesRequest unassignPrivateIpAddressesRequest = (UnassignPrivateIpAddressesRequest) o;
    return Objects.equals(this.networkInterfaceId, unassignPrivateIpAddressesRequest.networkInterfaceId) &&
        Objects.equals(this.privateIpAddress, unassignPrivateIpAddressesRequest.privateIpAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkInterfaceId, privateIpAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnassignPrivateIpAddressesRequest {\n");
    
    sb.append("    networkInterfaceId: ").append(toIndentedString(networkInterfaceId)).append("\n");
    sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
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
