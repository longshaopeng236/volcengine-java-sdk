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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PublicIpForListClustersOutput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-09-19T12:20:19.967862+08:00[Asia/Shanghai]")
public class PublicIpForListClustersOutput {
  @SerializedName("Ipv4")
  private String ipv4 = null;

  public PublicIpForListClustersOutput ipv4(String ipv4) {
    this.ipv4 = ipv4;
    return this;
  }

   /**
   * Get ipv4
   * @return ipv4
  **/
  @Schema(description = "")
  public String getIpv4() {
    return ipv4;
  }

  public void setIpv4(String ipv4) {
    this.ipv4 = ipv4;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicIpForListClustersOutput publicIpForListClustersOutput = (PublicIpForListClustersOutput) o;
    return Objects.equals(this.ipv4, publicIpForListClustersOutput.ipv4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicIpForListClustersOutput {\n");
    
    sb.append("    ipv4: ").append(toIndentedString(ipv4)).append("\n");
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
