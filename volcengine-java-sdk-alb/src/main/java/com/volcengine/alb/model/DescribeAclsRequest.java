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
 * DescribeAclsRequest
 */


public class DescribeAclsRequest {
  @SerializedName("AclIds")
  private List<String> aclIds = null;

  @SerializedName("AclName")
  private String aclName = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  public DescribeAclsRequest aclIds(List<String> aclIds) {
    this.aclIds = aclIds;
    return this;
  }

  public DescribeAclsRequest addAclIdsItem(String aclIdsItem) {
    if (this.aclIds == null) {
      this.aclIds = new ArrayList<String>();
    }
    this.aclIds.add(aclIdsItem);
    return this;
  }

   /**
   * Get aclIds
   * @return aclIds
  **/
  @Schema(description = "")
  public List<String> getAclIds() {
    return aclIds;
  }

  public void setAclIds(List<String> aclIds) {
    this.aclIds = aclIds;
  }

  public DescribeAclsRequest aclName(String aclName) {
    this.aclName = aclName;
    return this;
  }

   /**
   * Get aclName
   * @return aclName
  **/
  @Schema(description = "")
  public String getAclName() {
    return aclName;
  }

  public void setAclName(String aclName) {
    this.aclName = aclName;
  }

  public DescribeAclsRequest pageNumber(Integer pageNumber) {
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

  public DescribeAclsRequest pageSize(Integer pageSize) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeAclsRequest describeAclsRequest = (DescribeAclsRequest) o;
    return Objects.equals(this.aclIds, describeAclsRequest.aclIds) &&
        Objects.equals(this.aclName, describeAclsRequest.aclName) &&
        Objects.equals(this.pageNumber, describeAclsRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeAclsRequest.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aclIds, aclName, pageNumber, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeAclsRequest {\n");
    
    sb.append("    aclIds: ").append(toIndentedString(aclIds)).append("\n");
    sb.append("    aclName: ").append(toIndentedString(aclName)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
