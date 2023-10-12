/*
 * FileNAS
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.filenas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.volcengine.filenas.model.CapacityForDescribeFileSystemsOutput;
import com.volcengine.filenas.model.TagForDescribeFileSystemsOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * FileSystemForDescribeFileSystemsOutput
 */


public class FileSystemForDescribeFileSystemsOutput {
  @SerializedName("Capacity")
  private CapacityForDescribeFileSystemsOutput capacity = null;

  @SerializedName("ChargeType")
  private String chargeType = null;

  @SerializedName("CreateTime")
  private String createTime = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("FileSystemId")
  private String fileSystemId = null;

  @SerializedName("FileSystemName")
  private String fileSystemName = null;

  @SerializedName("FileSystemType")
  private String fileSystemType = null;

  @SerializedName("ProjectName")
  private String projectName = null;

  @SerializedName("ProtocolType")
  private String protocolType = null;

  @SerializedName("RegionId")
  private String regionId = null;

  @SerializedName("SnapshotCount")
  private Integer snapshotCount = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("StorageType")
  private String storageType = null;

  @SerializedName("Tags")
  private List<TagForDescribeFileSystemsOutput> tags = null;

  @SerializedName("UpdateTime")
  private String updateTime = null;

  @SerializedName("Version")
  private String version = null;

  @SerializedName("ZoneId")
  private String zoneId = null;

  @SerializedName("ZoneName")
  private String zoneName = null;

