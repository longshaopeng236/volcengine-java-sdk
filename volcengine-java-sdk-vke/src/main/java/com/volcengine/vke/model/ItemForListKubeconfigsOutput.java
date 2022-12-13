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
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ItemForListKubeconfigsOutput
 */


public class ItemForListKubeconfigsOutput {
  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("ExpireTime")
  private String expireTime = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("Kubeconfig")
  private String kubeconfig = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("UserId")
  private Long userId = null;

  public ItemForListKubeconfigsOutput clusterId(String clusterId) {
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

  public ItemForListKubeconfigsOutput createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public ItemForListKubeconfigsOutput expireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

   /**
   * Get expireTime
   * @return expireTime
  **/
  @Schema(description = "")
  public String getExpireTime() {
    return expireTime;
  }

  public void setExpireTime(String expireTime) {
    this.expireTime = expireTime;
  }

  public ItemForListKubeconfigsOutput id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ItemForListKubeconfigsOutput kubeconfig(String kubeconfig) {
    this.kubeconfig = kubeconfig;
    return this;
  }

   /**
   * Get kubeconfig
   * @return kubeconfig
  **/
  @Schema(description = "")
  public String getKubeconfig() {
    return kubeconfig;
  }

  public void setKubeconfig(String kubeconfig) {
    this.kubeconfig = kubeconfig;
  }

  public ItemForListKubeconfigsOutput type(String type) {
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

  public ItemForListKubeconfigsOutput userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemForListKubeconfigsOutput itemForListKubeconfigsOutput = (ItemForListKubeconfigsOutput) o;
    return Objects.equals(this.clusterId, itemForListKubeconfigsOutput.clusterId) &&
        Objects.equals(this.createTime, itemForListKubeconfigsOutput.createTime) &&
        Objects.equals(this.expireTime, itemForListKubeconfigsOutput.expireTime) &&
        Objects.equals(this.id, itemForListKubeconfigsOutput.id) &&
        Objects.equals(this.kubeconfig, itemForListKubeconfigsOutput.kubeconfig) &&
        Objects.equals(this.type, itemForListKubeconfigsOutput.type) &&
        Objects.equals(this.userId, itemForListKubeconfigsOutput.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, createTime, expireTime, id, kubeconfig, type, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemForListKubeconfigsOutput {\n");
    
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kubeconfig: ").append(toIndentedString(kubeconfig)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
