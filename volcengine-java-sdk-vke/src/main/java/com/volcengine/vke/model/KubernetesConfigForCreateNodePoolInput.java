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
import com.volcengine.vke.model.LabelForCreateNodePoolInput;
import com.volcengine.vke.model.TaintForCreateNodePoolInput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * KubernetesConfigForCreateNodePoolInput
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-04T12:08:56.909838+08:00[Asia/Shanghai]")
public class KubernetesConfigForCreateNodePoolInput {
  @SerializedName("Cordon")
  private Boolean cordon = null;

  @SerializedName("Labels")
  private List<LabelForCreateNodePoolInput> labels = null;

  @SerializedName("Taints")
  private List<TaintForCreateNodePoolInput> taints = null;

  public KubernetesConfigForCreateNodePoolInput cordon(Boolean cordon) {
    this.cordon = cordon;
    return this;
  }

   /**
   * Get cordon
   * @return cordon
  **/
  @Schema(description = "")
  public Boolean isCordon() {
    return cordon;
  }

  public void setCordon(Boolean cordon) {
    this.cordon = cordon;
  }

  public KubernetesConfigForCreateNodePoolInput labels(List<LabelForCreateNodePoolInput> labels) {
    this.labels = labels;
    return this;
  }

  public KubernetesConfigForCreateNodePoolInput addLabelsItem(LabelForCreateNodePoolInput labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<LabelForCreateNodePoolInput>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @Valid
  @Schema(description = "")
  public List<LabelForCreateNodePoolInput> getLabels() {
    return labels;
  }

  public void setLabels(List<LabelForCreateNodePoolInput> labels) {
    this.labels = labels;
  }

  public KubernetesConfigForCreateNodePoolInput taints(List<TaintForCreateNodePoolInput> taints) {
    this.taints = taints;
    return this;
  }

  public KubernetesConfigForCreateNodePoolInput addTaintsItem(TaintForCreateNodePoolInput taintsItem) {
    if (this.taints == null) {
      this.taints = new ArrayList<TaintForCreateNodePoolInput>();
    }
    this.taints.add(taintsItem);
    return this;
  }

   /**
   * Get taints
   * @return taints
  **/
  @Valid
  @Schema(description = "")
  public List<TaintForCreateNodePoolInput> getTaints() {
    return taints;
  }

  public void setTaints(List<TaintForCreateNodePoolInput> taints) {
    this.taints = taints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesConfigForCreateNodePoolInput kubernetesConfigForCreateNodePoolInput = (KubernetesConfigForCreateNodePoolInput) o;
    return Objects.equals(this.cordon, kubernetesConfigForCreateNodePoolInput.cordon) &&
        Objects.equals(this.labels, kubernetesConfigForCreateNodePoolInput.labels) &&
        Objects.equals(this.taints, kubernetesConfigForCreateNodePoolInput.taints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cordon, labels, taints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesConfigForCreateNodePoolInput {\n");
    
    sb.append("    cordon: ").append(toIndentedString(cordon)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
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
