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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SetLoadBalancerRenewalRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-15T17:10:28.835190+08:00[Asia/Shanghai]")
public class SetLoadBalancerRenewalRequest {
  @SerializedName("LoadBalancerId")
  private String loadBalancerId = null;

  @SerializedName("RemainRenewTimes")
  private Integer remainRenewTimes = null;

  @SerializedName("RenewPeriodTimes")
  private Integer renewPeriodTimes = null;

  @SerializedName("RenewType")
  private Integer renewType = null;

  public SetLoadBalancerRenewalRequest loadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
    return this;
  }

   /**
   * Get loadBalancerId
   * @return loadBalancerId
  **/
  @Schema(description = "")
  public String getLoadBalancerId() {
    return loadBalancerId;
  }

  public void setLoadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
  }

  public SetLoadBalancerRenewalRequest remainRenewTimes(Integer remainRenewTimes) {
    this.remainRenewTimes = remainRenewTimes;
    return this;
  }

   /**
   * Get remainRenewTimes
   * @return remainRenewTimes
  **/
  @Schema(description = "")
  public Integer getRemainRenewTimes() {
    return remainRenewTimes;
  }

  public void setRemainRenewTimes(Integer remainRenewTimes) {
    this.remainRenewTimes = remainRenewTimes;
  }

  public SetLoadBalancerRenewalRequest renewPeriodTimes(Integer renewPeriodTimes) {
    this.renewPeriodTimes = renewPeriodTimes;
    return this;
  }

   /**
   * Get renewPeriodTimes
   * @return renewPeriodTimes
  **/
  @Schema(description = "")
  public Integer getRenewPeriodTimes() {
    return renewPeriodTimes;
  }

  public void setRenewPeriodTimes(Integer renewPeriodTimes) {
    this.renewPeriodTimes = renewPeriodTimes;
  }

  public SetLoadBalancerRenewalRequest renewType(Integer renewType) {
    this.renewType = renewType;
    return this;
  }

   /**
   * Get renewType
   * minimum: 1
   * maximum: 2
   * @return renewType
  **/
  @NotNull
 @Min(1) @Max(2)  @Schema(required = true, description = "")
  public Integer getRenewType() {
    return renewType;
  }

  public void setRenewType(Integer renewType) {
    this.renewType = renewType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetLoadBalancerRenewalRequest setLoadBalancerRenewalRequest = (SetLoadBalancerRenewalRequest) o;
    return Objects.equals(this.loadBalancerId, setLoadBalancerRenewalRequest.loadBalancerId) &&
        Objects.equals(this.remainRenewTimes, setLoadBalancerRenewalRequest.remainRenewTimes) &&
        Objects.equals(this.renewPeriodTimes, setLoadBalancerRenewalRequest.renewPeriodTimes) &&
        Objects.equals(this.renewType, setLoadBalancerRenewalRequest.renewType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadBalancerId, remainRenewTimes, renewPeriodTimes, renewType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetLoadBalancerRenewalRequest {\n");
    
    sb.append("    loadBalancerId: ").append(toIndentedString(loadBalancerId)).append("\n");
    sb.append("    remainRenewTimes: ").append(toIndentedString(remainRenewTimes)).append("\n");
    sb.append("    renewPeriodTimes: ").append(toIndentedString(renewPeriodTimes)).append("\n");
    sb.append("    renewType: ").append(toIndentedString(renewType)).append("\n");
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
