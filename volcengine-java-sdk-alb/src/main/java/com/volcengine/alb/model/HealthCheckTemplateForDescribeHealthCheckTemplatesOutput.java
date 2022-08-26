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
 * HealthCheckTemplateForDescribeHealthCheckTemplatesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-26T18:47:55.368678+08:00[Asia/Shanghai]")
public class HealthCheckTemplateForDescribeHealthCheckTemplatesOutput {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("HealthCheckDomain")
  private String healthCheckDomain = null;

  @SerializedName("HealthCheckHttpCode")
  private String healthCheckHttpCode = null;

  @SerializedName("HealthCheckInterval")
  private Integer healthCheckInterval = null;

  @SerializedName("HealthCheckMethod")
  private String healthCheckMethod = null;

  @SerializedName("HealthCheckProtocol")
  private String healthCheckProtocol = null;

  @SerializedName("HealthCheckTemplateId")
  private String healthCheckTemplateId = null;

  @SerializedName("HealthCheckTemplateName")
  private String healthCheckTemplateName = null;

  @SerializedName("HealthCheckTimeout")
  private Integer healthCheckTimeout = null;

  @SerializedName("HealthCheckURI")
  private String healthCheckURI = null;

  @SerializedName("HealthyThreshold")
  private Integer healthyThreshold = null;

  @SerializedName("UnhealthyThreshold")
  private Integer unhealthyThreshold = null;

