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
 * DescribeServerGroupsRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-18T11:53:48.716788+08:00[Asia/Shanghai]")
public class DescribeServerGroupsRequest {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("ServerGroupIds")
  private List<String> serverGroupIds = null;

  @SerializedName("ServerGroupNames")
  private List<String> serverGroupNames = null;

  @SerializedName("VpcID")
  private String vpcID = null;

  public DescribeServerGroupsRequest pageNumber(Integer pageNumber) {
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

  public DescribeServerGroupsRequest pageSize(Integer pageSize) {
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

  public DescribeServerGroupsRequest serverGroupIds(List<String> serverGroupIds) {
    this.serverGroupIds = serverGroupIds;
    return this;
  }

  public DescribeServerGroupsRequest addServerGroupIdsItem(String serverGroupIdsItem) {
    if (this.serverGroupIds == null) {
      this.serverGroupIds = new ArrayList<String>();
    }
    this.serverGroupIds.add(serverGroupIdsItem);
    return this;
  }

   /**
   * Get serverGroupIds
   * @return serverGroupIds
  **/
  @Schema(description = "")
  public List<String> getServerGroupIds() {
    return serverGroupIds;
  }

  public void setServerGroupIds(List<String> serverGroupIds) {
    this.serverGroupIds = serverGroupIds;
  }

  public DescribeServerGroupsRequest serverGroupNames(List<String> serverGroupNames) {
    this.serverGroupNames = serverGroupNames;
    return this;
  }

  public DescribeServerGroupsRequest addServerGroupNamesItem(String serverGroupNamesItem) {
    if (this.serverGroupNames == null) {
      this.serverGroupNames = new ArrayList<String>();
    }
    this.serverGroupNames.add(serverGroupNamesItem);
    return this;
  }

   /**
   * Get serverGroupNames
   * @return serverGroupNames
  **/
  @Schema(description = "")
  public List<String> getServerGroupNames() {
    return serverGroupNames;
  }

  public void setServerGroupNames(List<String> serverGroupNames) {
    this.serverGroupNames = serverGroupNames;
  }

  public DescribeServerGroupsRequest vpcID(String vpcID) {
    this.vpcID = vpcID;
    return this;
  }

   /**
   * Get vpcID
   * @return vpcID
  **/
  @Schema(description = "")
  public String getVpcID() {
    return vpcID;
  }

  public void setVpcID(String vpcID) {
    this.vpcID = vpcID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeServerGroupsRequest describeServerGroupsRequest = (DescribeServerGroupsRequest) o;
    return Objects.equals(this.pageNumber, describeServerGroupsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeServerGroupsRequest.pageSize) &&
        Objects.equals(this.serverGroupIds, describeServerGroupsRequest.serverGroupIds) &&
        Objects.equals(this.serverGroupNames, describeServerGroupsRequest.serverGroupNames) &&
        Objects.equals(this.vpcID, describeServerGroupsRequest.vpcID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, serverGroupIds, serverGroupNames, vpcID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeServerGroupsRequest {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    serverGroupIds: ").append(toIndentedString(serverGroupIds)).append("\n");
    sb.append("    serverGroupNames: ").append(toIndentedString(serverGroupNames)).append("\n");
    sb.append("    vpcID: ").append(toIndentedString(vpcID)).append("\n");
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
