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
import com.volcengine.clb.model.RuleForDescribeRulesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeRulesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-22T20:23:16.891404+08:00[Asia/Shanghai]")
public class DescribeRulesResponse {
  @SerializedName("RequestId")
  private String requestId = null;

  @SerializedName("Rules")
  private List<RuleForDescribeRulesOutput> rules = null;

  public DescribeRulesResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DescribeRulesResponse rules(List<RuleForDescribeRulesOutput> rules) {
    this.rules = rules;
    return this;
  }

  public DescribeRulesResponse addRulesItem(RuleForDescribeRulesOutput rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<RuleForDescribeRulesOutput>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @Valid
  @Schema(description = "")
  public List<RuleForDescribeRulesOutput> getRules() {
    return rules;
  }

  public void setRules(List<RuleForDescribeRulesOutput> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeRulesResponse describeRulesResponse = (DescribeRulesResponse) o;
    return Objects.equals(this.requestId, describeRulesResponse.requestId) &&
        Objects.equals(this.rules, describeRulesResponse.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeRulesResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
