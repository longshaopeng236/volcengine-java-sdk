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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AutoScalingForCreateNodePoolInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-19T12:20:19.967862+08:00[Asia/Shanghai]")
public class AutoScalingForCreateNodePoolInput {
  @SerializedName("DesiredReplicas")
  private Integer desiredReplicas = null;

  @SerializedName("Enabled")
  private Boolean enabled = null;

  @SerializedName("MaxReplicas")
  private Integer maxReplicas = null;

  @SerializedName("MinReplicas")
  private Integer minReplicas = null;

  @SerializedName("Priority")
  private Integer priority = null;

  public AutoScalingForCreateNodePoolInput desiredReplicas(Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
    return this;
  }

   /**
   * Get desiredReplicas
   * @return desiredReplicas
  **/
  @Schema(description = "")
  public Integer getDesiredReplicas() {
    return desiredReplicas;
  }

  public void setDesiredReplicas(Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
  }

  public AutoScalingForCreateNodePoolInput enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AutoScalingForCreateNodePoolInput maxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
    return this;
  }

   /**
   * Get maxReplicas
   * @return maxReplicas
  **/
  @Schema(description = "")
  public Integer getMaxReplicas() {
    return maxReplicas;
  }

  public void setMaxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
  }

  public AutoScalingForCreateNodePoolInput minReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
    return this;
  }

   /**
   * Get minReplicas
   * @return minReplicas
  **/
  @Schema(description = "")
  public Integer getMinReplicas() {
    return minReplicas;
  }

  public void setMinReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
  }

  public AutoScalingForCreateNodePoolInput priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoScalingForCreateNodePoolInput autoScalingForCreateNodePoolInput = (AutoScalingForCreateNodePoolInput) o;
    return Objects.equals(this.desiredReplicas, autoScalingForCreateNodePoolInput.desiredReplicas) &&
        Objects.equals(this.enabled, autoScalingForCreateNodePoolInput.enabled) &&
        Objects.equals(this.maxReplicas, autoScalingForCreateNodePoolInput.maxReplicas) &&
        Objects.equals(this.minReplicas, autoScalingForCreateNodePoolInput.minReplicas) &&
        Objects.equals(this.priority, autoScalingForCreateNodePoolInput.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desiredReplicas, enabled, maxReplicas, minReplicas, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoScalingForCreateNodePoolInput {\n");
    
    sb.append("    desiredReplicas: ").append(toIndentedString(desiredReplicas)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