  public HealthCheckTemplateForDescribeHealthCheckTemplatesOutput description(String description) {
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

  public HealthCheckTemplateForDescribeHealthCheckTemplatesOutput healthCheckDomain(String healthCheckDomain) {
    this.healthCheckDomain = healthCheckDomain;
    return this;
  }

   /**
   * Get healthCheckDomain
   * @return healthCheckDomain
  **/
  @Schema(description = "")
  public String getHealthCheckDomain() {
    return healthCheckDomain;
  }

  public void setHealthCheckDomain(String healthCheckDomain) {
    this.healthCheckDomain = healthCheckDomain;
  }

  public HealthCheckTemplateForDescribeHealthCheckTemplatesOutput healthCheckHttpCode(String healthCheckHttpCode) {
    this.healthCheckHttpCode = healthCheckHttpCode;
    return this;
  }

   /**
   * Get healthCheckHttpCode
   * @return healthCheckHttpCode
  **/
  @Schema(description = "")
  public String getHealthCheckHttpCode() {
    return healthCheckHttpCode;
  }

  public void setHealthCheckHttpCode(String healthCheckHttpCode) {
    this.healthCheckHttpCode = healthCheckHttpCode;
  }

  public HealthCheckTemplateForDescribeHealthCheckTemplatesOutput healthCheckInterval(Integer healthCheckInterval) {
    this.healthCheckInterval = healthCheckInterval;
    return this;
  }

   /**
   * Get healthCheckInterval
   * @return healthCheckInterval
  **/
  @Schema(description = "")
  public Integer getHealthCheckInterval() {
    return healthCheckInterval;
  }

  public void setHealthCheckInterval(Integer healthCheckInterval) {
    this.healthCheckInterval = healthCheckInterval;
  }

  public HealthCheckTemplateForDescribeHealthCheckTemplatesOutput healthCheckMethod(String healthCheckMethod) {
    this.healthCheckMethod = healthCheckMethod;
    return this;
  }

   /**
   * Get healthCheckMethod
   * @return healthCheckMethod
  **/
  @Schema(description = "")
  public String getHealthCheckMethod() {
    return healthCheckMethod;
  }

  public void setHealthCheckMethod(String healthCheckMethod) {
    this.healthCheckMethod = healthCheckMethod;
  }

  public HealthCheckTemplateForDescribeHealthCheckTemplatesOutput healthCheckProtocol(String healthCheckProtocol) {
    this.healthCheckProtocol = healthCheckProtocol;
    return this;
  }

   /**
   * Get healthCheckProtocol
   * @return healthCheckProtocol
  **/
  @Schema(description = "")
  public String getHealthCheckProtocol() {
    return healthCheckProtocol;
  }

  public void setHealthCheckProtocol(String healthCheckProtocol) {
    this.healthCheckProtocol = healthCheckProtocol;
  }

  public HealthCheckTemplateForDescribeHealthCheckTemplatesOutput healthCheckTemplateId(String healthCheckTemplateId) {
    this.healthCheckTemplateId = healthCheckTemplateId;
    return this;
  }

   /**
   * Get healthCheckTemplateId
   * @return healthCheckTemplateId
  **/
  @Schema(description = "")
  public String getHealthCheckTemplateId() {
    return healthCheckTemplateId;
  }

  public void setHealthCheckTemplateId(String healthCheckTemplateId) {
    this.healthCheckTemplateId = healthCheckTemplateId;
  }

  public HealthCheckTemplateForDescribeHealthCheckTemplatesOutput healthCheckTemplateName(String healthCheckTemplateName) {
    this.healthCheckTemplateName = healthCheckTemplateName;
    return this;
  }

   /**
   * Get healthCheckTemplateName
   * @return healthCheckTemplateName
  **/
  @Schema(description = "")
  public String getHealthCheckTemplateName() {
    return healthCheckTemplateName;
  }

  public void setHealthCheckTemplateName(String healthCheckTemplateName) {
    this.healthCheckTemplateName = healthCheckTemplateName;
  }

  public HealthCheckTemplateForDescribeHealthCheckTemplatesOutput healthCheckTimeout(Integer healthCheckTimeout) {
    this.healthCheckTimeout = healthCheckTimeout;
    return this;
  }

   /**
   * Get healthCheckTimeout
   * @return healthCheckTimeout
  **/
  @Schema(description = "")
  public Integer getHealthCheckTimeout() {
    return healthCheckTimeout;
  }

  public void setHealthCheckTimeout(Integer healthCheckTimeout) {
    this.healthCheckTimeout = healthCheckTimeout;
  }

  public HealthCheckTemplateForDescribeHealthCheckTemplatesOutput healthCheckURI(String healthCheckURI) {
    this.healthCheckURI = healthCheckURI;
    return this;
  }

   /**
   * Get healthCheckURI
   * @return healthCheckURI
  **/
  @Schema(description = "")
  public String getHealthCheckURI() {
    return healthCheckURI;
  }

  public void setHealthCheckURI(String healthCheckURI) {
    this.healthCheckURI = healthCheckURI;
  }

  public HealthCheckTemplateForDescribeHealthCheckTemplatesOutput healthyThreshold(Integer healthyThreshold) {
    this.healthyThreshold = healthyThreshold;
    return this;
  }

   /**
   * Get healthyThreshold
   * @return healthyThreshold
  **/
  @Schema(description = "")
  public Integer getHealthyThreshold() {
    return healthyThreshold;
  }

  public void setHealthyThreshold(Integer healthyThreshold) {
    this.healthyThreshold = healthyThreshold;
  }

  public HealthCheckTemplateForDescribeHealthCheckTemplatesOutput unhealthyThreshold(Integer unhealthyThreshold) {
    this.unhealthyThreshold = unhealthyThreshold;
    return this;
  }

   /**
   * Get unhealthyThreshold
   * @return unhealthyThreshold
  **/
  @Schema(description = "")
  public Integer getUnhealthyThreshold() {
    return unhealthyThreshold;
  }

  public void setUnhealthyThreshold(Integer unhealthyThreshold) {
    this.unhealthyThreshold = unhealthyThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckTemplateForDescribeHealthCheckTemplatesOutput healthCheckTemplateForDescribeHealthCheckTemplatesOutput = (HealthCheckTemplateForDescribeHealthCheckTemplatesOutput) o;
    return Objects.equals(this.description, healthCheckTemplateForDescribeHealthCheckTemplatesOutput.description) &&
        Objects.equals(this.healthCheckDomain, healthCheckTemplateForDescribeHealthCheckTemplatesOutput.healthCheckDomain) &&
        Objects.equals(this.healthCheckHttpCode, healthCheckTemplateForDescribeHealthCheckTemplatesOutput.healthCheckHttpCode) &&
        Objects.equals(this.healthCheckInterval, healthCheckTemplateForDescribeHealthCheckTemplatesOutput.healthCheckInterval) &&
        Objects.equals(this.healthCheckMethod, healthCheckTemplateForDescribeHealthCheckTemplatesOutput.healthCheckMethod) &&
        Objects.equals(this.healthCheckProtocol, healthCheckTemplateForDescribeHealthCheckTemplatesOutput.healthCheckProtocol) &&
        Objects.equals(this.healthCheckTemplateId, healthCheckTemplateForDescribeHealthCheckTemplatesOutput.healthCheckTemplateId) &&
        Objects.equals(this.healthCheckTemplateName, healthCheckTemplateForDescribeHealthCheckTemplatesOutput.healthCheckTemplateName) &&
        Objects.equals(this.healthCheckTimeout, healthCheckTemplateForDescribeHealthCheckTemplatesOutput.healthCheckTimeout) &&
        Objects.equals(this.healthCheckURI, healthCheckTemplateForDescribeHealthCheckTemplatesOutput.healthCheckURI) &&
        Objects.equals(this.healthyThreshold, healthCheckTemplateForDescribeHealthCheckTemplatesOutput.healthyThreshold) &&
        Objects.equals(this.unhealthyThreshold, healthCheckTemplateForDescribeHealthCheckTemplatesOutput.unhealthyThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, healthCheckDomain, healthCheckHttpCode, healthCheckInterval, healthCheckMethod, healthCheckProtocol, healthCheckTemplateId, healthCheckTemplateName, healthCheckTimeout, healthCheckURI, healthyThreshold, unhealthyThreshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckTemplateForDescribeHealthCheckTemplatesOutput {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    healthCheckDomain: ").append(toIndentedString(healthCheckDomain)).append("\n");
    sb.append("    healthCheckHttpCode: ").append(toIndentedString(healthCheckHttpCode)).append("\n");
    sb.append("    healthCheckInterval: ").append(toIndentedString(healthCheckInterval)).append("\n");
    sb.append("    healthCheckMethod: ").append(toIndentedString(healthCheckMethod)).append("\n");
    sb.append("    healthCheckProtocol: ").append(toIndentedString(healthCheckProtocol)).append("\n");
    sb.append("    healthCheckTemplateId: ").append(toIndentedString(healthCheckTemplateId)).append("\n");
    sb.append("    healthCheckTemplateName: ").append(toIndentedString(healthCheckTemplateName)).append("\n");
    sb.append("    healthCheckTimeout: ").append(toIndentedString(healthCheckTimeout)).append("\n");
    sb.append("    healthCheckURI: ").append(toIndentedString(healthCheckURI)).append("\n");
    sb.append("    healthyThreshold: ").append(toIndentedString(healthyThreshold)).append("\n");
    sb.append("    unhealthyThreshold: ").append(toIndentedString(unhealthyThreshold)).append("\n");
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
