/*
 * rds_mysql_v2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.rdsmysqlv2.model;

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
 * ModifyDBInstanceChargeTypeResponse
 */


public class ModifyDBInstanceChargeTypeResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("InstanceId")
  private String instanceId = null;

  @SerializedName("OrderNO")
  private String orderNO = null;

  public ModifyDBInstanceChargeTypeResponse instanceId(String instanceId) {
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

  public ModifyDBInstanceChargeTypeResponse orderNO(String orderNO) {
    this.orderNO = orderNO;
    return this;
  }

   /**
   * Get orderNO
   * @return orderNO
  **/
  @Schema(description = "")
  public String getOrderNO() {
    return orderNO;
  }

  public void setOrderNO(String orderNO) {
    this.orderNO = orderNO;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDBInstanceChargeTypeResponse modifyDBInstanceChargeTypeResponse = (ModifyDBInstanceChargeTypeResponse) o;
    return Objects.equals(this.instanceId, modifyDBInstanceChargeTypeResponse.instanceId) &&
        Objects.equals(this.orderNO, modifyDBInstanceChargeTypeResponse.orderNO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, orderNO);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDBInstanceChargeTypeResponse {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    orderNO: ").append(toIndentedString(orderNO)).append("\n");
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
