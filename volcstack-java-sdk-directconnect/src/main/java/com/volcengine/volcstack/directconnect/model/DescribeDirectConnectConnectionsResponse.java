/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.directconnect.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcstack.directconnect.model.DirectConnectConnectionForDescribeDirectConnectConnectionsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDirectConnectConnectionsResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:27.325524+08:00[Asia/Shanghai]")
public class DescribeDirectConnectConnectionsResponse {
  @SerializedName("DirectConnectConnections")
  private List<DirectConnectConnectionForDescribeDirectConnectConnectionsOutput> directConnectConnections = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  public DescribeDirectConnectConnectionsResponse directConnectConnections(List<DirectConnectConnectionForDescribeDirectConnectConnectionsOutput> directConnectConnections) {
    this.directConnectConnections = directConnectConnections;
    return this;
  }

  public DescribeDirectConnectConnectionsResponse addDirectConnectConnectionsItem(DirectConnectConnectionForDescribeDirectConnectConnectionsOutput directConnectConnectionsItem) {
    if (this.directConnectConnections == null) {
      this.directConnectConnections = new ArrayList<DirectConnectConnectionForDescribeDirectConnectConnectionsOutput>();
    }
    this.directConnectConnections.add(directConnectConnectionsItem);
    return this;
  }

   /**
   * Get directConnectConnections
   * @return directConnectConnections
  **/
  @Valid
  @Schema(description = "")
  public List<DirectConnectConnectionForDescribeDirectConnectConnectionsOutput> getDirectConnectConnections() {
    return directConnectConnections;
  }

  public void setDirectConnectConnections(List<DirectConnectConnectionForDescribeDirectConnectConnectionsOutput> directConnectConnections) {
    this.directConnectConnections = directConnectConnections;
  }

  public DescribeDirectConnectConnectionsResponse pageNumber(Integer pageNumber) {
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

  public DescribeDirectConnectConnectionsResponse pageSize(Integer pageSize) {
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

  public DescribeDirectConnectConnectionsResponse requestId(String requestId) {
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

  public DescribeDirectConnectConnectionsResponse totalCount(Integer totalCount) {
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
    DescribeDirectConnectConnectionsResponse describeDirectConnectConnectionsResponse = (DescribeDirectConnectConnectionsResponse) o;
    return Objects.equals(this.directConnectConnections, describeDirectConnectConnectionsResponse.directConnectConnections) &&
        Objects.equals(this.pageNumber, describeDirectConnectConnectionsResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeDirectConnectConnectionsResponse.pageSize) &&
        Objects.equals(this.requestId, describeDirectConnectConnectionsResponse.requestId) &&
        Objects.equals(this.totalCount, describeDirectConnectConnectionsResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directConnectConnections, pageNumber, pageSize, requestId, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDirectConnectConnectionsResponse {\n");
    
    sb.append("    directConnectConnections: ").append(toIndentedString(directConnectConnections)).append("\n");
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
