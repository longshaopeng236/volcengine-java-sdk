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
import com.volcengine.clb.model.ServerForAddServerGroupBackendServersInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AddServerGroupBackendServersRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:28.835190+08:00[Asia/Shanghai]")
public class AddServerGroupBackendServersRequest {
  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  @SerializedName("Servers")
  private List<ServerForAddServerGroupBackendServersInput> servers = null;

  public AddServerGroupBackendServersRequest serverGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
    return this;
  }

   /**
   * Get serverGroupId
   * @return serverGroupId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getServerGroupId() {
    return serverGroupId;
  }

  public void setServerGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
  }

  public AddServerGroupBackendServersRequest servers(List<ServerForAddServerGroupBackendServersInput> servers) {
    this.servers = servers;
    return this;
  }

  public AddServerGroupBackendServersRequest addServersItem(ServerForAddServerGroupBackendServersInput serversItem) {
    if (this.servers == null) {
      this.servers = new ArrayList<ServerForAddServerGroupBackendServersInput>();
    }
    this.servers.add(serversItem);
    return this;
  }

   /**
   * Get servers
   * @return servers
  **/
  @Valid
  @Schema(description = "")
  public List<ServerForAddServerGroupBackendServersInput> getServers() {
    return servers;
  }

  public void setServers(List<ServerForAddServerGroupBackendServersInput> servers) {
    this.servers = servers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddServerGroupBackendServersRequest addServerGroupBackendServersRequest = (AddServerGroupBackendServersRequest) o;
    return Objects.equals(this.serverGroupId, addServerGroupBackendServersRequest.serverGroupId) &&
        Objects.equals(this.servers, addServerGroupBackendServersRequest.servers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverGroupId, servers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddServerGroupBackendServersRequest {\n");
    
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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
