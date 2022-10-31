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
import com.volcengine.alb.model.RedirectConfigForCreateRulesInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RuleForCreateRulesInput
 */


public class RuleForCreateRulesInput {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("Domain")
  private String domain = null;

  @SerializedName("RedirectConfig")
  private RedirectConfigForCreateRulesInput redirectConfig = null;

  @SerializedName("RuleAction")
  private String ruleAction = null;

  @SerializedName("ServerGroupId")
  private String serverGroupId = null;

  @SerializedName("URL")
  private String URL = null;

  public RuleForCreateRulesInput description(String description) {
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

  public RuleForCreateRulesInput domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @Schema(description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public RuleForCreateRulesInput redirectConfig(RedirectConfigForCreateRulesInput redirectConfig) {
    this.redirectConfig = redirectConfig;
    return this;
  }

   /**
   * Get redirectConfig
   * @return redirectConfig
  **/
  @Valid
  @Schema(description = "")
  public RedirectConfigForCreateRulesInput getRedirectConfig() {
    return redirectConfig;
  }

  public void setRedirectConfig(RedirectConfigForCreateRulesInput redirectConfig) {
    this.redirectConfig = redirectConfig;
  }

  public RuleForCreateRulesInput ruleAction(String ruleAction) {
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

  public RuleForCreateRulesInput serverGroupId(String serverGroupId) {
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

  public RuleForCreateRulesInput URL(String URL) {
    this.URL = URL;
    return this;
  }

   /**
   * Get URL
   * @return URL
  **/
  @Schema(description = "")
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleForCreateRulesInput ruleForCreateRulesInput = (RuleForCreateRulesInput) o;
    return Objects.equals(this.description, ruleForCreateRulesInput.description) &&
        Objects.equals(this.domain, ruleForCreateRulesInput.domain) &&
        Objects.equals(this.redirectConfig, ruleForCreateRulesInput.redirectConfig) &&
        Objects.equals(this.ruleAction, ruleForCreateRulesInput.ruleAction) &&
        Objects.equals(this.serverGroupId, ruleForCreateRulesInput.serverGroupId) &&
        Objects.equals(this.URL, ruleForCreateRulesInput.URL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, domain, redirectConfig, ruleAction, serverGroupId, URL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleForCreateRulesInput {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    redirectConfig: ").append(toIndentedString(redirectConfig)).append("\n");
    sb.append("    ruleAction: ").append(toIndentedString(ruleAction)).append("\n");
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
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
