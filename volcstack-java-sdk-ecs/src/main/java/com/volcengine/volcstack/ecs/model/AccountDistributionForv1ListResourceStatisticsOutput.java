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

package com.volcengine.volcstack.ecs.model;

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
 * AccountDistributionForv1ListResourceStatisticsOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-24T15:52:32.918937+08:00[Asia/Shanghai]")
public class AccountDistributionForv1ListResourceStatisticsOutput {
  @SerializedName("AccountID")
  private String accountID = null;

  @SerializedName("InsOtherNum")
  private Integer insOtherNum = null;

  @SerializedName("InsRunningNum")
  private Integer insRunningNum = null;

  @SerializedName("InsStoppedNum")
  private Integer insStoppedNum = null;

  @SerializedName("InsTotalNum")
  private Integer insTotalNum = null;

  @SerializedName("VolumeNum")
  private Integer volumeNum = null;

  public AccountDistributionForv1ListResourceStatisticsOutput accountID(String accountID) {
    this.accountID = accountID;
    return this;
  }

   /**
   * Get accountID
   * @return accountID
  **/
  @Schema(description = "")
  public String getAccountID() {
    return accountID;
  }

  public void setAccountID(String accountID) {
    this.accountID = accountID;
  }

  public AccountDistributionForv1ListResourceStatisticsOutput insOtherNum(Integer insOtherNum) {
    this.insOtherNum = insOtherNum;
    return this;
  }

   /**
   * Get insOtherNum
   * @return insOtherNum
  **/
  @Schema(description = "")
  public Integer getInsOtherNum() {
    return insOtherNum;
  }

  public void setInsOtherNum(Integer insOtherNum) {
    this.insOtherNum = insOtherNum;
  }

  public AccountDistributionForv1ListResourceStatisticsOutput insRunningNum(Integer insRunningNum) {
    this.insRunningNum = insRunningNum;
    return this;
  }

   /**
   * Get insRunningNum
   * @return insRunningNum
  **/
  @Schema(description = "")
  public Integer getInsRunningNum() {
    return insRunningNum;
  }

  public void setInsRunningNum(Integer insRunningNum) {
    this.insRunningNum = insRunningNum;
  }

  public AccountDistributionForv1ListResourceStatisticsOutput insStoppedNum(Integer insStoppedNum) {
    this.insStoppedNum = insStoppedNum;
    return this;
  }

   /**
   * Get insStoppedNum
   * @return insStoppedNum
  **/
  @Schema(description = "")
  public Integer getInsStoppedNum() {
    return insStoppedNum;
  }

  public void setInsStoppedNum(Integer insStoppedNum) {
    this.insStoppedNum = insStoppedNum;
  }

  public AccountDistributionForv1ListResourceStatisticsOutput insTotalNum(Integer insTotalNum) {
    this.insTotalNum = insTotalNum;
    return this;
  }

   /**
   * Get insTotalNum
   * @return insTotalNum
  **/
  @Schema(description = "")
  public Integer getInsTotalNum() {
    return insTotalNum;
  }

  public void setInsTotalNum(Integer insTotalNum) {
    this.insTotalNum = insTotalNum;
  }

  public AccountDistributionForv1ListResourceStatisticsOutput volumeNum(Integer volumeNum) {
    this.volumeNum = volumeNum;
    return this;
  }

   /**
   * Get volumeNum
   * @return volumeNum
  **/
  @Schema(description = "")
  public Integer getVolumeNum() {
    return volumeNum;
  }

  public void setVolumeNum(Integer volumeNum) {
    this.volumeNum = volumeNum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDistributionForv1ListResourceStatisticsOutput accountDistributionForv1ListResourceStatisticsOutput = (AccountDistributionForv1ListResourceStatisticsOutput) o;
    return Objects.equals(this.accountID, accountDistributionForv1ListResourceStatisticsOutput.accountID) &&
        Objects.equals(this.insOtherNum, accountDistributionForv1ListResourceStatisticsOutput.insOtherNum) &&
        Objects.equals(this.insRunningNum, accountDistributionForv1ListResourceStatisticsOutput.insRunningNum) &&
        Objects.equals(this.insStoppedNum, accountDistributionForv1ListResourceStatisticsOutput.insStoppedNum) &&
        Objects.equals(this.insTotalNum, accountDistributionForv1ListResourceStatisticsOutput.insTotalNum) &&
        Objects.equals(this.volumeNum, accountDistributionForv1ListResourceStatisticsOutput.volumeNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountID, insOtherNum, insRunningNum, insStoppedNum, insTotalNum, volumeNum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDistributionForv1ListResourceStatisticsOutput {\n");
    
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    insOtherNum: ").append(toIndentedString(insOtherNum)).append("\n");
    sb.append("    insRunningNum: ").append(toIndentedString(insRunningNum)).append("\n");
    sb.append("    insStoppedNum: ").append(toIndentedString(insStoppedNum)).append("\n");
    sb.append("    insTotalNum: ").append(toIndentedString(insTotalNum)).append("\n");
    sb.append("    volumeNum: ").append(toIndentedString(volumeNum)).append("\n");
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
