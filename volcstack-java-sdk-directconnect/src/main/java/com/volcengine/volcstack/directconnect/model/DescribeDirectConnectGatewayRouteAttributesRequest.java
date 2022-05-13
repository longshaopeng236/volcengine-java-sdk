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
 * DescribeDirectConnectGatewayRouteAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T17:16:28.121303+08:00[Asia/Shanghai]")
public class DescribeDirectConnectGatewayRouteAttributesRequest {
  @SerializedName("DirectConnectGatewayRouteId")
  private String directConnectGatewayRouteId = null;

  public DescribeDirectConnectGatewayRouteAttributesRequest directConnectGatewayRouteId(String directConnectGatewayRouteId) {
    this.directConnectGatewayRouteId = directConnectGatewayRouteId;
    return this;
  }

   /**
   * Get directConnectGatewayRouteId
   * @return directConnectGatewayRouteId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getDirectConnectGatewayRouteId() {
    return directConnectGatewayRouteId;
  }

  public void setDirectConnectGatewayRouteId(String directConnectGatewayRouteId) {
    this.directConnectGatewayRouteId = directConnectGatewayRouteId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDirectConnectGatewayRouteAttributesRequest describeDirectConnectGatewayRouteAttributesRequest = (DescribeDirectConnectGatewayRouteAttributesRequest) o;
    return Objects.equals(this.directConnectGatewayRouteId, describeDirectConnectGatewayRouteAttributesRequest.directConnectGatewayRouteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directConnectGatewayRouteId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDirectConnectGatewayRouteAttributesRequest {\n");
    
    sb.append("    directConnectGatewayRouteId: ").append(toIndentedString(directConnectGatewayRouteId)).append("\n");
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
