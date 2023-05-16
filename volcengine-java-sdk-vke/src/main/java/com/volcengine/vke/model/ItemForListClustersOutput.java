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
import com.volcengine.vke.model.ClusterConfigForListClustersOutput;
import com.volcengine.vke.model.LoggingConfigForListClustersOutput;
import com.volcengine.vke.model.NodeStatisticsForListClustersOutput;
import com.volcengine.vke.model.PodsConfigForListClustersOutput;
import com.volcengine.vke.model.ServicesConfigForListClustersOutput;
import com.volcengine.vke.model.StatusForListClustersOutput;
import com.volcengine.vke.model.TagForListClustersOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ItemForListClustersOutput
 */


public class ItemForListClustersOutput {
  @SerializedName("ChargeType")
  private String chargeType = null;

  @SerializedName("ClusterConfig")
  private ClusterConfigForListClustersOutput clusterConfig = null;

  @SerializedName("CreateClientToken")
  private String createClientToken = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("DeleteProtectionEnabled")
  private Boolean deleteProtectionEnabled = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("KubernetesVersion")
  private String kubernetesVersion = null;

  @SerializedName("LoggingConfig")
  private LoggingConfigForListClustersOutput loggingConfig = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("NodeStatistics")
  private NodeStatisticsForListClustersOutput nodeStatistics = null;

  @SerializedName("PodsConfig")
  private PodsConfigForListClustersOutput podsConfig = null;

  @SerializedName("ServicesConfig")
  private ServicesConfigForListClustersOutput servicesConfig = null;

  @SerializedName("Status")
  private StatusForListClustersOutput status = null;

  @SerializedName("Tags")
  private List<TagForListClustersOutput> tags = null;

  @SerializedName("UpdateClientToken")
  private String updateClientToken = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  public ItemForListClustersOutput chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @Schema(description = "")
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public ItemForListClustersOutput clusterConfig(ClusterConfigForListClustersOutput clusterConfig) {
    this.clusterConfig = clusterConfig;
    return this;
  }

   /**
   * Get clusterConfig
   * @return clusterConfig
  **/
  @Valid
  @Schema(description = "")
  public ClusterConfigForListClustersOutput getClusterConfig() {
    return clusterConfig;
  }

  public void setClusterConfig(ClusterConfigForListClustersOutput clusterConfig) {
    this.clusterConfig = clusterConfig;
  }

  public ItemForListClustersOutput createClientToken(String createClientToken) {
    this.createClientToken = createClientToken;
    return this;
  }

   /**
   * Get createClientToken
   * @return createClientToken
  **/
  @Schema(description = "")
  public String getCreateClientToken() {
    return createClientToken;
  }

  public void setCreateClientToken(String createClientToken) {
    this.createClientToken = createClientToken;
  }

