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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDirectConnectGatewayRouteAttributesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:28.121303+08:00[Asia/Shanghai]")
public class DescribeDirectConnectGatewayRouteAttributesResponse {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("DestinationCidrBlock")
  private String destinationCidrBlock = null;

  @SerializedName("DirectConnectGatewayId")
  private String directConnectGatewayId = null;

  @SerializedName("DirectConnectGatewayRouteId")
  private String directConnectGatewayRouteId = null;

  @SerializedName("NextHopId")
  private String nextHopId = null;

  @SerializedName("NextHopType")
  private String nextHopType = null;

  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("RouteType")
  private String routeType = null;

  @SerializedName("Status")
  private String status = null;

  public DescribeDirectConnectGatewayRouteAttributesResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public DescribeDirectConnectGatewayRouteAttributesResponse creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public DescribeDirectConnectGatewayRouteAttributesResponse destinationCidrBlock(String destinationCidrBlock) {
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

  public DescribeDirectConnectGatewayRouteAttributesResponse directConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
    return this;
  }

   /**
   * Get directConnectGatewayId
   * @return directConnectGatewayId
  **/
  @Schema(description = "")
  public String getDirectConnectGatewayId() {
    return directConnectGatewayId;
  }

  public void setDirectConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
  }

  public DescribeDirectConnectGatewayRouteAttributesResponse directConnectGatewayRouteId(String directConnectGatewayRouteId) {
    this.directConnectGatewayRouteId = directConnectGatewayRouteId;
    return this;
  }

   /**
   * Get directConnectGatewayRouteId
   * @return directConnectGatewayRouteId
  **/
  @Schema(description = "")
  public String getDirectConnectGatewayRouteId() {
    return directConnectGatewayRouteId;
  }

  public void setDirectConnectGatewayRouteId(String directConnectGatewayRouteId) {
    this.directConnectGatewayRouteId = directConnectGatewayRouteId;
  }

  public DescribeDirectConnectGatewayRouteAttributesResponse nextHopId(String nextHopId) {
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

  public DescribeDirectConnectGatewayRouteAttributesResponse nextHopType(String nextHopType) {
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

  public DescribeDirectConnectGatewayRouteAttributesResponse requestId(String requestId) {
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

  public DescribeDirectConnectGatewayRouteAttributesResponse routeType(String routeType) {
    this.routeType = routeType;
    return this;
  }

   /**
   * Get routeType
   * @return routeType
  **/
  @Schema(description = "")
  public String getRouteType() {
    return routeType;
  }

  public void setRouteType(String routeType) {
    this.routeType = routeType;
  }

  public DescribeDirectConnectGatewayRouteAttributesResponse status(String status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDirectConnectGatewayRouteAttributesResponse describeDirectConnectGatewayRouteAttributesResponse = (DescribeDirectConnectGatewayRouteAttributesResponse) o;
    return Objects.equals(this.accountId, describeDirectConnectGatewayRouteAttributesResponse.accountId) &&
        Objects.equals(this.creationTime, describeDirectConnectGatewayRouteAttributesResponse.creationTime) &&
        Objects.equals(this.destinationCidrBlock, describeDirectConnectGatewayRouteAttributesResponse.destinationCidrBlock) &&
        Objects.equals(this.directConnectGatewayId, describeDirectConnectGatewayRouteAttributesResponse.directConnectGatewayId) &&
        Objects.equals(this.directConnectGatewayRouteId, describeDirectConnectGatewayRouteAttributesResponse.directConnectGatewayRouteId) &&
        Objects.equals(this.nextHopId, describeDirectConnectGatewayRouteAttributesResponse.nextHopId) &&
        Objects.equals(this.nextHopType, describeDirectConnectGatewayRouteAttributesResponse.nextHopType) &&
        Objects.equals(this.requestId, describeDirectConnectGatewayRouteAttributesResponse.requestId) &&
        Objects.equals(this.routeType, describeDirectConnectGatewayRouteAttributesResponse.routeType) &&
        Objects.equals(this.status, describeDirectConnectGatewayRouteAttributesResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, creationTime, destinationCidrBlock, directConnectGatewayId, directConnectGatewayRouteId, nextHopId, nextHopType, requestId, routeType, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDirectConnectGatewayRouteAttributesResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    destinationCidrBlock: ").append(toIndentedString(destinationCidrBlock)).append("\n");
    sb.append("    directConnectGatewayId: ").append(toIndentedString(directConnectGatewayId)).append("\n");
    sb.append("    directConnectGatewayRouteId: ").append(toIndentedString(directConnectGatewayRouteId)).append("\n");
    sb.append("    nextHopId: ").append(toIndentedString(nextHopId)).append("\n");
    sb.append("    nextHopType: ").append(toIndentedString(nextHopType)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
