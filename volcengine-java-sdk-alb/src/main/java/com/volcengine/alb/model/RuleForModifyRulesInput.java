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
import com.volcengine.alb.model.RedirectConfigForModifyRulesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RuleForModifyRulesInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-18T11:53:48.716788+08:00[Asia/Shanghai]")
public class RuleForModifyRulesInput {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("RedirectConfig")
  private RedirectConfigForModifyRulesInput redirectConfig = null;

  @SerializedName("RuleAction")
  private String ruleAction = null;

  @SerializedName("RuleId")
  private String ruleId = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  public RuleForModifyRulesInput description(String description) {
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

  public RuleForModifyRulesInput redirectConfig(RedirectConfigForModifyRulesInput redirectConfig) {
    this.redirectConfig = redirectConfig;
    return this;
  }

   /**
   * Get redirectConfig
   * @return redirectConfig
  **/
  @Valid
  @Schema(description = "")
  public RedirectConfigForModifyRulesInput getRedirectConfig() {
    return redirectConfig;
  }

  public void setRedirectConfig(RedirectConfigForModifyRulesInput redirectConfig) {
    this.redirectConfig = redirectConfig;
  }

  public RuleForModifyRulesInput ruleAction(String ruleAction) {
    this.ruleAction = ruleAction;
    return this;
  }

   /**
   * Get ruleAction
   * @return ruleAction
  **/
  @Schema(description = "")
  public String getRuleAction() {
    return ruleAction;
  }

  public void setRuleAction(String ruleAction) {
    this.ruleAction = ruleAction;
  }

  public RuleForModifyRulesInput ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Get ruleId
   * @return ruleId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public RuleForModifyRulesInput serverGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
    return this;
  }

   /**
   * Get serverGroupId
   * @return serverGroupId
  **/
  @Schema(description = "")
  public String getServerGroupId() {
    return serverGroupId;
  }

  public void setServerGroupId(String serverGroupId) {
    this.serverGroupId = serverGroupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleForModifyRulesInput ruleForModifyRulesInput = (RuleForModifyRulesInput) o;
    return Objects.equals(this.description, ruleForModifyRulesInput.description) &&
        Objects.equals(this.redirectConfig, ruleForModifyRulesInput.redirectConfig) &&
        Objects.equals(this.ruleAction, ruleForModifyRulesInput.ruleAction) &&
        Objects.equals(this.ruleId, ruleForModifyRulesInput.ruleId) &&
        Objects.equals(this.serverGroupId, ruleForModifyRulesInput.serverGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, redirectConfig, ruleAction, ruleId, serverGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleForModifyRulesInput {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    redirectConfig: ").append(toIndentedString(redirectConfig)).append("\n");
    sb.append("    ruleAction: ").append(toIndentedString(ruleAction)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
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