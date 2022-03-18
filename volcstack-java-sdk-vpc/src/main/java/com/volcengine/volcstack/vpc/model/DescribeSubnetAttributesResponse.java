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
import com.volcengine.volcstack.vpc.model.RouteTableForDescribeSubnetAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DescribeSubnetAttributesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-18T20:48:24.268703+08:00[Asia/Shanghai]")
public class DescribeSubnetAttributesResponse {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("AvailableIpAddressCount")
  private Integer availableIpAddressCount = null;

  @SerializedName("CidrBlock")
  private String cidrBlock = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("RouteTable")
  private RouteTableForDescribeSubnetAttributesOutput routeTable = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubnetId")
  private String subnetId = null;

  @SerializedName("SubnetName")
  private String subnetName = null;

  @SerializedName("TotalIpv4Count")
  private Integer totalIpv4Count = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public DescribeSubnetAttributesResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public DescribeSubnetAttributesResponse availableIpAddressCount(Integer availableIpAddressCount) {
    this.availableIpAddressCount = availableIpAddressCount;
    return this;
  }

   /**
   * Get availableIpAddressCount
   * @return availableIpAddressCount
  **/
  @Schema(description = "")
  public Integer getAvailableIpAddressCount() {
    return availableIpAddressCount;
  }

  public void setAvailableIpAddressCount(Integer availableIpAddressCount) {
    this.availableIpAddressCount = availableIpAddressCount;
  }

  public DescribeSubnetAttributesResponse cidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
    return this;
  }

   /**
   * Get cidrBlock
   * @return cidrBlock
  **/
  @Schema(description = "")
  public String getCidrBlock() {
    return cidrBlock;
  }

  public void setCidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
  }

  public DescribeSubnetAttributesResponse creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public DescribeSubnetAttributesResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DescribeSubnetAttributesResponse requestId(String requestId) {
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

  public DescribeSubnetAttributesResponse routeTable(RouteTableForDescribeSubnetAttributesOutput routeTable) {
    this.routeTable = routeTable;
    return this;
  }

   /**
   * Get routeTable
   * @return routeTable
  **/
  @Schema(description = "")
  public RouteTableForDescribeSubnetAttributesOutput getRouteTable() {
    return routeTable;
  }

  public void setRouteTable(RouteTableForDescribeSubnetAttributesOutput routeTable) {
    this.routeTable = routeTable;
  }

  public DescribeSubnetAttributesResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DescribeSubnetAttributesResponse subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @Schema(description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public DescribeSubnetAttributesResponse subnetName(String subnetName) {
    this.subnetName = subnetName;
    return this;
  }

   /**
   * Get subnetName
   * @return subnetName
  **/
  @Schema(description = "")
  public String getSubnetName() {
    return subnetName;
  }

  public void setSubnetName(String subnetName) {
    this.subnetName = subnetName;
  }

  public DescribeSubnetAttributesResponse totalIpv4Count(Integer totalIpv4Count) {
    this.totalIpv4Count = totalIpv4Count;
    return this;
  }

   /**
   * Get totalIpv4Count
   * @return totalIpv4Count
  **/
  @Schema(description = "")
  public Integer getTotalIpv4Count() {
    return totalIpv4Count;
  }

  public void setTotalIpv4Count(Integer totalIpv4Count) {
    this.totalIpv4Count = totalIpv4Count;
  }

  public DescribeSubnetAttributesResponse updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public DescribeSubnetAttributesResponse vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }

  public DescribeSubnetAttributesResponse zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeSubnetAttributesResponse describeSubnetAttributesResponse = (DescribeSubnetAttributesResponse) o;
    return Objects.equals(this.accountId, describeSubnetAttributesResponse.accountId) &&
        Objects.equals(this.availableIpAddressCount, describeSubnetAttributesResponse.availableIpAddressCount) &&
        Objects.equals(this.cidrBlock, describeSubnetAttributesResponse.cidrBlock) &&
        Objects.equals(this.creationTime, describeSubnetAttributesResponse.creationTime) &&
        Objects.equals(this.description, describeSubnetAttributesResponse.description) &&
        Objects.equals(this.requestId, describeSubnetAttributesResponse.requestId) &&
        Objects.equals(this.routeTable, describeSubnetAttributesResponse.routeTable) &&
        Objects.equals(this.status, describeSubnetAttributesResponse.status) &&
        Objects.equals(this.subnetId, describeSubnetAttributesResponse.subnetId) &&
        Objects.equals(this.subnetName, describeSubnetAttributesResponse.subnetName) &&
        Objects.equals(this.totalIpv4Count, describeSubnetAttributesResponse.totalIpv4Count) &&
        Objects.equals(this.updateTime, describeSubnetAttributesResponse.updateTime) &&
        Objects.equals(this.vpcId, describeSubnetAttributesResponse.vpcId) &&
        Objects.equals(this.zoneId, describeSubnetAttributesResponse.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, availableIpAddressCount, cidrBlock, creationTime, description, requestId, routeTable, status, subnetId, subnetName, totalIpv4Count, updateTime, vpcId, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSubnetAttributesResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    availableIpAddressCount: ").append(toIndentedString(availableIpAddressCount)).append("\n");
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    routeTable: ").append(toIndentedString(routeTable)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
    sb.append("    totalIpv4Count: ").append(toIndentedString(totalIpv4Count)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
