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
import com.volcengine.vke.model.ApiServerPublicAccessConfigForUpdateClusterConfigInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ClusterConfigForUpdateClusterConfigInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:54.001539+08:00[Asia/Shanghai]")
public class ClusterConfigForUpdateClusterConfigInput {
  @SerializedName("ApiServerPublicAccessConfig")
  private ApiServerPublicAccessConfigForUpdateClusterConfigInput apiServerPublicAccessConfig = null;

  @SerializedName("ApiServerPublicAccessEnabled")
  private Boolean apiServerPublicAccessEnabled = null;

  public ClusterConfigForUpdateClusterConfigInput apiServerPublicAccessConfig(ApiServerPublicAccessConfigForUpdateClusterConfigInput apiServerPublicAccessConfig) {
    this.apiServerPublicAccessConfig = apiServerPublicAccessConfig;
    return this;
  }

   /**
   * Get apiServerPublicAccessConfig
   * @return apiServerPublicAccessConfig
  **/
  @Valid
  @Schema(description = "")
  public ApiServerPublicAccessConfigForUpdateClusterConfigInput getApiServerPublicAccessConfig() {
    return apiServerPublicAccessConfig;
  }

  public void setApiServerPublicAccessConfig(ApiServerPublicAccessConfigForUpdateClusterConfigInput apiServerPublicAccessConfig) {
    this.apiServerPublicAccessConfig = apiServerPublicAccessConfig;
  }

  public ClusterConfigForUpdateClusterConfigInput apiServerPublicAccessEnabled(Boolean apiServerPublicAccessEnabled) {
    this.apiServerPublicAccessEnabled = apiServerPublicAccessEnabled;
    return this;
  }

   /**
   * Get apiServerPublicAccessEnabled
   * @return apiServerPublicAccessEnabled
  **/
  @Schema(description = "")
  public Boolean isApiServerPublicAccessEnabled() {
    return apiServerPublicAccessEnabled;
  }

  public void setApiServerPublicAccessEnabled(Boolean apiServerPublicAccessEnabled) {
    this.apiServerPublicAccessEnabled = apiServerPublicAccessEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterConfigForUpdateClusterConfigInput clusterConfigForUpdateClusterConfigInput = (ClusterConfigForUpdateClusterConfigInput) o;
    return Objects.equals(this.apiServerPublicAccessConfig, clusterConfigForUpdateClusterConfigInput.apiServerPublicAccessConfig) &&
        Objects.equals(this.apiServerPublicAccessEnabled, clusterConfigForUpdateClusterConfigInput.apiServerPublicAccessEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiServerPublicAccessConfig, apiServerPublicAccessEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterConfigForUpdateClusterConfigInput {\n");
    
    sb.append("    apiServerPublicAccessConfig: ").append(toIndentedString(apiServerPublicAccessConfig)).append("\n");
    sb.append("    apiServerPublicAccessEnabled: ").append(toIndentedString(apiServerPublicAccessEnabled)).append("\n");
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
