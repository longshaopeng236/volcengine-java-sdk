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
import com.volcengine.ecs.model.CapacityForDescribeDedicatedHostsOutput;
import com.volcengine.ecs.model.InstanceForDescribeDedicatedHostsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DedicatedHostForDescribeDedicatedHostsOutput
 */


public class DedicatedHostForDescribeDedicatedHostsOutput {
  @SerializedName("AutoPlacement")
  private String autoPlacement = null;

  @SerializedName("Capacity")
  private CapacityForDescribeDedicatedHostsOutput capacity = null;

  @SerializedName("ChargeType")
  private String chargeType = null;

  @SerializedName("CpuOvercommitRatio")
  private Float cpuOvercommitRatio = null;

  @SerializedName("CreatedAt")
  private String createdAt = null;

  @SerializedName("DedicatedHostClusterId")
  private String dedicatedHostClusterId = null;

  @SerializedName("DedicatedHostId")
  private String dedicatedHostId = null;

  @SerializedName("DedicatedHostName")
  private String dedicatedHostName = null;

  @SerializedName("DedicatedHostTypeId")
  private String dedicatedHostTypeId = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("ExpiredAt")
  private String expiredAt = null;

  @SerializedName("HostRecovery")
  private String hostRecovery = null;

  @SerializedName("Instances")
  private List<InstanceForDescribeDedicatedHostsOutput> instances = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdatedAt")
  private String updatedAt = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  public DedicatedHostForDescribeDedicatedHostsOutput autoPlacement(String autoPlacement) {
    this.autoPlacement = autoPlacement;
    return this;
  }

   /**
   * Get autoPlacement
   * @return autoPlacement
  **/
  @Schema(description = "")
  public String getAutoPlacement() {
    return autoPlacement;
  }

  public void setAutoPlacement(String autoPlacement) {
    this.autoPlacement = autoPlacement;
  }

