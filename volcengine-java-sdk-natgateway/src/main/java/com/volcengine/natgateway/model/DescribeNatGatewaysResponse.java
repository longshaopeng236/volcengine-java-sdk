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

package com.volcengine.natgateway.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.natgateway.model.NatGatewayForDescribeNatGatewaysOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeNatGatewaysResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:42.841+08:00[Asia/Shanghai]")
public class DescribeNatGatewaysResponse {
  @SerializedName("NatGateways")
  private List<NatGatewayForDescribeNatGatewaysOutput> natGateways = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeNatGatewaysResponse natGateways(List<NatGatewayForDescribeNatGatewaysOutput> natGateways) {
    this.natGateways = natGateways;
    return this;
  }

  public DescribeNatGatewaysResponse addNatGatewaysItem(NatGatewayForDescribeNatGatewaysOutput natGatewaysItem) {
    if (this.natGateways == null) {
      this.natGateways = new ArrayList<NatGatewayForDescribeNatGatewaysOutput>();
    }
    this.natGateways.add(natGatewaysItem);
    return this;
  }

   /**
   * Get natGateways
   * @return natGateways
  **/
  @Valid
  @Schema(description = "")
  public List<NatGatewayForDescribeNatGatewaysOutput> getNatGateways() {
    return natGateways;
  }

  public void setNatGateways(List<NatGatewayForDescribeNatGatewaysOutput> natGateways) {
    this.natGateways = natGateways;
  }

  public DescribeNatGatewaysResponse pageNumber(Integer pageNumber) {
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

  public DescribeNatGatewaysResponse pageSize(Integer pageSize) {
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

  public DescribeNatGatewaysResponse requestId(String requestId) {
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

  public DescribeNatGatewaysResponse totalCount(Integer totalCount) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeNatGatewaysResponse describeNatGatewaysResponse = (DescribeNatGatewaysResponse) o;
    return Objects.equals(this.natGateways, describeNatGatewaysResponse.natGateways) &&
        Objects.equals(this.pageNumber, describeNatGatewaysResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeNatGatewaysResponse.pageSize) &&
        Objects.equals(this.requestId, describeNatGatewaysResponse.requestId) &&
        Objects.equals(this.totalCount, describeNatGatewaysResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(natGateways, pageNumber, pageSize, requestId, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeNatGatewaysResponse {\n");
    
    sb.append("    natGateways: ").append(toIndentedString(natGateways)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
