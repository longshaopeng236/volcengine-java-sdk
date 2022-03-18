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
import com.volcengine.volcstack.vpc.model.RouteEntryForDescribeRouteEntryListOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DescribeRouteEntryListResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-18T20:48:24.268703+08:00[Asia/Shanghai]")
public class DescribeRouteEntryListResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("RouteEntries")
  private List<RouteEntryForDescribeRouteEntryListOutput> routeEntries = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeRouteEntryListResponse pageNumber(Integer pageNumber) {
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

  public DescribeRouteEntryListResponse pageSize(Integer pageSize) {
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

  public DescribeRouteEntryListResponse requestId(String requestId) {
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

  public DescribeRouteEntryListResponse routeEntries(List<RouteEntryForDescribeRouteEntryListOutput> routeEntries) {
    this.routeEntries = routeEntries;
    return this;
  }

  public DescribeRouteEntryListResponse addRouteEntriesItem(RouteEntryForDescribeRouteEntryListOutput routeEntriesItem) {
    if (this.routeEntries == null) {
      this.routeEntries = new ArrayList<RouteEntryForDescribeRouteEntryListOutput>();
    }
    this.routeEntries.add(routeEntriesItem);
    return this;
  }

   /**
   * Get routeEntries
   * @return routeEntries
  **/
  @Schema(description = "")
  public List<RouteEntryForDescribeRouteEntryListOutput> getRouteEntries() {
    return routeEntries;
  }

  public void setRouteEntries(List<RouteEntryForDescribeRouteEntryListOutput> routeEntries) {
    this.routeEntries = routeEntries;
  }

  public DescribeRouteEntryListResponse totalCount(Integer totalCount) {
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
    DescribeRouteEntryListResponse describeRouteEntryListResponse = (DescribeRouteEntryListResponse) o;
    return Objects.equals(this.pageNumber, describeRouteEntryListResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeRouteEntryListResponse.pageSize) &&
        Objects.equals(this.requestId, describeRouteEntryListResponse.requestId) &&
        Objects.equals(this.routeEntries, describeRouteEntryListResponse.routeEntries) &&
        Objects.equals(this.totalCount, describeRouteEntryListResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, requestId, routeEntries, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeRouteEntryListResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    routeEntries: ").append(toIndentedString(routeEntries)).append("\n");
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