  public ItemForListClustersOutput createTime(String createTime) {
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

  public ItemForListClustersOutput deleteProtectionEnabled(Boolean deleteProtectionEnabled) {
    this.deleteProtectionEnabled = deleteProtectionEnabled;
    return this;
  }

   /**
   * Get deleteProtectionEnabled
   * @return deleteProtectionEnabled
  **/
  @Schema(description = "")
  public Boolean isDeleteProtectionEnabled() {
    return deleteProtectionEnabled;
  }

  public void setDeleteProtectionEnabled(Boolean deleteProtectionEnabled) {
    this.deleteProtectionEnabled = deleteProtectionEnabled;
  }

  public ItemForListClustersOutput description(String description) {
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

  public ItemForListClustersOutput id(String id) {
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

  public ItemForListClustersOutput kubernetesVersion(String kubernetesVersion) {
    this.kubernetesVersion = kubernetesVersion;
    return this;
  }

   /**
   * Get kubernetesVersion
   * @return kubernetesVersion
  **/
  @Schema(description = "")
  public String getKubernetesVersion() {
    return kubernetesVersion;
  }

  public void setKubernetesVersion(String kubernetesVersion) {
    this.kubernetesVersion = kubernetesVersion;
  }

  public ItemForListClustersOutput loggingConfig(LoggingConfigForListClustersOutput loggingConfig) {
    this.loggingConfig = loggingConfig;
    return this;
  }

   /**
   * Get loggingConfig
   * @return loggingConfig
  **/
  @Valid
  @Schema(description = "")
  public LoggingConfigForListClustersOutput getLoggingConfig() {
    return loggingConfig;
  }

  public void setLoggingConfig(LoggingConfigForListClustersOutput loggingConfig) {
    this.loggingConfig = loggingConfig;
  }

  public ItemForListClustersOutput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemForListClustersOutput nodeStatistics(NodeStatisticsForListClustersOutput nodeStatistics) {
    this.nodeStatistics = nodeStatistics;
    return this;
  }

   /**
   * Get nodeStatistics
   * @return nodeStatistics
  **/
  @Valid
  @Schema(description = "")
  public NodeStatisticsForListClustersOutput getNodeStatistics() {
    return nodeStatistics;
  }

  public void setNodeStatistics(NodeStatisticsForListClustersOutput nodeStatistics) {
    this.nodeStatistics = nodeStatistics;
  }

  public ItemForListClustersOutput podsConfig(PodsConfigForListClustersOutput podsConfig) {
    this.podsConfig = podsConfig;
    return this;
  }

   /**
   * Get podsConfig
   * @return podsConfig
  **/
  @Valid
  @Schema(description = "")
  public PodsConfigForListClustersOutput getPodsConfig() {
    return podsConfig;
  }

  public void setPodsConfig(PodsConfigForListClustersOutput podsConfig) {
    this.podsConfig = podsConfig;
  }

  public ItemForListClustersOutput servicesConfig(ServicesConfigForListClustersOutput servicesConfig) {
    this.servicesConfig = servicesConfig;
    return this;
  }

   /**
   * Get servicesConfig
   * @return servicesConfig
  **/
  @Valid
  @Schema(description = "")
  public ServicesConfigForListClustersOutput getServicesConfig() {
    return servicesConfig;
  }

  public void setServicesConfig(ServicesConfigForListClustersOutput servicesConfig) {
    this.servicesConfig = servicesConfig;
  }

  public ItemForListClustersOutput status(StatusForListClustersOutput status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Valid
  @Schema(description = "")
  public StatusForListClustersOutput getStatus() {
    return status;
  }

  public void setStatus(StatusForListClustersOutput status) {
    this.status = status;
  }

  public ItemForListClustersOutput tags(List<TagForListClustersOutput> tags) {
    this.tags = tags;
    return this;
  }

  public ItemForListClustersOutput addTagsItem(TagForListClustersOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForListClustersOutput>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Valid
  @Schema(description = "")
  public List<TagForListClustersOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForListClustersOutput> tags) {
    this.tags = tags;
  }

  public ItemForListClustersOutput updateClientToken(String updateClientToken) {
    this.updateClientToken = updateClientToken;
    return this;
  }

   /**
   * Get updateClientToken
   * @return updateClientToken
  **/
  @Schema(description = "")
  public String getUpdateClientToken() {
    return updateClientToken;
  }

  public void setUpdateClientToken(String updateClientToken) {
    this.updateClientToken = updateClientToken;
  }

  public ItemForListClustersOutput updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemForListClustersOutput itemForListClustersOutput = (ItemForListClustersOutput) o;
    return Objects.equals(this.chargeType, itemForListClustersOutput.chargeType) &&
        Objects.equals(this.clusterConfig, itemForListClustersOutput.clusterConfig) &&
        Objects.equals(this.createClientToken, itemForListClustersOutput.createClientToken) &&
        Objects.equals(this.createTime, itemForListClustersOutput.createTime) &&
        Objects.equals(this.deleteProtectionEnabled, itemForListClustersOutput.deleteProtectionEnabled) &&
        Objects.equals(this.description, itemForListClustersOutput.description) &&
        Objects.equals(this.id, itemForListClustersOutput.id) &&
        Objects.equals(this.kubernetesVersion, itemForListClustersOutput.kubernetesVersion) &&
        Objects.equals(this.loggingConfig, itemForListClustersOutput.loggingConfig) &&
        Objects.equals(this.name, itemForListClustersOutput.name) &&
        Objects.equals(this.nodeStatistics, itemForListClustersOutput.nodeStatistics) &&
        Objects.equals(this.podsConfig, itemForListClustersOutput.podsConfig) &&
        Objects.equals(this.servicesConfig, itemForListClustersOutput.servicesConfig) &&
        Objects.equals(this.status, itemForListClustersOutput.status) &&
        Objects.equals(this.tags, itemForListClustersOutput.tags) &&
        Objects.equals(this.updateClientToken, itemForListClustersOutput.updateClientToken) &&
        Objects.equals(this.updateTime, itemForListClustersOutput.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeType, clusterConfig, createClientToken, createTime, deleteProtectionEnabled, description, id, kubernetesVersion, loggingConfig, name, nodeStatistics, podsConfig, servicesConfig, status, tags, updateClientToken, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemForListClustersOutput {\n");
    
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    clusterConfig: ").append(toIndentedString(clusterConfig)).append("\n");
    sb.append("    createClientToken: ").append(toIndentedString(createClientToken)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    deleteProtectionEnabled: ").append(toIndentedString(deleteProtectionEnabled)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kubernetesVersion: ").append(toIndentedString(kubernetesVersion)).append("\n");
    sb.append("    loggingConfig: ").append(toIndentedString(loggingConfig)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeStatistics: ").append(toIndentedString(nodeStatistics)).append("\n");
    sb.append("    podsConfig: ").append(toIndentedString(podsConfig)).append("\n");
    sb.append("    servicesConfig: ").append(toIndentedString(servicesConfig)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updateClientToken: ").append(toIndentedString(updateClientToken)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
