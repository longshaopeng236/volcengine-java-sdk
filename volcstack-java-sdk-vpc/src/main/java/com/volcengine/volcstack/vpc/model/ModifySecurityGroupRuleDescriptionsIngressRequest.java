/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ModifySecurityGroupRuleDescriptionsIngressRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-18T20:48:24.268703+08:00[Asia/Shanghai]")
public class ModifySecurityGroupRuleDescriptionsIngressRequest {
  @SerializedName("CidrIp")
  private String cidrIp = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Policy")
  private String policy = null;

  @SerializedName("PortEnd")
  private Integer portEnd = null;

  @SerializedName("PortStart")
  private Integer portStart = null;

  @SerializedName("Priority")
  private Integer priority = null;

  @SerializedName("Protocol")
  private String protocol = null;

  @SerializedName("SecurityGroupId")
  private String securityGroupId = null;

  @SerializedName("SourceGroupId")
  private String sourceGroupId = null;

  public ModifySecurityGroupRuleDescriptionsIngressRequest cidrIp(String cidrIp) {
    this.cidrIp = cidrIp;
    return this;
  }

   /**
   * Get cidrIp
   * @return cidrIp
  **/
  @Schema(description = "")
  public String getCidrIp() {
    return cidrIp;
  }

  public void setCidrIp(String cidrIp) {
    this.cidrIp = cidrIp;
  }

  public ModifySecurityGroupRuleDescriptionsIngressRequest description(String description) {
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

  public ModifySecurityGroupRuleDescriptionsIngressRequest policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @Schema(description = "")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public ModifySecurityGroupRuleDescriptionsIngressRequest portEnd(Integer portEnd) {
    this.portEnd = portEnd;
    return this;
  }

   /**
   * Get portEnd
   * @return portEnd
  **/
  @Schema(description = "")
  public Integer getPortEnd() {
    return portEnd;
  }

  public void setPortEnd(Integer portEnd) {
    this.portEnd = portEnd;
  }

  public ModifySecurityGroupRuleDescriptionsIngressRequest portStart(Integer portStart) {
    this.portStart = portStart;
    return this;
  }

   /**
   * Get portStart
   * @return portStart
  **/
  @Schema(description = "")
  public Integer getPortStart() {
    return portStart;
  }

  public void setPortStart(Integer portStart) {
    this.portStart = portStart;
  }

  public ModifySecurityGroupRuleDescriptionsIngressRequest priority(Integer priority) {
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

  public ModifySecurityGroupRuleDescriptionsIngressRequest protocol(String protocol) {
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

  public ModifySecurityGroupRuleDescriptionsIngressRequest securityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
    return this;
  }

   /**
   * Get securityGroupId
   * @return securityGroupId
  **/
  @Schema(description = "")
  public String getSecurityGroupId() {
    return securityGroupId;
  }

  public void setSecurityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
  }

  public ModifySecurityGroupRuleDescriptionsIngressRequest sourceGroupId(String sourceGroupId) {
    this.sourceGroupId = sourceGroupId;
    return this;
  }

   /**
   * Get sourceGroupId
   * @return sourceGroupId
  **/
  @Schema(description = "")
  public String getSourceGroupId() {
    return sourceGroupId;
  }

  public void setSourceGroupId(String sourceGroupId) {
    this.sourceGroupId = sourceGroupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifySecurityGroupRuleDescriptionsIngressRequest modifySecurityGroupRuleDescriptionsIngressRequest = (ModifySecurityGroupRuleDescriptionsIngressRequest) o;
    return Objects.equals(this.cidrIp, modifySecurityGroupRuleDescriptionsIngressRequest.cidrIp) &&
        Objects.equals(this.description, modifySecurityGroupRuleDescriptionsIngressRequest.description) &&
        Objects.equals(this.policy, modifySecurityGroupRuleDescriptionsIngressRequest.policy) &&
        Objects.equals(this.portEnd, modifySecurityGroupRuleDescriptionsIngressRequest.portEnd) &&
        Objects.equals(this.portStart, modifySecurityGroupRuleDescriptionsIngressRequest.portStart) &&
        Objects.equals(this.priority, modifySecurityGroupRuleDescriptionsIngressRequest.priority) &&
        Objects.equals(this.protocol, modifySecurityGroupRuleDescriptionsIngressRequest.protocol) &&
        Objects.equals(this.securityGroupId, modifySecurityGroupRuleDescriptionsIngressRequest.securityGroupId) &&
        Objects.equals(this.sourceGroupId, modifySecurityGroupRuleDescriptionsIngressRequest.sourceGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrIp, description, policy, portEnd, portStart, priority, protocol, securityGroupId, sourceGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifySecurityGroupRuleDescriptionsIngressRequest {\n");
    
    sb.append("    cidrIp: ").append(toIndentedString(cidrIp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    portEnd: ").append(toIndentedString(portEnd)).append("\n");
    sb.append("    portStart: ").append(toIndentedString(portStart)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
    sb.append("    sourceGroupId: ").append(toIndentedString(sourceGroupId)).append("\n");
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