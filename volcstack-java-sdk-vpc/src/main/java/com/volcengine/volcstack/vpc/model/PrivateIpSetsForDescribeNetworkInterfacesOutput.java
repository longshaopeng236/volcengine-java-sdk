/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcstack.vpc.model.PrivateIpSetForDescribeNetworkInterfacesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PrivateIpSetsForDescribeNetworkInterfacesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-18T20:48:24.268703+08:00[Asia/Shanghai]")
public class PrivateIpSetsForDescribeNetworkInterfacesOutput {
  @SerializedName("PrivateIpSet")
  private List<PrivateIpSetForDescribeNetworkInterfacesOutput> privateIpSet = null;

  public PrivateIpSetsForDescribeNetworkInterfacesOutput privateIpSet(List<PrivateIpSetForDescribeNetworkInterfacesOutput> privateIpSet) {
    this.privateIpSet = privateIpSet;
    return this;
  }

  public PrivateIpSetsForDescribeNetworkInterfacesOutput addPrivateIpSetItem(PrivateIpSetForDescribeNetworkInterfacesOutput privateIpSetItem) {
    if (this.privateIpSet == null) {
      this.privateIpSet = new ArrayList<PrivateIpSetForDescribeNetworkInterfacesOutput>();
    }
    this.privateIpSet.add(privateIpSetItem);
    return this;
  }

   /**
   * Get privateIpSet
   * @return privateIpSet
  **/
  @Schema(description = "")
  public List<PrivateIpSetForDescribeNetworkInterfacesOutput> getPrivateIpSet() {
    return privateIpSet;
  }

  public void setPrivateIpSet(List<PrivateIpSetForDescribeNetworkInterfacesOutput> privateIpSet) {
    this.privateIpSet = privateIpSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateIpSetsForDescribeNetworkInterfacesOutput privateIpSetsForDescribeNetworkInterfacesOutput = (PrivateIpSetsForDescribeNetworkInterfacesOutput) o;
    return Objects.equals(this.privateIpSet, privateIpSetsForDescribeNetworkInterfacesOutput.privateIpSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateIpSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateIpSetsForDescribeNetworkInterfacesOutput {\n");
    
    sb.append("    privateIpSet: ").append(toIndentedString(privateIpSet)).append("\n");
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
