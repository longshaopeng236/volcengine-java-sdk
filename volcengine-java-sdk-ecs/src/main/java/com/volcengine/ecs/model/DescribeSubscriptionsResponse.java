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
import com.volcengine.ecs.model.SubscriptionForDescribeSubscriptionsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeSubscriptionsResponse
 */


public class DescribeSubscriptionsResponse {
  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("Subscriptions")
  private List<SubscriptionForDescribeSubscriptionsOutput> subscriptions = null;

  public DescribeSubscriptionsResponse nextToken(String nextToken) {
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

  public DescribeSubscriptionsResponse subscriptions(List<SubscriptionForDescribeSubscriptionsOutput> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public DescribeSubscriptionsResponse addSubscriptionsItem(SubscriptionForDescribeSubscriptionsOutput subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<SubscriptionForDescribeSubscriptionsOutput>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @Valid
  @Schema(description = "")
  public List<SubscriptionForDescribeSubscriptionsOutput> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<SubscriptionForDescribeSubscriptionsOutput> subscriptions) {
    this.subscriptions = subscriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeSubscriptionsResponse describeSubscriptionsResponse = (DescribeSubscriptionsResponse) o;
    return Objects.equals(this.nextToken, describeSubscriptionsResponse.nextToken) &&
        Objects.equals(this.subscriptions, describeSubscriptionsResponse.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, subscriptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSubscriptionsResponse {\n");
    
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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