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
 * ChargeItemPriceForDescribeDBInstancePriceDifferenceOutput
 */


public class ChargeItemPriceForDescribeDBInstancePriceDifferenceOutput {
  @SerializedName("ChargeItemKey")
  private String chargeItemKey = null;

  @SerializedName("ChargeItemType")
  private String chargeItemType = null;

  @SerializedName("ChargeItemValue")
  private Long chargeItemValue = null;

  @SerializedName("DiscountPrice")
  private Double discountPrice = null;

  @SerializedName("OriginalPrice")
  private Double originalPrice = null;

  @SerializedName("PayablePrice")
  private Double payablePrice = null;

  @SerializedName("UnitPrice")
  private Double unitPrice = null;

  public ChargeItemPriceForDescribeDBInstancePriceDifferenceOutput chargeItemKey(String chargeItemKey) {
    this.chargeItemKey = chargeItemKey;
    return this;
  }

   /**
   * Get chargeItemKey
   * @return chargeItemKey
  **/
  @Schema(description = "")
  public String getChargeItemKey() {
    return chargeItemKey;
  }

  public void setChargeItemKey(String chargeItemKey) {
    this.chargeItemKey = chargeItemKey;
  }

  public ChargeItemPriceForDescribeDBInstancePriceDifferenceOutput chargeItemType(String chargeItemType) {
    this.chargeItemType = chargeItemType;
    return this;
  }

   /**
   * Get chargeItemType
   * @return chargeItemType
  **/
  @Schema(description = "")
  public String getChargeItemType() {
    return chargeItemType;
  }

  public void setChargeItemType(String chargeItemType) {
    this.chargeItemType = chargeItemType;
  }

  public ChargeItemPriceForDescribeDBInstancePriceDifferenceOutput chargeItemValue(Long chargeItemValue) {
    this.chargeItemValue = chargeItemValue;
    return this;
  }

   /**
   * Get chargeItemValue
   * @return chargeItemValue
  **/
  @Schema(description = "")
  public Long getChargeItemValue() {
    return chargeItemValue;
  }

  public void setChargeItemValue(Long chargeItemValue) {
    this.chargeItemValue = chargeItemValue;
  }

  public ChargeItemPriceForDescribeDBInstancePriceDifferenceOutput discountPrice(Double discountPrice) {
    this.discountPrice = discountPrice;
    return this;
  }

   /**
   * Get discountPrice
   * @return discountPrice
  **/
  @Schema(description = "")
  public Double getDiscountPrice() {
    return discountPrice;
  }

  public void setDiscountPrice(Double discountPrice) {
    this.discountPrice = discountPrice;
  }

  public ChargeItemPriceForDescribeDBInstancePriceDifferenceOutput originalPrice(Double originalPrice) {
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * Get originalPrice
   * @return originalPrice
  **/
  @Schema(description = "")
  public Double getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(Double originalPrice) {
    this.originalPrice = originalPrice;
  }

  public ChargeItemPriceForDescribeDBInstancePriceDifferenceOutput payablePrice(Double payablePrice) {
    this.payablePrice = payablePrice;
    return this;
  }

   /**
   * Get payablePrice
   * @return payablePrice
  **/
  @Schema(description = "")
  public Double getPayablePrice() {
    return payablePrice;
  }

  public void setPayablePrice(Double payablePrice) {
    this.payablePrice = payablePrice;
  }

  public ChargeItemPriceForDescribeDBInstancePriceDifferenceOutput unitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @Schema(description = "")
  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeItemPriceForDescribeDBInstancePriceDifferenceOutput chargeItemPriceForDescribeDBInstancePriceDifferenceOutput = (ChargeItemPriceForDescribeDBInstancePriceDifferenceOutput) o;
    return Objects.equals(this.chargeItemKey, chargeItemPriceForDescribeDBInstancePriceDifferenceOutput.chargeItemKey) &&
        Objects.equals(this.chargeItemType, chargeItemPriceForDescribeDBInstancePriceDifferenceOutput.chargeItemType) &&
        Objects.equals(this.chargeItemValue, chargeItemPriceForDescribeDBInstancePriceDifferenceOutput.chargeItemValue) &&
        Objects.equals(this.discountPrice, chargeItemPriceForDescribeDBInstancePriceDifferenceOutput.discountPrice) &&
        Objects.equals(this.originalPrice, chargeItemPriceForDescribeDBInstancePriceDifferenceOutput.originalPrice) &&
        Objects.equals(this.payablePrice, chargeItemPriceForDescribeDBInstancePriceDifferenceOutput.payablePrice) &&
        Objects.equals(this.unitPrice, chargeItemPriceForDescribeDBInstancePriceDifferenceOutput.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeItemKey, chargeItemType, chargeItemValue, discountPrice, originalPrice, payablePrice, unitPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeItemPriceForDescribeDBInstancePriceDifferenceOutput {\n");
    
    sb.append("    chargeItemKey: ").append(toIndentedString(chargeItemKey)).append("\n");
    sb.append("    chargeItemType: ").append(toIndentedString(chargeItemType)).append("\n");
    sb.append("    chargeItemValue: ").append(toIndentedString(chargeItemValue)).append("\n");
    sb.append("    discountPrice: ").append(toIndentedString(discountPrice)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    payablePrice: ").append(toIndentedString(payablePrice)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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