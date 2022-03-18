/*
 * vpc
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.volcstack.vpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AssociateHaVipRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-18T20:48:24.268703+08:00[Asia/Shanghai]")
public class AssociateHaVipRequest {
  @SerializedName("HaVipId")
  private String haVipId = null;

  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("InstanceType")
  private String instanceType = null;

  public AssociateHaVipRequest haVipId(String haVipId) {
    this.haVipId = haVipId;
    return this;
  }

   /**
   * Get haVipId
   * @return haVipId
  **/
  @Schema(description = "")
  public String getHaVipId() {
    return haVipId;
  }

  public void setHaVipId(String haVipId) {
    this.haVipId = haVipId;
  }

  public AssociateHaVipRequest instanceId(String instanceId) {
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

  public AssociateHaVipRequest instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociateHaVipRequest associateHaVipRequest = (AssociateHaVipRequest) o;
    return Objects.equals(this.haVipId, associateHaVipRequest.haVipId) &&
        Objects.equals(this.instanceId, associateHaVipRequest.instanceId) &&
        Objects.equals(this.instanceType, associateHaVipRequest.instanceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(haVipId, instanceId, instanceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociateHaVipRequest {\n");
    
    sb.append("    haVipId: ").append(toIndentedString(haVipId)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
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
