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

package com.volcengine.directconnect.model;

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
 * CreateDirectConnectGatewayRouteRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T20:18:01.352154+08:00[Asia/Shanghai]")
public class CreateDirectConnectGatewayRouteRequest {
  @SerializedName("DestinationCidrBlock")
  private String destinationCidrBlock = null;

  @SerializedName("DirectConnectGatewayId")
  private String directConnectGatewayId = null;

  @SerializedName("NextHopId")
  private String nextHopId = null;

  public CreateDirectConnectGatewayRouteRequest destinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
    return this;
  }

   /**
   * Get destinationCidrBlock
   * @return destinationCidrBlock
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDestinationCidrBlock() {
    return destinationCidrBlock;
  }

  public void setDestinationCidrBlock(String destinationCidrBlock) {
    this.destinationCidrBlock = destinationCidrBlock;
  }

  public CreateDirectConnectGatewayRouteRequest directConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
    return this;
  }

   /**
   * Get directConnectGatewayId
   * @return directConnectGatewayId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDirectConnectGatewayId() {
    return directConnectGatewayId;
  }

  public void setDirectConnectGatewayId(String directConnectGatewayId) {
    this.directConnectGatewayId = directConnectGatewayId;
  }

  public CreateDirectConnectGatewayRouteRequest nextHopId(String nextHopId) {
    this.nextHopId = nextHopId;
    return this;
  }

   /**
   * Get nextHopId
   * @return nextHopId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getNextHopId() {
    return nextHopId;
  }

  public void setNextHopId(String nextHopId) {
    this.nextHopId = nextHopId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDirectConnectGatewayRouteRequest createDirectConnectGatewayRouteRequest = (CreateDirectConnectGatewayRouteRequest) o;
    return Objects.equals(this.destinationCidrBlock, createDirectConnectGatewayRouteRequest.destinationCidrBlock) &&
        Objects.equals(this.directConnectGatewayId, createDirectConnectGatewayRouteRequest.directConnectGatewayId) &&
        Objects.equals(this.nextHopId, createDirectConnectGatewayRouteRequest.nextHopId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationCidrBlock, directConnectGatewayId, nextHopId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDirectConnectGatewayRouteRequest {\n");
    
    sb.append("    destinationCidrBlock: ").append(toIndentedString(destinationCidrBlock)).append("\n");
    sb.append("    directConnectGatewayId: ").append(toIndentedString(directConnectGatewayId)).append("\n");
    sb.append("    nextHopId: ").append(toIndentedString(nextHopId)).append("\n");
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