  public FileSystemForDescribeFileSystemsOutput capacity(CapacityForDescribeFileSystemsOutput capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @Valid
  @Schema(description = "")
  public CapacityForDescribeFileSystemsOutput getCapacity() {
    return capacity;
  }

  public void setCapacity(CapacityForDescribeFileSystemsOutput capacity) {
    this.capacity = capacity;
  }

  public FileSystemForDescribeFileSystemsOutput chargeType(String chargeType) {
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

  public FileSystemForDescribeFileSystemsOutput createTime(String createTime) {
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

  public FileSystemForDescribeFileSystemsOutput description(String description) {
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

  public FileSystemForDescribeFileSystemsOutput fileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
    return this;
  }

   /**
   * Get fileSystemId
   * @return fileSystemId
  **/
  @Schema(description = "")
  public String getFileSystemId() {
    return fileSystemId;
  }

  public void setFileSystemId(String fileSystemId) {
    this.fileSystemId = fileSystemId;
  }

  public FileSystemForDescribeFileSystemsOutput fileSystemName(String fileSystemName) {
    this.fileSystemName = fileSystemName;
    return this;
  }

   /**
   * Get fileSystemName
   * @return fileSystemName
  **/
  @Schema(description = "")
  public String getFileSystemName() {
    return fileSystemName;
  }

  public void setFileSystemName(String fileSystemName) {
    this.fileSystemName = fileSystemName;
  }

  public FileSystemForDescribeFileSystemsOutput fileSystemType(String fileSystemType) {
    this.fileSystemType = fileSystemType;
    return this;
  }

   /**
   * Get fileSystemType
   * @return fileSystemType
  **/
  @Schema(description = "")
  public String getFileSystemType() {
    return fileSystemType;
  }

  public void setFileSystemType(String fileSystemType) {
    this.fileSystemType = fileSystemType;
  }

  public FileSystemForDescribeFileSystemsOutput projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public FileSystemForDescribeFileSystemsOutput protocolType(String protocolType) {
    this.protocolType = protocolType;
    return this;
  }

   /**
   * Get protocolType
   * @return protocolType
  **/
  @Schema(description = "")
  public String getProtocolType() {
    return protocolType;
  }

  public void setProtocolType(String protocolType) {
    this.protocolType = protocolType;
  }

  public FileSystemForDescribeFileSystemsOutput regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @Schema(description = "")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public FileSystemForDescribeFileSystemsOutput snapshotCount(Integer snapshotCount) {
    this.snapshotCount = snapshotCount;
    return this;
  }

   /**
   * Get snapshotCount
   * @return snapshotCount
  **/
  @Schema(description = "")
  public Integer getSnapshotCount() {
    return snapshotCount;
  }

  public void setSnapshotCount(Integer snapshotCount) {
    this.snapshotCount = snapshotCount;
  }

  public FileSystemForDescribeFileSystemsOutput status(String status) {
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

  public FileSystemForDescribeFileSystemsOutput storageType(String storageType) {
    this.storageType = storageType;
    return this;
  }

   /**
   * Get storageType
   * @return storageType
  **/
  @Schema(description = "")
  public String getStorageType() {
    return storageType;
  }

  public void setStorageType(String storageType) {
    this.storageType = storageType;
  }

  public FileSystemForDescribeFileSystemsOutput tags(List<TagForDescribeFileSystemsOutput> tags) {
    this.tags = tags;
    return this;
  }

  public FileSystemForDescribeFileSystemsOutput addTagsItem(TagForDescribeFileSystemsOutput tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagForDescribeFileSystemsOutput>();
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
  public List<TagForDescribeFileSystemsOutput> getTags() {
    return tags;
  }

  public void setTags(List<TagForDescribeFileSystemsOutput> tags) {
    this.tags = tags;
  }

  public FileSystemForDescribeFileSystemsOutput updateTime(String updateTime) {
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

  public FileSystemForDescribeFileSystemsOutput version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public FileSystemForDescribeFileSystemsOutput zoneId(String zoneId) {
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

  public FileSystemForDescribeFileSystemsOutput zoneName(String zoneName) {
    this.zoneName = zoneName;
    return this;
  }

   /**
   * Get zoneName
   * @return zoneName
  **/
  @Schema(description = "")
  public String getZoneName() {
    return zoneName;
  }

  public void setZoneName(String zoneName) {
    this.zoneName = zoneName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSystemForDescribeFileSystemsOutput fileSystemForDescribeFileSystemsOutput = (FileSystemForDescribeFileSystemsOutput) o;
    return Objects.equals(this.capacity, fileSystemForDescribeFileSystemsOutput.capacity) &&
        Objects.equals(this.chargeType, fileSystemForDescribeFileSystemsOutput.chargeType) &&
        Objects.equals(this.createTime, fileSystemForDescribeFileSystemsOutput.createTime) &&
        Objects.equals(this.description, fileSystemForDescribeFileSystemsOutput.description) &&
        Objects.equals(this.fileSystemId, fileSystemForDescribeFileSystemsOutput.fileSystemId) &&
        Objects.equals(this.fileSystemName, fileSystemForDescribeFileSystemsOutput.fileSystemName) &&
        Objects.equals(this.fileSystemType, fileSystemForDescribeFileSystemsOutput.fileSystemType) &&
        Objects.equals(this.projectName, fileSystemForDescribeFileSystemsOutput.projectName) &&
        Objects.equals(this.protocolType, fileSystemForDescribeFileSystemsOutput.protocolType) &&
        Objects.equals(this.regionId, fileSystemForDescribeFileSystemsOutput.regionId) &&
        Objects.equals(this.snapshotCount, fileSystemForDescribeFileSystemsOutput.snapshotCount) &&
        Objects.equals(this.status, fileSystemForDescribeFileSystemsOutput.status) &&
        Objects.equals(this.storageType, fileSystemForDescribeFileSystemsOutput.storageType) &&
        Objects.equals(this.tags, fileSystemForDescribeFileSystemsOutput.tags) &&
        Objects.equals(this.updateTime, fileSystemForDescribeFileSystemsOutput.updateTime) &&
        Objects.equals(this.version, fileSystemForDescribeFileSystemsOutput.version) &&
        Objects.equals(this.zoneId, fileSystemForDescribeFileSystemsOutput.zoneId) &&
        Objects.equals(this.zoneName, fileSystemForDescribeFileSystemsOutput.zoneName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, chargeType, createTime, description, fileSystemId, fileSystemName, fileSystemType, projectName, protocolType, regionId, snapshotCount, status, storageType, tags, updateTime, version, zoneId, zoneName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSystemForDescribeFileSystemsOutput {\n");
    
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileSystemId: ").append(toIndentedString(fileSystemId)).append("\n");
    sb.append("    fileSystemName: ").append(toIndentedString(fileSystemName)).append("\n");
    sb.append("    fileSystemType: ").append(toIndentedString(fileSystemType)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    snapshotCount: ").append(toIndentedString(snapshotCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
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
