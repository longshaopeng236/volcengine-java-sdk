/*
 * kafka
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.kafka.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.kafka.model.AccessPolicyForDescribeTopicAccessPoliciesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeTopicAccessPoliciesResponse
 */


public class DescribeTopicAccessPoliciesResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("AccessPolicies")
  private List<AccessPolicyForDescribeTopicAccessPoliciesOutput> accessPolicies = null;

  @SerializedName("AllAuthority")
  private Boolean allAuthority = null;

  public DescribeTopicAccessPoliciesResponse accessPolicies(List<AccessPolicyForDescribeTopicAccessPoliciesOutput> accessPolicies) {
    this.accessPolicies = accessPolicies;
    return this;
  }

  public DescribeTopicAccessPoliciesResponse addAccessPoliciesItem(AccessPolicyForDescribeTopicAccessPoliciesOutput accessPoliciesItem) {
    if (this.accessPolicies == null) {
      this.accessPolicies = new ArrayList<AccessPolicyForDescribeTopicAccessPoliciesOutput>();
    }
    this.accessPolicies.add(accessPoliciesItem);
    return this;
  }

   /**
   * Get accessPolicies
   * @return accessPolicies
  **/
  @Valid
  @Schema(description = "")
  public List<AccessPolicyForDescribeTopicAccessPoliciesOutput> getAccessPolicies() {
    return accessPolicies;
  }

  public void setAccessPolicies(List<AccessPolicyForDescribeTopicAccessPoliciesOutput> accessPolicies) {
    this.accessPolicies = accessPolicies;
  }

  public DescribeTopicAccessPoliciesResponse allAuthority(Boolean allAuthority) {
    this.allAuthority = allAuthority;
    return this;
  }

   /**
   * Get allAuthority
   * @return allAuthority
  **/
  @Schema(description = "")
  public Boolean isAllAuthority() {
    return allAuthority;
  }

  public void setAllAuthority(Boolean allAuthority) {
    this.allAuthority = allAuthority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeTopicAccessPoliciesResponse describeTopicAccessPoliciesResponse = (DescribeTopicAccessPoliciesResponse) o;
    return Objects.equals(this.accessPolicies, describeTopicAccessPoliciesResponse.accessPolicies) &&
        Objects.equals(this.allAuthority, describeTopicAccessPoliciesResponse.allAuthority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPolicies, allAuthority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeTopicAccessPoliciesResponse {\n");
    
    sb.append("    accessPolicies: ").append(toIndentedString(accessPolicies)).append("\n");
    sb.append("    allAuthority: ").append(toIndentedString(allAuthority)).append("\n");
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
