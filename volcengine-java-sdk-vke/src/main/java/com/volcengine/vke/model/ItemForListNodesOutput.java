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
import com.volcengine.vke.model.StatusForListNodesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ItemForListNodesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-15T17:50:31.831766+08:00[Asia/Shanghai]")
public class ItemForListNodesOutput {
  @SerializedName("AdditionalContainerStorageEnabled")
  private Boolean additionalContainerStorageEnabled = null;

  @SerializedName("ClusterId")
  private String clusterId = null;

  @SerializedName("ContainerStoragePath")
  private String containerStoragePath = null;

  @SerializedName("CreateClientToken")
  private String createClientToken = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Id")
  private String id = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("IsVirtual")
  private Boolean isVirtual = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("NodePoolId")
  private String nodePoolId = null;

  /**
   * Gets or Sets roles
   */
  @JsonAdapter(RolesEnum.Adapter.class)
  public enum RolesEnum {
    ETCD("Etcd"),
    MASTER("Master"),
    WORKER("Worker");

    private String value;

    RolesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RolesEnum fromValue(String input) {
      for (RolesEnum b : RolesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RolesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RolesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RolesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RolesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("Roles")
  private List<RolesEnum> roles = null;

  @SerializedName("Status")
  private StatusForListNodesOutput status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public ItemForListNodesOutput additionalContainerStorageEnabled(Boolean additionalContainerStorageEnabled) {
    this.additionalContainerStorageEnabled = additionalContainerStorageEnabled;
    return this;
  }

   /**
   * Get additionalContainerStorageEnabled
   * @return additionalContainerStorageEnabled
  **/
  @Schema(description = "")
  public Boolean isAdditionalContainerStorageEnabled() {
    return additionalContainerStorageEnabled;
  }

  public void setAdditionalContainerStorageEnabled(Boolean additionalContainerStorageEnabled) {
    this.additionalContainerStorageEnabled = additionalContainerStorageEnabled;
  }

  public ItemForListNodesOutput clusterId(String clusterId) {
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

  public ItemForListNodesOutput containerStoragePath(String containerStoragePath) {
    this.containerStoragePath = containerStoragePath;
    return this;
  }

   /**
   * Get containerStoragePath
   * @return containerStoragePath
  **/
  @Schema(description = "")
  public String getContainerStoragePath() {
    return containerStoragePath;
  }

  public void setContainerStoragePath(String containerStoragePath) {
    this.containerStoragePath = containerStoragePath;
  }

  public ItemForListNodesOutput createClientToken(String createClientToken) {
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

  public ItemForListNodesOutput createTime(String createTime) {
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

  public ItemForListNodesOutput id(String id) {
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

  public ItemForListNodesOutput instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public ItemForListNodesOutput isVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
    return this;
  }

   /**
   * Get isVirtual
   * @return isVirtual
  **/
  @Schema(description = "")
  public Boolean isIsVirtual() {
    return isVirtual;
  }

  public void setIsVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
  }

  public ItemForListNodesOutput name(String name) {
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

  public ItemForListNodesOutput nodePoolId(String nodePoolId) {
    this.nodePoolId = nodePoolId;
    return this;
  }

   /**
   * Get nodePoolId
   * @return nodePoolId
  **/
  @Schema(description = "")
  public String getNodePoolId() {
    return nodePoolId;
  }

  public void setNodePoolId(String nodePoolId) {
    this.nodePoolId = nodePoolId;
  }

  public ItemForListNodesOutput roles(List<RolesEnum> roles) {
    this.roles = roles;
    return this;
  }

  public ItemForListNodesOutput addRolesItem(RolesEnum rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<RolesEnum>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @Schema(description = "")
  public List<RolesEnum> getRoles() {
    return roles;
  }

  public void setRoles(List<RolesEnum> roles) {
    this.roles = roles;
  }

  public ItemForListNodesOutput status(StatusForListNodesOutput status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Valid
  @Schema(description = "")
  public StatusForListNodesOutput getStatus() {
    return status;
  }

  public void setStatus(StatusForListNodesOutput status) {
    this.status = status;
  }

  public ItemForListNodesOutput updateTime(String updateTime) {
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

  public ItemForListNodesOutput zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemForListNodesOutput itemForListNodesOutput = (ItemForListNodesOutput) o;
    return Objects.equals(this.additionalContainerStorageEnabled, itemForListNodesOutput.additionalContainerStorageEnabled) &&
        Objects.equals(this.clusterId, itemForListNodesOutput.clusterId) &&
        Objects.equals(this.containerStoragePath, itemForListNodesOutput.containerStoragePath) &&
        Objects.equals(this.createClientToken, itemForListNodesOutput.createClientToken) &&
        Objects.equals(this.createTime, itemForListNodesOutput.createTime) &&
        Objects.equals(this.id, itemForListNodesOutput.id) &&
        Objects.equals(this.instanceId, itemForListNodesOutput.instanceId) &&
        Objects.equals(this.isVirtual, itemForListNodesOutput.isVirtual) &&
        Objects.equals(this.name, itemForListNodesOutput.name) &&
        Objects.equals(this.nodePoolId, itemForListNodesOutput.nodePoolId) &&
        Objects.equals(this.roles, itemForListNodesOutput.roles) &&
        Objects.equals(this.status, itemForListNodesOutput.status) &&
        Objects.equals(this.updateTime, itemForListNodesOutput.updateTime) &&
        Objects.equals(this.zoneId, itemForListNodesOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalContainerStorageEnabled, clusterId, containerStoragePath, createClientToken, createTime, id, instanceId, isVirtual, name, nodePoolId, roles, status, updateTime, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemForListNodesOutput {\n");
    
    sb.append("    additionalContainerStorageEnabled: ").append(toIndentedString(additionalContainerStorageEnabled)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    containerStoragePath: ").append(toIndentedString(containerStoragePath)).append("\n");
    sb.append("    createClientToken: ").append(toIndentedString(createClientToken)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    isVirtual: ").append(toIndentedString(isVirtual)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodePoolId: ").append(toIndentedString(nodePoolId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
