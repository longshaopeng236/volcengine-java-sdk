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
 * AssignPrivateIpAddressesResponse
 */


public class AssignPrivateIpAddressesResponse {
  @SerializedName("NetworkInterfaceId")
  private String networkInterfaceId = null;

  @SerializedName("PrivateIpSet")
  private List<String> privateIpSet = null;

  @SerializedName("RequestId")
  private String requestId = null;

  public AssignPrivateIpAddressesResponse networkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
    return this;
  }

   /**
   * Get networkInterfaceId
   * @return networkInterfaceId
  **/
  @Schema(description = "")
  public String getNetworkInterfaceId() {
    return networkInterfaceId;
  }

  public void setNetworkInterfaceId(String networkInterfaceId) {
    this.networkInterfaceId = networkInterfaceId;
  }

  public AssignPrivateIpAddressesResponse privateIpSet(List<String> privateIpSet) {
    this.privateIpSet = privateIpSet;
    return this;
  }

  public AssignPrivateIpAddressesResponse addPrivateIpSetItem(String privateIpSetItem) {
    if (this.privateIpSet == null) {
      this.privateIpSet = new ArrayList<String>();
    }
    this.privateIpSet.add(privateIpSetItem);
    return this;
  }

   /**
   * Get privateIpSet
   * @return privateIpSet
  **/
  @Schema(description = "")
  public List<String> getPrivateIpSet() {
    return privateIpSet;
  }

  public void setPrivateIpSet(List<String> privateIpSet) {
    this.privateIpSet = privateIpSet;
  }

  public AssignPrivateIpAddressesResponse requestId(String requestId) {
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
    AssignPrivateIpAddressesResponse assignPrivateIpAddressesResponse = (AssignPrivateIpAddressesResponse) o;
    return Objects.equals(this.networkInterfaceId, assignPrivateIpAddressesResponse.networkInterfaceId) &&
        Objects.equals(this.privateIpSet, assignPrivateIpAddressesResponse.privateIpSet) &&
        Objects.equals(this.requestId, assignPrivateIpAddressesResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkInterfaceId, privateIpSet, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignPrivateIpAddressesResponse {\n");
    
    sb.append("    networkInterfaceId: ").append(toIndentedString(networkInterfaceId)).append("\n");
    sb.append("    privateIpSet: ").append(toIndentedString(privateIpSet)).append("\n");
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
