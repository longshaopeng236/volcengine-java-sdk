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
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ListenerForDescribeCustomizedCfgAttributesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-26T18:47:55.368678+08:00[Asia/Shanghai]")
public class ListenerForDescribeCustomizedCfgAttributesOutput {
  @SerializedName("ListenerId")
  private String listenerId = null;

  @SerializedName("ListenerName")
  private String listenerName = null;

  @SerializedName("Port")
  private Integer port = null;

  @SerializedName("Protocol")
  private String protocol = null;

  public ListenerForDescribeCustomizedCfgAttributesOutput listenerId(String listenerId) {
    this.listenerId = listenerId;
    return this;
  }

   /**
   * Get listenerId
   * @return listenerId
  **/
  @Schema(description = "")
  public String getListenerId() {
    return listenerId;
  }

  public void setListenerId(String listenerId) {
    this.listenerId = listenerId;
  }

  public ListenerForDescribeCustomizedCfgAttributesOutput listenerName(String listenerName) {
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

  public ListenerForDescribeCustomizedCfgAttributesOutput port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public ListenerForDescribeCustomizedCfgAttributesOutput protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @Schema(description = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListenerForDescribeCustomizedCfgAttributesOutput listenerForDescribeCustomizedCfgAttributesOutput = (ListenerForDescribeCustomizedCfgAttributesOutput) o;
    return Objects.equals(this.listenerId, listenerForDescribeCustomizedCfgAttributesOutput.listenerId) &&
        Objects.equals(this.listenerName, listenerForDescribeCustomizedCfgAttributesOutput.listenerName) &&
        Objects.equals(this.port, listenerForDescribeCustomizedCfgAttributesOutput.port) &&
        Objects.equals(this.protocol, listenerForDescribeCustomizedCfgAttributesOutput.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listenerId, listenerName, port, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListenerForDescribeCustomizedCfgAttributesOutput {\n");
    
    sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
    sb.append("    listenerName: ").append(toIndentedString(listenerName)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
