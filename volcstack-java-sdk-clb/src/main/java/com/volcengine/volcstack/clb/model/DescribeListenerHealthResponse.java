/*
 * clb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.clb.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.volcstack.clb.model.ResultForDescribeListenerHealthOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeListenerHealthResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:21.106708+08:00[Asia/Shanghai]")
public class DescribeListenerHealthResponse {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("Results")
  private List<ResultForDescribeListenerHealthOutput> results = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  @SerializedName("UnHealthyCount")
  private Integer unHealthyCount = null;

  public DescribeListenerHealthResponse pageNumber(Integer pageNumber) {
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

  public DescribeListenerHealthResponse pageSize(Integer pageSize) {
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

  public DescribeListenerHealthResponse requestId(String requestId) {
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

  public DescribeListenerHealthResponse results(List<ResultForDescribeListenerHealthOutput> results) {
    this.results = results;
    return this;
  }

  public DescribeListenerHealthResponse addResultsItem(ResultForDescribeListenerHealthOutput resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<ResultForDescribeListenerHealthOutput>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @Valid
  @Schema(description = "")
  public List<ResultForDescribeListenerHealthOutput> getResults() {
    return results;
  }

  public void setResults(List<ResultForDescribeListenerHealthOutput> results) {
    this.results = results;
  }

  public DescribeListenerHealthResponse status(String status) {
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

  public DescribeListenerHealthResponse totalCount(Integer totalCount) {
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

  public DescribeListenerHealthResponse unHealthyCount(Integer unHealthyCount) {
    this.unHealthyCount = unHealthyCount;
    return this;
  }

   /**
   * Get unHealthyCount
   * @return unHealthyCount
  **/
  @Schema(description = "")
  public Integer getUnHealthyCount() {
    return unHealthyCount;
  }

  public void setUnHealthyCount(Integer unHealthyCount) {
    this.unHealthyCount = unHealthyCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeListenerHealthResponse describeListenerHealthResponse = (DescribeListenerHealthResponse) o;
    return Objects.equals(this.pageNumber, describeListenerHealthResponse.pageNumber) &&
        Objects.equals(this.pageSize, describeListenerHealthResponse.pageSize) &&
        Objects.equals(this.requestId, describeListenerHealthResponse.requestId) &&
        Objects.equals(this.results, describeListenerHealthResponse.results) &&
        Objects.equals(this.status, describeListenerHealthResponse.status) &&
        Objects.equals(this.totalCount, describeListenerHealthResponse.totalCount) &&
        Objects.equals(this.unHealthyCount, describeListenerHealthResponse.unHealthyCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, requestId, results, status, totalCount, unHealthyCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeListenerHealthResponse {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    unHealthyCount: ").append(toIndentedString(unHealthyCount)).append("\n");
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
