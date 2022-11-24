/*
 * vke
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vke.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ForwardKubernetesApiRequest
 */


public class ForwardKubernetesApiRequest {
  @SerializedName("Body")
  private String body = null;

  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("Headers")
  private Map<String, List<String>> headers = null;

  @SerializedName("Method")
  private String method = null;

  @SerializedName("Path")
  private String path = null;

  public ForwardKubernetesApiRequest body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @Schema(description = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public ForwardKubernetesApiRequest clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @Schema(description = "")
  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public ForwardKubernetesApiRequest headers(Map<String, List<String>> headers) {
    this.headers = headers;
    return this;
  }

  public ForwardKubernetesApiRequest putHeadersItem(String key, List<String> headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, List<String>>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @Valid
  @Schema(description = "")
  public Map<String, List<String>> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, List<String>> headers) {
    this.headers = headers;
  }

  public ForwardKubernetesApiRequest method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @Schema(description = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public ForwardKubernetesApiRequest path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForwardKubernetesApiRequest forwardKubernetesApiRequest = (ForwardKubernetesApiRequest) o;
    return Objects.equals(this.body, forwardKubernetesApiRequest.body) &&
        Objects.equals(this.clusterId, forwardKubernetesApiRequest.clusterId) &&
        Objects.equals(this.headers, forwardKubernetesApiRequest.headers) &&
        Objects.equals(this.method, forwardKubernetesApiRequest.method) &&
        Objects.equals(this.path, forwardKubernetesApiRequest.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, clusterId, headers, method, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForwardKubernetesApiRequest {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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