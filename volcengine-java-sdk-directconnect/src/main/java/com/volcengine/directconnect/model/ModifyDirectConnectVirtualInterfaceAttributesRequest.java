/*
 * directconnect
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.directconnect.model;

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
 * ModifyDirectConnectVirtualInterfaceAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T20:18:01.352154+08:00[Asia/Shanghai]")
public class ModifyDirectConnectVirtualInterfaceAttributesRequest {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("VirtualInterfaceId")
  private String virtualInterfaceId = null;

  @SerializedName("VirtualInterfaceName")
  private String virtualInterfaceName = null;

  public ModifyDirectConnectVirtualInterfaceAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
 @Size(min=1,max=255)  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ModifyDirectConnectVirtualInterfaceAttributesRequest virtualInterfaceId(String virtualInterfaceId) {
    this.virtualInterfaceId = virtualInterfaceId;
    return this;
  }

   /**
   * Get virtualInterfaceId
   * @return virtualInterfaceId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getVirtualInterfaceId() {
    return virtualInterfaceId;
  }

  public void setVirtualInterfaceId(String virtualInterfaceId) {
    this.virtualInterfaceId = virtualInterfaceId;
  }

  public ModifyDirectConnectVirtualInterfaceAttributesRequest virtualInterfaceName(String virtualInterfaceName) {
    this.virtualInterfaceName = virtualInterfaceName;
    return this;
  }

   /**
   * Get virtualInterfaceName
   * @return virtualInterfaceName
  **/
 @Size(min=1,max=128)  @Schema(description = "")
  public String getVirtualInterfaceName() {
    return virtualInterfaceName;
  }

  public void setVirtualInterfaceName(String virtualInterfaceName) {
    this.virtualInterfaceName = virtualInterfaceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDirectConnectVirtualInterfaceAttributesRequest modifyDirectConnectVirtualInterfaceAttributesRequest = (ModifyDirectConnectVirtualInterfaceAttributesRequest) o;
    return Objects.equals(this.description, modifyDirectConnectVirtualInterfaceAttributesRequest.description) &&
        Objects.equals(this.virtualInterfaceId, modifyDirectConnectVirtualInterfaceAttributesRequest.virtualInterfaceId) &&
        Objects.equals(this.virtualInterfaceName, modifyDirectConnectVirtualInterfaceAttributesRequest.virtualInterfaceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, virtualInterfaceId, virtualInterfaceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDirectConnectVirtualInterfaceAttributesRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    virtualInterfaceId: ").append(toIndentedString(virtualInterfaceId)).append("\n");
    sb.append("    virtualInterfaceName: ").append(toIndentedString(virtualInterfaceName)).append("\n");
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
