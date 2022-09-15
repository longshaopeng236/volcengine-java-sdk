/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vke.model.ClusterConfigForCreateClusterInput;
import com.volcengine.vke.model.PodsConfigForCreateClusterInput;
import com.volcengine.vke.model.ServicesConfigForCreateClusterInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateClusterRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-15T17:50:31.831766+08:00[Asia/Shanghai]")
public class CreateClusterRequest {
  @SerializedName("ClientToken")
  private String clientToken = null;

  @SerializedName("ClusterConfig")
  private ClusterConfigForCreateClusterInput clusterConfig = null;

  @SerializedName("DeleteProtectionEnabled")
  private Boolean deleteProtectionEnabled = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("PodsConfig")
  private PodsConfigForCreateClusterInput podsConfig = null;

  @SerializedName("ServicesConfig")
  private ServicesConfigForCreateClusterInput servicesConfig = null;

  public CreateClusterRequest clientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Get clientToken
   * @return clientToken
  **/
  @Schema(description = "")
  public String getClientToken() {
    return clientToken;
  }

  public void setClientToken(String clientToken) {
    this.clientToken = clientToken;
  }

  public CreateClusterRequest clusterConfig(ClusterConfigForCreateClusterInput clusterConfig) {
    this.clusterConfig = clusterConfig;
    return this;
  }

   /**
   * Get clusterConfig
   * @return clusterConfig
  **/
  @Valid
  @Schema(description = "")
  public ClusterConfigForCreateClusterInput getClusterConfig() {
    return clusterConfig;
  }

  public void setClusterConfig(ClusterConfigForCreateClusterInput clusterConfig) {
    this.clusterConfig = clusterConfig;
  }

  public CreateClusterRequest deleteProtectionEnabled(Boolean deleteProtectionEnabled) {
    this.deleteProtectionEnabled = deleteProtectionEnabled;
    return this;
  }

   /**
   * Get deleteProtectionEnabled
   * @return deleteProtectionEnabled
  **/
  @Schema(description = "")
  public Boolean isDeleteProtectionEnabled() {
    return deleteProtectionEnabled;
  }

  public void setDeleteProtectionEnabled(Boolean deleteProtectionEnabled) {
    this.deleteProtectionEnabled = deleteProtectionEnabled;
  }

  public CreateClusterRequest description(String description) {
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

  public CreateClusterRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateClusterRequest podsConfig(PodsConfigForCreateClusterInput podsConfig) {
    this.podsConfig = podsConfig;
    return this;
  }

   /**
   * Get podsConfig
   * @return podsConfig
  **/
  @Valid
  @Schema(description = "")
  public PodsConfigForCreateClusterInput getPodsConfig() {
    return podsConfig;
  }

  public void setPodsConfig(PodsConfigForCreateClusterInput podsConfig) {
    this.podsConfig = podsConfig;
  }

  public CreateClusterRequest servicesConfig(ServicesConfigForCreateClusterInput servicesConfig) {
    this.servicesConfig = servicesConfig;
    return this;
  }

   /**
   * Get servicesConfig
   * @return servicesConfig
  **/
  @Valid
  @Schema(description = "")
  public ServicesConfigForCreateClusterInput getServicesConfig() {
    return servicesConfig;
  }

  public void setServicesConfig(ServicesConfigForCreateClusterInput servicesConfig) {
    this.servicesConfig = servicesConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClusterRequest createClusterRequest = (CreateClusterRequest) o;
    return Objects.equals(this.clientToken, createClusterRequest.clientToken) &&
        Objects.equals(this.clusterConfig, createClusterRequest.clusterConfig) &&
        Objects.equals(this.deleteProtectionEnabled, createClusterRequest.deleteProtectionEnabled) &&
        Objects.equals(this.description, createClusterRequest.description) &&
        Objects.equals(this.name, createClusterRequest.name) &&
        Objects.equals(this.podsConfig, createClusterRequest.podsConfig) &&
        Objects.equals(this.servicesConfig, createClusterRequest.servicesConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, clusterConfig, deleteProtectionEnabled, description, name, podsConfig, servicesConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClusterRequest {\n");
    
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    clusterConfig: ").append(toIndentedString(clusterConfig)).append("\n");
    sb.append("    deleteProtectionEnabled: ").append(toIndentedString(deleteProtectionEnabled)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    podsConfig: ").append(toIndentedString(podsConfig)).append("\n");
    sb.append("    servicesConfig: ").append(toIndentedString(servicesConfig)).append("\n");
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
