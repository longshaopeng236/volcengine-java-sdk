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
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeVpnConnectionsRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:56.495960+08:00[Asia/Shanghai]")
public class DescribeVpnConnectionsRequest {
  @SerializedName("CustomerGatewayId")
  private String customerGatewayId = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("VpnConnectionIds")
  private List<String> vpnConnectionIds = null;

  @SerializedName("VpnConnectionName")
  private String vpnConnectionName = null;

  @SerializedName("VpnGatewayId")
  private String vpnGatewayId = null;

  public DescribeVpnConnectionsRequest customerGatewayId(String customerGatewayId) {
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

  public DescribeVpnConnectionsRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @Schema(description = "")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public DescribeVpnConnectionsRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DescribeVpnConnectionsRequest status(String status) {
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

  public DescribeVpnConnectionsRequest vpnConnectionIds(List<String> vpnConnectionIds) {
    this.vpnConnectionIds = vpnConnectionIds;
    return this;
  }

  public DescribeVpnConnectionsRequest addVpnConnectionIdsItem(String vpnConnectionIdsItem) {
    if (this.vpnConnectionIds == null) {
      this.vpnConnectionIds = new ArrayList<String>();
    }
    this.vpnConnectionIds.add(vpnConnectionIdsItem);
    return this;
  }

   /**
   * Get vpnConnectionIds
   * @return vpnConnectionIds
  **/
  @Schema(description = "")
  public List<String> getVpnConnectionIds() {
    return vpnConnectionIds;
  }

  public void setVpnConnectionIds(List<String> vpnConnectionIds) {
    this.vpnConnectionIds = vpnConnectionIds;
  }

  public DescribeVpnConnectionsRequest vpnConnectionName(String vpnConnectionName) {
    this.vpnConnectionName = vpnConnectionName;
    return this;
  }

   /**
   * Get vpnConnectionName
   * @return vpnConnectionName
  **/
  @Schema(description = "")
  public String getVpnConnectionName() {
    return vpnConnectionName;
  }

  public void setVpnConnectionName(String vpnConnectionName) {
    this.vpnConnectionName = vpnConnectionName;
  }

  public DescribeVpnConnectionsRequest vpnGatewayId(String vpnGatewayId) {
    this.vpnGatewayId = vpnGatewayId;
    return this;
  }

   /**
   * Get vpnGatewayId
   * @return vpnGatewayId
  **/
  @Schema(description = "")
  public String getVpnGatewayId() {
    return vpnGatewayId;
  }

  public void setVpnGatewayId(String vpnGatewayId) {
    this.vpnGatewayId = vpnGatewayId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVpnConnectionsRequest describeVpnConnectionsRequest = (DescribeVpnConnectionsRequest) o;
    return Objects.equals(this.customerGatewayId, describeVpnConnectionsRequest.customerGatewayId) &&
        Objects.equals(this.pageNumber, describeVpnConnectionsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeVpnConnectionsRequest.pageSize) &&
        Objects.equals(this.status, describeVpnConnectionsRequest.status) &&
        Objects.equals(this.vpnConnectionIds, describeVpnConnectionsRequest.vpnConnectionIds) &&
        Objects.equals(this.vpnConnectionName, describeVpnConnectionsRequest.vpnConnectionName) &&
        Objects.equals(this.vpnGatewayId, describeVpnConnectionsRequest.vpnGatewayId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerGatewayId, pageNumber, pageSize, status, vpnConnectionIds, vpnConnectionName, vpnGatewayId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVpnConnectionsRequest {\n");
    
    sb.append("    customerGatewayId: ").append(toIndentedString(customerGatewayId)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    vpnConnectionIds: ").append(toIndentedString(vpnConnectionIds)).append("\n");
    sb.append("    vpnConnectionName: ").append(toIndentedString(vpnConnectionName)).append("\n");
    sb.append("    vpnGatewayId: ").append(toIndentedString(vpnGatewayId)).append("\n");
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
