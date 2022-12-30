/*
 * alb
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.alb.model;

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
 * DescribeListenersRequest
 */


public class DescribeListenersRequest {
  @SerializedName("ListenerIds")
  private List<String> listenerIds = null;

  @SerializedName("ListenerName")
  private String listenerName = null;

  @SerializedName("LoadBalancerId")
  private String loadBalancerId = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  public DescribeListenersRequest listenerIds(List<String> listenerIds) {
    this.listenerIds = listenerIds;
    return this;
  }

  public DescribeListenersRequest addListenerIdsItem(String listenerIdsItem) {
    if (this.listenerIds == null) {
      this.listenerIds = new ArrayList<String>();
    }
    this.listenerIds.add(listenerIdsItem);
    return this;
  }

   /**
   * Get listenerIds
   * @return listenerIds
  **/
  @Schema(description = "")
  public List<String> getListenerIds() {
    return listenerIds;
  }

  public void setListenerIds(List<String> listenerIds) {
    this.listenerIds = listenerIds;
  }

  public DescribeListenersRequest listenerName(String listenerName) {
    this.listenerName = listenerName;
    return this;
  }

   /**
   * Get listenerName
   * @return listenerName
  **/
  @Schema(description = "")
  public String getListenerName() {
    return listenerName;
  }

  public void setListenerName(String listenerName) {
    this.listenerName = listenerName;
  }

  public DescribeListenersRequest loadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
    return this;
  }

   /**
   * Get loadBalancerId
   * @return loadBalancerId
  **/
  @Schema(description = "")
  public String getLoadBalancerId() {
    return loadBalancerId;
  }

  public void setLoadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
  }

  public DescribeListenersRequest pageNumber(Integer pageNumber) {
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

  public DescribeListenersRequest pageSize(Integer pageSize) {
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

  public DescribeListenersRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeListenersRequest describeListenersRequest = (DescribeListenersRequest) o;
    return Objects.equals(this.listenerIds, describeListenersRequest.listenerIds) &&
        Objects.equals(this.listenerName, describeListenersRequest.listenerName) &&
        Objects.equals(this.loadBalancerId, describeListenersRequest.loadBalancerId) &&
        Objects.equals(this.pageNumber, describeListenersRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeListenersRequest.pageSize) &&
        Objects.equals(this.projectName, describeListenersRequest.projectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listenerIds, listenerName, loadBalancerId, pageNumber, pageSize, projectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeListenersRequest {\n");
    
    sb.append("    listenerIds: ").append(toIndentedString(listenerIds)).append("\n");
    sb.append("    listenerName: ").append(toIndentedString(listenerName)).append("\n");
    sb.append("    loadBalancerId: ").append(toIndentedString(loadBalancerId)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
