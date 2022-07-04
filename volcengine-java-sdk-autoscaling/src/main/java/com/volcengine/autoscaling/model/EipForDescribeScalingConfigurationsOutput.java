/*
 * auto_scaling
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.autoscaling.model;

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
 * EipForDescribeScalingConfigurationsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-04T12:08:52.868690+08:00[Asia/Shanghai]")
public class EipForDescribeScalingConfigurationsOutput {
  @SerializedName("Bandwidth")
  private Integer bandwidth = null;

  @SerializedName("BillingType")
  private String billingType = null;

  @SerializedName("ISP")
  private String ISP = null;

  public EipForDescribeScalingConfigurationsOutput bandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @Schema(description = "")
  public Integer getBandwidth() {
    return bandwidth;
  }

  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }

  public EipForDescribeScalingConfigurationsOutput billingType(String billingType) {
    this.billingType = billingType;
    return this;
  }

   /**
   * Get billingType
   * @return billingType
  **/
  @Schema(description = "")
  public String getBillingType() {
    return billingType;
  }

  public void setBillingType(String billingType) {
    this.billingType = billingType;
  }

  public EipForDescribeScalingConfigurationsOutput ISP(String ISP) {
    this.ISP = ISP;
    return this;
  }

   /**
   * Get ISP
   * @return ISP
  **/
  @Schema(description = "")
  public String getISP() {
    return ISP;
  }

  public void setISP(String ISP) {
    this.ISP = ISP;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EipForDescribeScalingConfigurationsOutput eipForDescribeScalingConfigurationsOutput = (EipForDescribeScalingConfigurationsOutput) o;
    return Objects.equals(this.bandwidth, eipForDescribeScalingConfigurationsOutput.bandwidth) &&
        Objects.equals(this.billingType, eipForDescribeScalingConfigurationsOutput.billingType) &&
        Objects.equals(this.ISP, eipForDescribeScalingConfigurationsOutput.ISP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth, billingType, ISP);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EipForDescribeScalingConfigurationsOutput {\n");
    
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
    sb.append("    ISP: ").append(toIndentedString(ISP)).append("\n");
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
