/*
 * ecs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.ecs.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeSubscriptionsRequest
 */


public class DescribeSubscriptionsRequest {
  @SerializedName("MaxResults")
  private String maxResults = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("SubscriptionIds")
  private List<String> subscriptionIds = null;

  @SerializedName("Type")
  private String type = null;

  public DescribeSubscriptionsRequest maxResults(String maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @Schema(description = "")
  public String getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(String maxResults) {
    this.maxResults = maxResults;
  }

  public DescribeSubscriptionsRequest nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @Schema(description = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public DescribeSubscriptionsRequest subscriptionIds(List<String> subscriptionIds) {
    this.subscriptionIds = subscriptionIds;
    return this;
  }

  public DescribeSubscriptionsRequest addSubscriptionIdsItem(String subscriptionIdsItem) {
    if (this.subscriptionIds == null) {
      this.subscriptionIds = new ArrayList<String>();
    }
    this.subscriptionIds.add(subscriptionIdsItem);
    return this;
  }

   /**
   * Get subscriptionIds
   * @return subscriptionIds
  **/
  @Schema(description = "")
  public List<String> getSubscriptionIds() {
    return subscriptionIds;
  }

  public void setSubscriptionIds(List<String> subscriptionIds) {
    this.subscriptionIds = subscriptionIds;
  }

  public DescribeSubscriptionsRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeSubscriptionsRequest describeSubscriptionsRequest = (DescribeSubscriptionsRequest) o;
    return Objects.equals(this.maxResults, describeSubscriptionsRequest.maxResults) &&
        Objects.equals(this.nextToken, describeSubscriptionsRequest.nextToken) &&
        Objects.equals(this.subscriptionIds, describeSubscriptionsRequest.subscriptionIds) &&
        Objects.equals(this.type, describeSubscriptionsRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, nextToken, subscriptionIds, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSubscriptionsRequest {\n");
    
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    subscriptionIds: ").append(toIndentedString(subscriptionIds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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