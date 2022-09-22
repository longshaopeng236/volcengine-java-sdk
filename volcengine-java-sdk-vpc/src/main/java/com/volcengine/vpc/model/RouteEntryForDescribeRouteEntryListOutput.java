/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

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
 * RouteEntryForDescribeRouteEntryListOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:39.157783+08:00[Asia/Shanghai]")
public class RouteEntryForDescribeRouteEntryListOutput {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("DestinationCidrBlock")
  private String destinationCidrBlock = null;

  @SerializedName("NextHopId")
  private String nextHopId = null;

  @SerializedName("NextHopName")
  private String nextHopName = null;

  @SerializedName("NextHopType")
  private String nextHopType = null;

  @SerializedName("RouteEntryId")
  private String routeEntryId = null;

  @SerializedName("RouteEntryName")
  private String routeEntryName = null;

  @SerializedName("RouteTableId")
  private String routeTableId = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public RouteEntryForDescribeRouteEntryListOutput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RouteEntryForDescribeRouteEntryListOutput destinationCidrBlock(String destinationCidrBlock) {
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

  public RouteEntryForDescribeRouteEntryListOutput nextHopId(String nextHopId) {
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

  public RouteEntryForDescribeRouteEntryListOutput nextHopName(String nextHopName) {
    this.nextHopName = nextHopName;
    return this;
  }

   /**
   * Get nextHopName
   * @return nextHopName
  **/
  @Schema(description = "")
  public String getNextHopName() {
    return nextHopName;
  }

  public void setNextHopName(String nextHopName) {
    this.nextHopName = nextHopName;
  }

  public RouteEntryForDescribeRouteEntryListOutput nextHopType(String nextHopType) {
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

  public RouteEntryForDescribeRouteEntryListOutput routeEntryId(String routeEntryId) {
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

  public RouteEntryForDescribeRouteEntryListOutput routeEntryName(String routeEntryName) {
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

  public RouteEntryForDescribeRouteEntryListOutput routeTableId(String routeTableId) {
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

  public RouteEntryForDescribeRouteEntryListOutput status(String status) {
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

  public RouteEntryForDescribeRouteEntryListOutput type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RouteEntryForDescribeRouteEntryListOutput vpcId(String vpcId) {
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
    RouteEntryForDescribeRouteEntryListOutput routeEntryForDescribeRouteEntryListOutput = (RouteEntryForDescribeRouteEntryListOutput) o;
    return Objects.equals(this.description, routeEntryForDescribeRouteEntryListOutput.description) &&
        Objects.equals(this.destinationCidrBlock, routeEntryForDescribeRouteEntryListOutput.destinationCidrBlock) &&
        Objects.equals(this.nextHopId, routeEntryForDescribeRouteEntryListOutput.nextHopId) &&
        Objects.equals(this.nextHopName, routeEntryForDescribeRouteEntryListOutput.nextHopName) &&
        Objects.equals(this.nextHopType, routeEntryForDescribeRouteEntryListOutput.nextHopType) &&
        Objects.equals(this.routeEntryId, routeEntryForDescribeRouteEntryListOutput.routeEntryId) &&
        Objects.equals(this.routeEntryName, routeEntryForDescribeRouteEntryListOutput.routeEntryName) &&
        Objects.equals(this.routeTableId, routeEntryForDescribeRouteEntryListOutput.routeTableId) &&
        Objects.equals(this.status, routeEntryForDescribeRouteEntryListOutput.status) &&
        Objects.equals(this.type, routeEntryForDescribeRouteEntryListOutput.type) &&
        Objects.equals(this.vpcId, routeEntryForDescribeRouteEntryListOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, destinationCidrBlock, nextHopId, nextHopName, nextHopType, routeEntryId, routeEntryName, routeTableId, status, type, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteEntryForDescribeRouteEntryListOutput {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destinationCidrBlock: ").append(toIndentedString(destinationCidrBlock)).append("\n");
    sb.append("    nextHopId: ").append(toIndentedString(nextHopId)).append("\n");
    sb.append("    nextHopName: ").append(toIndentedString(nextHopName)).append("\n");
    sb.append("    nextHopType: ").append(toIndentedString(nextHopType)).append("\n");
    sb.append("    routeEntryId: ").append(toIndentedString(routeEntryId)).append("\n");
    sb.append("    routeEntryName: ").append(toIndentedString(routeEntryName)).append("\n");
    sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
