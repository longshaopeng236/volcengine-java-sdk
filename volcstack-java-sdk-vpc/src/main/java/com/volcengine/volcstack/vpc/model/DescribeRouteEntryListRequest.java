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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DescribeRouteEntryListRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-18T20:48:24.268703+08:00[Asia/Shanghai]")
public class DescribeRouteEntryListRequest {
  @SerializedName("DestinationCidrBlock")
  private String destinationCidrBlock = null;

  @SerializedName("NextHopId")
  private String nextHopId = null;

  @SerializedName("NextHopType")
  private String nextHopType = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RouteEntryId")
  private String routeEntryId = null;

  @SerializedName("RouteEntryName")
  private String routeEntryName = null;

  @SerializedName("RouteEntryType")
  private String routeEntryType = null;

  @SerializedName("RouteTableId")
  private String routeTableId = null;

  public DescribeRouteEntryListRequest destinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
    return this;
  }

   /**
   * Get destinationCidrBlock
   * @return destinationCidrBlock
  **/
  @Schema(description = "")
  public String getDestinationCidrBlock() {
    return destinationCidrBlock;
  }

  public void setDestinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
  }

  public DescribeRouteEntryListRequest nextHopId(String nextHopId) {
    this.nextHopId = nextHopId;
    return this;
  }

   /**
   * Get nextHopId
   * @return nextHopId
  **/
  @Schema(description = "")
  public String getNextHopId() {
    return nextHopId;
  }

  public void setNextHopId(String nextHopId) {
    this.nextHopId = nextHopId;
  }

  public DescribeRouteEntryListRequest nextHopType(String nextHopType) {
    this.nextHopType = nextHopType;
    return this;
  }

   /**
   * Get nextHopType
   * @return nextHopType
  **/
  @Schema(description = "")
  public String getNextHopType() {
    return nextHopType;
  }

  public void setNextHopType(String nextHopType) {
    this.nextHopType = nextHopType;
  }

  public DescribeRouteEntryListRequest pageNumber(Integer pageNumber) {
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

  public DescribeRouteEntryListRequest pageSize(Integer pageSize) {
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

  public DescribeRouteEntryListRequest routeEntryId(String routeEntryId) {
    this.routeEntryId = routeEntryId;
    return this;
  }

   /**
   * Get routeEntryId
   * @return routeEntryId
  **/
  @Schema(description = "")
  public String getRouteEntryId() {
    return routeEntryId;
  }

  public void setRouteEntryId(String routeEntryId) {
    this.routeEntryId = routeEntryId;
  }

  public DescribeRouteEntryListRequest routeEntryName(String routeEntryName) {
    this.routeEntryName = routeEntryName;
    return this;
  }

   /**
   * Get routeEntryName
   * @return routeEntryName
  **/
  @Schema(description = "")
  public String getRouteEntryName() {
    return routeEntryName;
  }

  public void setRouteEntryName(String routeEntryName) {
    this.routeEntryName = routeEntryName;
  }

  public DescribeRouteEntryListRequest routeEntryType(String routeEntryType) {
    this.routeEntryType = routeEntryType;
    return this;
  }

   /**
   * Get routeEntryType
   * @return routeEntryType
  **/
  @Schema(description = "")
  public String getRouteEntryType() {
    return routeEntryType;
  }

  public void setRouteEntryType(String routeEntryType) {
    this.routeEntryType = routeEntryType;
  }

  public DescribeRouteEntryListRequest routeTableId(String routeTableId) {
    this.routeTableId = routeTableId;
    return this;
  }

   /**
   * Get routeTableId
   * @return routeTableId
  **/
  @Schema(description = "")
  public String getRouteTableId() {
    return routeTableId;
  }

  public void setRouteTableId(String routeTableId) {
    this.routeTableId = routeTableId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeRouteEntryListRequest describeRouteEntryListRequest = (DescribeRouteEntryListRequest) o;
    return Objects.equals(this.destinationCidrBlock, describeRouteEntryListRequest.destinationCidrBlock) &&
        Objects.equals(this.nextHopId, describeRouteEntryListRequest.nextHopId) &&
        Objects.equals(this.nextHopType, describeRouteEntryListRequest.nextHopType) &&
        Objects.equals(this.pageNumber, describeRouteEntryListRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeRouteEntryListRequest.pageSize) &&
        Objects.equals(this.routeEntryId, describeRouteEntryListRequest.routeEntryId) &&
        Objects.equals(this.routeEntryName, describeRouteEntryListRequest.routeEntryName) &&
        Objects.equals(this.routeEntryType, describeRouteEntryListRequest.routeEntryType) &&
        Objects.equals(this.routeTableId, describeRouteEntryListRequest.routeTableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationCidrBlock, nextHopId, nextHopType, pageNumber, pageSize, routeEntryId, routeEntryName, routeEntryType, routeTableId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeRouteEntryListRequest {\n");
    
    sb.append("    destinationCidrBlock: ").append(toIndentedString(destinationCidrBlock)).append("\n");
    sb.append("    nextHopId: ").append(toIndentedString(nextHopId)).append("\n");
    sb.append("    nextHopType: ").append(toIndentedString(nextHopType)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    routeEntryId: ").append(toIndentedString(routeEntryId)).append("\n");
    sb.append("    routeEntryName: ").append(toIndentedString(routeEntryName)).append("\n");
    sb.append("    routeEntryType: ").append(toIndentedString(routeEntryType)).append("\n");
    sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
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
