/*
 * natgateway
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: common-version
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.volcengine.natgateway.model;

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
 * DescribeSnatEntryAttributesRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-06-30T20:18:10.205069+08:00[Asia/Shanghai]")
public class DescribeSnatEntryAttributesRequest {
  @SerializedName("SnatEntryId")
  private String snatEntryId = null;

  public DescribeSnatEntryAttributesRequest snatEntryId(String snatEntryId) {
    this.snatEntryId = snatEntryId;
    return this;
  }

   /**
   * Get snatEntryId
   * @return snatEntryId
  **/
  @NotNull
  @Schema(required = true, description = "")
  public String getSnatEntryId() {
    return snatEntryId;
  }

  public void setSnatEntryId(String snatEntryId) {
    this.snatEntryId = snatEntryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeSnatEntryAttributesRequest describeSnatEntryAttributesRequest = (DescribeSnatEntryAttributesRequest) o;
    return Objects.equals(this.snatEntryId, describeSnatEntryAttributesRequest.snatEntryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snatEntryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeSnatEntryAttributesRequest {\n");
    
    sb.append("    snatEntryId: ").append(toIndentedString(snatEntryId)).append("\n");
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
