/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.vpc.model.EgressAclEntryForDescribeNetworkAclAttributesOutput;
import com.volcengine.vpc.model.IngressAclEntryForDescribeNetworkAclAttributesOutput;
import com.volcengine.vpc.model.ResourceForDescribeNetworkAclAttributesOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * NetworkAclAttributeForDescribeNetworkAclAttributesOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-14T18:23:24.287880+08:00[Asia/Shanghai]")
public class NetworkAclAttributeForDescribeNetworkAclAttributesOutput {
  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("EgressAclEntries")
  private List<EgressAclEntryForDescribeNetworkAclAttributesOutput> egressAclEntries = null;

  @SerializedName("IngressAclEntries")
  private List<IngressAclEntryForDescribeNetworkAclAttributesOutput> ingressAclEntries = null;

  @SerializedName("NetworkAclId")
  private String networkAclId = null;

  @SerializedName("NetworkAclName")
  private String networkAclName = null;

  @SerializedName("Resources")
  private List<ResourceForDescribeNetworkAclAttributesOutput> resources = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("VpcId")
  private String vpcId = null;

  public NetworkAclAttributeForDescribeNetworkAclAttributesOutput creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public NetworkAclAttributeForDescribeNetworkAclAttributesOutput description(String description) {
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

  public NetworkAclAttributeForDescribeNetworkAclAttributesOutput egressAclEntries(List<EgressAclEntryForDescribeNetworkAclAttributesOutput> egressAclEntries) {
    this.egressAclEntries = egressAclEntries;
    return this;
  }

  public NetworkAclAttributeForDescribeNetworkAclAttributesOutput addEgressAclEntriesItem(EgressAclEntryForDescribeNetworkAclAttributesOutput egressAclEntriesItem) {
    if (this.egressAclEntries == null) {
      this.egressAclEntries = new ArrayList<EgressAclEntryForDescribeNetworkAclAttributesOutput>();
    }
    this.egressAclEntries.add(egressAclEntriesItem);
    return this;
  }

   /**
   * Get egressAclEntries
   * @return egressAclEntries
  **/
  @Valid
  @Schema(description = "")
  public List<EgressAclEntryForDescribeNetworkAclAttributesOutput> getEgressAclEntries() {
    return egressAclEntries;
  }

  public void setEgressAclEntries(List<EgressAclEntryForDescribeNetworkAclAttributesOutput> egressAclEntries) {
    this.egressAclEntries = egressAclEntries;
  }

  public NetworkAclAttributeForDescribeNetworkAclAttributesOutput ingressAclEntries(List<IngressAclEntryForDescribeNetworkAclAttributesOutput> ingressAclEntries) {
    this.ingressAclEntries = ingressAclEntries;
    return this;
  }

  public NetworkAclAttributeForDescribeNetworkAclAttributesOutput addIngressAclEntriesItem(IngressAclEntryForDescribeNetworkAclAttributesOutput ingressAclEntriesItem) {
    if (this.ingressAclEntries == null) {
      this.ingressAclEntries = new ArrayList<IngressAclEntryForDescribeNetworkAclAttributesOutput>();
    }
    this.ingressAclEntries.add(ingressAclEntriesItem);
    return this;
  }

   /**
   * Get ingressAclEntries
   * @return ingressAclEntries
  **/
  @Valid
  @Schema(description = "")
  public List<IngressAclEntryForDescribeNetworkAclAttributesOutput> getIngressAclEntries() {
    return ingressAclEntries;
  }

  public void setIngressAclEntries(List<IngressAclEntryForDescribeNetworkAclAttributesOutput> ingressAclEntries) {
    this.ingressAclEntries = ingressAclEntries;
  }

  public NetworkAclAttributeForDescribeNetworkAclAttributesOutput networkAclId(String networkAclId) {
    this.networkAclId = networkAclId;
    return this;
  }

   /**
   * Get networkAclId
   * @return networkAclId
  **/
  @Schema(description = "")
  public String getNetworkAclId() {
    return networkAclId;
  }

  public void setNetworkAclId(String networkAclId) {
    this.networkAclId = networkAclId;
  }

  public NetworkAclAttributeForDescribeNetworkAclAttributesOutput networkAclName(String networkAclName) {
    this.networkAclName = networkAclName;
    return this;
  }

   /**
   * Get networkAclName
   * @return networkAclName
  **/
  @Schema(description = "")
  public String getNetworkAclName() {
    return networkAclName;
  }

  public void setNetworkAclName(String networkAclName) {
    this.networkAclName = networkAclName;
  }

  public NetworkAclAttributeForDescribeNetworkAclAttributesOutput resources(List<ResourceForDescribeNetworkAclAttributesOutput> resources) {
    this.resources = resources;
    return this;
  }

  public NetworkAclAttributeForDescribeNetworkAclAttributesOutput addResourcesItem(ResourceForDescribeNetworkAclAttributesOutput resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<ResourceForDescribeNetworkAclAttributesOutput>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @Valid
  @Schema(description = "")
  public List<ResourceForDescribeNetworkAclAttributesOutput> getResources() {
    return resources;
  }

  public void setResources(List<ResourceForDescribeNetworkAclAttributesOutput> resources) {
    this.resources = resources;
  }

  public NetworkAclAttributeForDescribeNetworkAclAttributesOutput status(String status) {
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

  public NetworkAclAttributeForDescribeNetworkAclAttributesOutput updateTime(String updateTime) {
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

  public NetworkAclAttributeForDescribeNetworkAclAttributesOutput vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(description = "")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkAclAttributeForDescribeNetworkAclAttributesOutput networkAclAttributeForDescribeNetworkAclAttributesOutput = (NetworkAclAttributeForDescribeNetworkAclAttributesOutput) o;
    return Objects.equals(this.creationTime, networkAclAttributeForDescribeNetworkAclAttributesOutput.creationTime) &&
        Objects.equals(this.description, networkAclAttributeForDescribeNetworkAclAttributesOutput.description) &&
        Objects.equals(this.egressAclEntries, networkAclAttributeForDescribeNetworkAclAttributesOutput.egressAclEntries) &&
        Objects.equals(this.ingressAclEntries, networkAclAttributeForDescribeNetworkAclAttributesOutput.ingressAclEntries) &&
        Objects.equals(this.networkAclId, networkAclAttributeForDescribeNetworkAclAttributesOutput.networkAclId) &&
        Objects.equals(this.networkAclName, networkAclAttributeForDescribeNetworkAclAttributesOutput.networkAclName) &&
        Objects.equals(this.resources, networkAclAttributeForDescribeNetworkAclAttributesOutput.resources) &&
        Objects.equals(this.status, networkAclAttributeForDescribeNetworkAclAttributesOutput.status) &&
        Objects.equals(this.updateTime, networkAclAttributeForDescribeNetworkAclAttributesOutput.updateTime) &&
        Objects.equals(this.vpcId, networkAclAttributeForDescribeNetworkAclAttributesOutput.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, description, egressAclEntries, ingressAclEntries, networkAclId, networkAclName, resources, status, updateTime, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkAclAttributeForDescribeNetworkAclAttributesOutput {\n");
    
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    egressAclEntries: ").append(toIndentedString(egressAclEntries)).append("\n");
    sb.append("    ingressAclEntries: ").append(toIndentedString(ingressAclEntries)).append("\n");
    sb.append("    networkAclId: ").append(toIndentedString(networkAclId)).append("\n");
    sb.append("    networkAclName: ").append(toIndentedString(networkAclName)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
