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
 * CreateRouteTableRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-18T20:48:24.268703+08:00[Asia/Shanghai]")
public class CreateRouteTableRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("RouteTableName")
  private String routeTableName = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public CreateRouteTableRequest description(String description) {
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

  public CreateRouteTableRequest routeTableName(String routeTableName) {
    this.routeTableName = routeTableName;
    return this;
  }

   /**
   * Get routeTableName
   * @return routeTableName
  **/
  @Schema(description = "")
  public String getRouteTableName() {
    return routeTableName;
  }

  public void setRouteTableName(String routeTableName) {
    this.routeTableName = routeTableName;
  }

  public CreateRouteTableRequest vpcId(String vpcId) {
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
    CreateRouteTableRequest createRouteTableRequest = (CreateRouteTableRequest) o;
    return Objects.equals(this.description, createRouteTableRequest.description) &&
        Objects.equals(this.routeTableName, createRouteTableRequest.routeTableName) &&
        Objects.equals(this.vpcId, createRouteTableRequest.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, routeTableName, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRouteTableRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    routeTableName: ").append(toIndentedString(routeTableName)).append("\n");
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
