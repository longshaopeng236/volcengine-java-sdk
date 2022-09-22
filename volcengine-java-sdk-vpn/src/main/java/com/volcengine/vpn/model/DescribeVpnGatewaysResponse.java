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

package com.volcengine.vpn.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpn.model.VpnGatewayForDescribeVpnGatewaysOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeVpnGatewaysResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:47.673068+08:00[Asia/Shanghai]")
public class DescribeVpnGatewaysResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  @SerializedName("VpnGateways")
  private List<VpnGatewayForDescribeVpnGatewaysOutput> vpnGateways = null;

  public DescribeVpnGatewaysResponse pageNumber(Integer pageNumber) {
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

  public DescribeVpnGatewaysResponse pageSize(Integer pageSize) {
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

  public DescribeVpnGatewaysResponse requestId(String requestId) {
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

  public DescribeVpnGatewaysResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public DescribeVpnGatewaysResponse vpnGateways(List<VpnGatewayForDescribeVpnGatewaysOutput> vpnGateways) {
    this.vpnGateways = vpnGateways;
    return this;
  }

  public DescribeVpnGatewaysResponse addVpnGatewaysItem(VpnGatewayForDescribeVpnGatewaysOutput vpnGatewaysItem) {
    if (this.vpnGateways == null) {
      this.vpnGateways = new ArrayList<VpnGatewayForDescribeVpnGatewaysOutput>();
    }
    this.vpnGateways.add(vpnGatewaysItem);
    return this;
  }

   /**
   * Get vpnGateways
   * @return vpnGateways
  **/
  @Valid
  @Schema(description = "")
  public List<VpnGatewayForDescribeVpnGatewaysOutput> getVpnGateways() {
    return vpnGateways;
  }

  public void setVpnGateways(List<VpnGatewayForDescribeVpnGatewaysOutput> vpnGateways) {
    this.vpnGateways = vpnGateways;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeVpnGatewaysResponse describeVpnGatewaysResponse = (DescribeVpnGatewaysResponse) o;
    return Objects.equals(this.pageNumber, describeVpnGatewaysResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeVpnGatewaysResponse.pageSize) &&
        Objects.equals(this.requestId, describeVpnGatewaysResponse.requestId) &&
        Objects.equals(this.totalCount, describeVpnGatewaysResponse.totalCount) &&
        Objects.equals(this.vpnGateways, describeVpnGatewaysResponse.vpnGateways);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, requestId, totalCount, vpnGateways);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeVpnGatewaysResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    vpnGateways: ").append(toIndentedString(vpnGateways)).append("\n");
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
