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

package com.volcengine.clb.model;

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
 * DescribeLoadBalancersRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:22:55.791591+08:00[Asia/Shanghai]")
public class DescribeLoadBalancersRequest {
  @SerializedName("EniAddress")
  private String eniAddress = null;

  @SerializedName("LoadBalancerIds")
  private List<String> loadBalancerIds = null;

  @SerializedName("LoadBalancerName")
  private String loadBalancerName = null;

  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageSize")
  private Integer pageSize = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public DescribeLoadBalancersRequest eniAddress(String eniAddress) {
    this.eniAddress = eniAddress;
    return this;
  }

   /**
   * Get eniAddress
   * @return eniAddress
  **/
  @Schema(description = "")
  public String getEniAddress() {
    return eniAddress;
  }

  public void setEniAddress(String eniAddress) {
    this.eniAddress = eniAddress;
  }

  public DescribeLoadBalancersRequest loadBalancerIds(List<String> loadBalancerIds) {
    this.loadBalancerIds = loadBalancerIds;
    return this;
  }

  public DescribeLoadBalancersRequest addLoadBalancerIdsItem(String loadBalancerIdsItem) {
    if (this.loadBalancerIds == null) {
      this.loadBalancerIds = new ArrayList<String>();
    }
    this.loadBalancerIds.add(loadBalancerIdsItem);
    return this;
  }

   /**
   * Get loadBalancerIds
   * @return loadBalancerIds
  **/
  @Schema(description = "")
  public List<String> getLoadBalancerIds() {
    return loadBalancerIds;
  }

  public void setLoadBalancerIds(List<String> loadBalancerIds) {
    this.loadBalancerIds = loadBalancerIds;
  }

  public DescribeLoadBalancersRequest loadBalancerName(String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
    return this;
  }

   /**
   * Get loadBalancerName
   * @return loadBalancerName
  **/
  @Schema(description = "")
  public String getLoadBalancerName() {
    return loadBalancerName;
  }

  public void setLoadBalancerName(String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
  }

  public DescribeLoadBalancersRequest pageNumber(Integer pageNumber) {
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

  public DescribeLoadBalancersRequest pageSize(Integer pageSize) {
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

  public DescribeLoadBalancersRequest vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeLoadBalancersRequest describeLoadBalancersRequest = (DescribeLoadBalancersRequest) o;
    return Objects.equals(this.eniAddress, describeLoadBalancersRequest.eniAddress) &&
        Objects.equals(this.loadBalancerIds, describeLoadBalancersRequest.loadBalancerIds) &&
        Objects.equals(this.loadBalancerName, describeLoadBalancersRequest.loadBalancerName) &&
        Objects.equals(this.pageNumber, describeLoadBalancersRequest.pageNumber) &&
        Objects.equals(this.pageSize, describeLoadBalancersRequest.pageSize) &&
        Objects.equals(this.vpcId, describeLoadBalancersRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eniAddress, loadBalancerIds, loadBalancerName, pageNumber, pageSize, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeLoadBalancersRequest {\n");
    
    sb.append("    eniAddress: ").append(toIndentedString(eniAddress)).append("\n");
    sb.append("    loadBalancerIds: ").append(toIndentedString(loadBalancerIds)).append("\n");
    sb.append("    loadBalancerName: ").append(toIndentedString(loadBalancerName)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
