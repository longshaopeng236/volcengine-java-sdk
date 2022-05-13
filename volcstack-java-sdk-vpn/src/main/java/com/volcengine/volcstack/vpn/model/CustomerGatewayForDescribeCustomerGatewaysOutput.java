/*
 * vpn
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.vpn.model;

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
 * CustomerGatewayForDescribeCustomerGatewaysOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:45.779409+08:00[Asia/Shanghai]")
public class CustomerGatewayForDescribeCustomerGatewaysOutput {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("ConnectionCount")
  private Integer connectionCount = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("CustomerGatewayId")
  private String customerGatewayId = null;

  @SerializedName("CustomerGatewayName")
  private String customerGatewayName = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public CustomerGatewayForDescribeCustomerGatewaysOutput accountId(String accountId) {
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

  public CustomerGatewayForDescribeCustomerGatewaysOutput connectionCount(Integer connectionCount) {
    this.connectionCount = connectionCount;
    return this;
  }

   /**
   * Get connectionCount
   * @return connectionCount
  **/
  @Schema(description = "")
  public Integer getConnectionCount() {
    return connectionCount;
  }

  public void setConnectionCount(Integer connectionCount) {
    this.connectionCount = connectionCount;
  }

  public CustomerGatewayForDescribeCustomerGatewaysOutput creationTime(String creationTime) {
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

  public CustomerGatewayForDescribeCustomerGatewaysOutput customerGatewayId(String customerGatewayId) {
    this.customerGatewayId = customerGatewayId;
    return this;
  }

   /**
   * Get customerGatewayId
   * @return customerGatewayId
  **/
  @Schema(description = "")
  public String getCustomerGatewayId() {
    return customerGatewayId;
  }

  public void setCustomerGatewayId(String customerGatewayId) {
    this.customerGatewayId = customerGatewayId;
  }

  public CustomerGatewayForDescribeCustomerGatewaysOutput customerGatewayName(String customerGatewayName) {
    this.customerGatewayName = customerGatewayName;
    return this;
  }

   /**
   * Get customerGatewayName
   * @return customerGatewayName
  **/
  @Schema(description = "")
  public String getCustomerGatewayName() {
    return customerGatewayName;
  }

  public void setCustomerGatewayName(String customerGatewayName) {
    this.customerGatewayName = customerGatewayName;
  }

  public CustomerGatewayForDescribeCustomerGatewaysOutput description(String description) {
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

  public CustomerGatewayForDescribeCustomerGatewaysOutput ipAddress(String ipAddress) {
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

  public CustomerGatewayForDescribeCustomerGatewaysOutput status(String status) {
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

  public CustomerGatewayForDescribeCustomerGatewaysOutput updateTime(String updateTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerGatewayForDescribeCustomerGatewaysOutput customerGatewayForDescribeCustomerGatewaysOutput = (CustomerGatewayForDescribeCustomerGatewaysOutput) o;
    return Objects.equals(this.accountId, customerGatewayForDescribeCustomerGatewaysOutput.accountId) &&
        Objects.equals(this.connectionCount, customerGatewayForDescribeCustomerGatewaysOutput.connectionCount) &&
        Objects.equals(this.creationTime, customerGatewayForDescribeCustomerGatewaysOutput.creationTime) &&
        Objects.equals(this.customerGatewayId, customerGatewayForDescribeCustomerGatewaysOutput.customerGatewayId) &&
        Objects.equals(this.customerGatewayName, customerGatewayForDescribeCustomerGatewaysOutput.customerGatewayName) &&
        Objects.equals(this.description, customerGatewayForDescribeCustomerGatewaysOutput.description) &&
        Objects.equals(this.ipAddress, customerGatewayForDescribeCustomerGatewaysOutput.ipAddress) &&
        Objects.equals(this.status, customerGatewayForDescribeCustomerGatewaysOutput.status) &&
        Objects.equals(this.updateTime, customerGatewayForDescribeCustomerGatewaysOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, connectionCount, creationTime, customerGatewayId, customerGatewayName, description, ipAddress, status, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerGatewayForDescribeCustomerGatewaysOutput {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    connectionCount: ").append(toIndentedString(connectionCount)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    customerGatewayId: ").append(toIndentedString(customerGatewayId)).append("\n");
    sb.append("    customerGatewayName: ").append(toIndentedString(customerGatewayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