  public DedicatedHostForDescribeDedicatedHostsOutput capacity(CapacityForDescribeDedicatedHostsOutput capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @Valid
  @Schema(description = "")
  public CapacityForDescribeDedicatedHostsOutput getCapacity() {
    return capacity;
  }

  public void setCapacity(CapacityForDescribeDedicatedHostsOutput capacity) {
    this.capacity = capacity;
  }

  public DedicatedHostForDescribeDedicatedHostsOutput chargeType(String chargeType) {
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

  public DedicatedHostForDescribeDedicatedHostsOutput cpuOvercommitRatio(Float cpuOvercommitRatio) {
    this.cpuOvercommitRatio = cpuOvercommitRatio;
    return this;
  }

   /**
   * Get cpuOvercommitRatio
   * @return cpuOvercommitRatio
  **/
  @Schema(description = "")
  public Float getCpuOvercommitRatio() {
    return cpuOvercommitRatio;
  }

  public void setCpuOvercommitRatio(Float cpuOvercommitRatio) {
    this.cpuOvercommitRatio = cpuOvercommitRatio;
  }

  public DedicatedHostForDescribeDedicatedHostsOutput createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public DedicatedHostForDescribeDedicatedHostsOutput dedicatedHostClusterId(String dedicatedHostClusterId) {
    this.dedicatedHostClusterId = dedicatedHostClusterId;
    return this;
  }

   /**
   * Get dedicatedHostClusterId
   * @return dedicatedHostClusterId
  **/
  @Schema(description = "")
  public String getDedicatedHostClusterId() {
    return dedicatedHostClusterId;
  }

  public void setDedicatedHostClusterId(String dedicatedHostClusterId) {
    this.dedicatedHostClusterId = dedicatedHostClusterId;
  }

  public DedicatedHostForDescribeDedicatedHostsOutput dedicatedHostId(String dedicatedHostId) {
    this.dedicatedHostId = dedicatedHostId;
    return this;
  }

   /**
   * Get dedicatedHostId
   * @return dedicatedHostId
  **/
  @Schema(description = "")
  public String getDedicatedHostId() {
    return dedicatedHostId;
  }

  public void setDedicatedHostId(String dedicatedHostId) {
    this.dedicatedHostId = dedicatedHostId;
  }

  public DedicatedHostForDescribeDedicatedHostsOutput dedicatedHostName(String dedicatedHostName) {
    this.dedicatedHostName = dedicatedHostName;
    return this;
  }

   /**
   * Get dedicatedHostName
   * @return dedicatedHostName
  **/
  @Schema(description = "")
  public String getDedicatedHostName() {
    return dedicatedHostName;
  }

  public void setDedicatedHostName(String dedicatedHostName) {
    this.dedicatedHostName = dedicatedHostName;
  }

  public DedicatedHostForDescribeDedicatedHostsOutput dedicatedHostTypeId(String dedicatedHostTypeId) {
    this.dedicatedHostTypeId = dedicatedHostTypeId;
    return this;
  }

   /**
   * Get dedicatedHostTypeId
   * @return dedicatedHostTypeId
  **/
  @Schema(description = "")
  public String getDedicatedHostTypeId() {
    return dedicatedHostTypeId;
  }

  public void setDedicatedHostTypeId(String dedicatedHostTypeId) {
    this.dedicatedHostTypeId = dedicatedHostTypeId;
  }

  public DedicatedHostForDescribeDedicatedHostsOutput description(String description) {
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

  public DedicatedHostForDescribeDedicatedHostsOutput expiredAt(String expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

   /**
   * Get expiredAt
   * @return expiredAt
  **/
  @Schema(description = "")
  public String getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(String expiredAt) {
    this.expiredAt = expiredAt;
  }

  public DedicatedHostForDescribeDedicatedHostsOutput hostRecovery(String hostRecovery) {
    this.hostRecovery = hostRecovery;
    return this;
  }

   /**
   * Get hostRecovery
   * @return hostRecovery
  **/
  @Schema(description = "")
  public String getHostRecovery() {
    return hostRecovery;
  }

  public void setHostRecovery(String hostRecovery) {
    this.hostRecovery = hostRecovery;
  }

  public DedicatedHostForDescribeDedicatedHostsOutput instances(List<InstanceForDescribeDedicatedHostsOutput> instances) {
    this.instances = instances;
    return this;
  }

  public DedicatedHostForDescribeDedicatedHostsOutput addInstancesItem(InstanceForDescribeDedicatedHostsOutput instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<InstanceForDescribeDedicatedHostsOutput>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Get instances
   * @return instances
  **/
  @Valid
  @Schema(description = "")
  public List<InstanceForDescribeDedicatedHostsOutput> getInstances() {
    return instances;
  }

  public void setInstances(List<InstanceForDescribeDedicatedHostsOutput> instances) {
    this.instances = instances;
  }

  public DedicatedHostForDescribeDedicatedHostsOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DedicatedHostForDescribeDedicatedHostsOutput updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public DedicatedHostForDescribeDedicatedHostsOutput zoneId(String zoneId) {
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
    DedicatedHostForDescribeDedicatedHostsOutput dedicatedHostForDescribeDedicatedHostsOutput = (DedicatedHostForDescribeDedicatedHostsOutput) o;
    return Objects.equals(this.autoPlacement, dedicatedHostForDescribeDedicatedHostsOutput.autoPlacement) &&
        Objects.equals(this.capacity, dedicatedHostForDescribeDedicatedHostsOutput.capacity) &&
        Objects.equals(this.chargeType, dedicatedHostForDescribeDedicatedHostsOutput.chargeType) &&
        Objects.equals(this.cpuOvercommitRatio, dedicatedHostForDescribeDedicatedHostsOutput.cpuOvercommitRatio) &&
        Objects.equals(this.createdAt, dedicatedHostForDescribeDedicatedHostsOutput.createdAt) &&
        Objects.equals(this.dedicatedHostClusterId, dedicatedHostForDescribeDedicatedHostsOutput.dedicatedHostClusterId) &&
        Objects.equals(this.dedicatedHostId, dedicatedHostForDescribeDedicatedHostsOutput.dedicatedHostId) &&
        Objects.equals(this.dedicatedHostName, dedicatedHostForDescribeDedicatedHostsOutput.dedicatedHostName) &&
        Objects.equals(this.dedicatedHostTypeId, dedicatedHostForDescribeDedicatedHostsOutput.dedicatedHostTypeId) &&
        Objects.equals(this.description, dedicatedHostForDescribeDedicatedHostsOutput.description) &&
        Objects.equals(this.expiredAt, dedicatedHostForDescribeDedicatedHostsOutput.expiredAt) &&
        Objects.equals(this.hostRecovery, dedicatedHostForDescribeDedicatedHostsOutput.hostRecovery) &&
        Objects.equals(this.instances, dedicatedHostForDescribeDedicatedHostsOutput.instances) &&
        Objects.equals(this.status, dedicatedHostForDescribeDedicatedHostsOutput.status) &&
        Objects.equals(this.updatedAt, dedicatedHostForDescribeDedicatedHostsOutput.updatedAt) &&
        Objects.equals(this.zoneId, dedicatedHostForDescribeDedicatedHostsOutput.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoPlacement, capacity, chargeType, cpuOvercommitRatio, createdAt, dedicatedHostClusterId, dedicatedHostId, dedicatedHostName, dedicatedHostTypeId, description, expiredAt, hostRecovery, instances, status, updatedAt, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DedicatedHostForDescribeDedicatedHostsOutput {\n");
    
    sb.append("    autoPlacement: ").append(toIndentedString(autoPlacement)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    cpuOvercommitRatio: ").append(toIndentedString(cpuOvercommitRatio)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dedicatedHostClusterId: ").append(toIndentedString(dedicatedHostClusterId)).append("\n");
    sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
    sb.append("    dedicatedHostName: ").append(toIndentedString(dedicatedHostName)).append("\n");
    sb.append("    dedicatedHostTypeId: ").append(toIndentedString(dedicatedHostTypeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
    sb.append("    hostRecovery: ").append(toIndentedString(hostRecovery)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
