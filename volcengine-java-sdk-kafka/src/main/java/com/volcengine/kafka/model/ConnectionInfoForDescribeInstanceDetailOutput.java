/*
 * kafka
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kafka.model;

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
 * ConnectionInfoForDescribeInstanceDetailOutput
 */


public class ConnectionInfoForDescribeInstanceDetailOutput {
  @SerializedName("EndpointType")
  private String endpointType = null;

  @SerializedName("InternalEndpoint")
  private String internalEndpoint = null;

  @SerializedName("NetworkType")
  private String networkType = null;

  @SerializedName("PublicEndpoint")
  private String publicEndpoint = null;

  public ConnectionInfoForDescribeInstanceDetailOutput endpointType(String endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * Get endpointType
   * @return endpointType
  **/
  @Schema(description = "")
  public String getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(String endpointType) {
    this.endpointType = endpointType;
  }

  public ConnectionInfoForDescribeInstanceDetailOutput internalEndpoint(String internalEndpoint) {
    this.internalEndpoint = internalEndpoint;
    return this;
  }

   /**
   * Get internalEndpoint
   * @return internalEndpoint
  **/
  @Schema(description = "")
  public String getInternalEndpoint() {
    return internalEndpoint;
  }

  public void setInternalEndpoint(String internalEndpoint) {
    this.internalEndpoint = internalEndpoint;
  }

  public ConnectionInfoForDescribeInstanceDetailOutput networkType(String networkType) {
    this.networkType = networkType;
    return this;
  }

   /**
   * Get networkType
   * @return networkType
  **/
  @Schema(description = "")
  public String getNetworkType() {
    return networkType;
  }

  public void setNetworkType(String networkType) {
    this.networkType = networkType;
  }

  public ConnectionInfoForDescribeInstanceDetailOutput publicEndpoint(String publicEndpoint) {
    this.publicEndpoint = publicEndpoint;
    return this;
  }

   /**
   * Get publicEndpoint
   * @return publicEndpoint
  **/
  @Schema(description = "")
  public String getPublicEndpoint() {
    return publicEndpoint;
  }

  public void setPublicEndpoint(String publicEndpoint) {
    this.publicEndpoint = publicEndpoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionInfoForDescribeInstanceDetailOutput connectionInfoForDescribeInstanceDetailOutput = (ConnectionInfoForDescribeInstanceDetailOutput) o;
    return Objects.equals(this.endpointType, connectionInfoForDescribeInstanceDetailOutput.endpointType) &&
        Objects.equals(this.internalEndpoint, connectionInfoForDescribeInstanceDetailOutput.internalEndpoint) &&
        Objects.equals(this.networkType, connectionInfoForDescribeInstanceDetailOutput.networkType) &&
        Objects.equals(this.publicEndpoint, connectionInfoForDescribeInstanceDetailOutput.publicEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointType, internalEndpoint, networkType, publicEndpoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionInfoForDescribeInstanceDetailOutput {\n");
    
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    internalEndpoint: ").append(toIndentedString(internalEndpoint)).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
    sb.append("    publicEndpoint: ").append(toIndentedString(publicEndpoint)).append("\n");
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