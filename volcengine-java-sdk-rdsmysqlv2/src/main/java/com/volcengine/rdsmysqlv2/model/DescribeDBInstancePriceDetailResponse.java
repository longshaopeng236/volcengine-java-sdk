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
import com.volcengine.rdsmysqlv2.model.ChargeItemPriceForDescribeDBInstancePriceDetailOutput;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * DescribeDBInstancePriceDetailResponse
 */


public class DescribeDBInstancePriceDetailResponse extends com.volcengine.model.AbstractResponse {
  @SerializedName("BillingMethod")
  private String billingMethod = null;

  @SerializedName("ChargeItemPrices")
  private List<ChargeItemPriceForDescribeDBInstancePriceDetailOutput> chargeItemPrices = null;

  @SerializedName("CouponAmount")
  private Double couponAmount = null;

  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("DiscountPrice")
  private Double discountPrice = null;

  @SerializedName("OriginalPrice")
  private Double originalPrice = null;

  @SerializedName("PayablePrice")
  private Double payablePrice = null;

  @SerializedName("Quantity")
  private Integer quantity = null;

  @SerializedName("RefundAmount")
  private Double refundAmount = null;

  public DescribeDBInstancePriceDetailResponse billingMethod(String billingMethod) {
    this.billingMethod = billingMethod;
    return this;
  }

   /**
   * Get billingMethod
   * @return billingMethod
  **/
  @Schema(description = "")
  public String getBillingMethod() {
    return billingMethod;
  }

  public void setBillingMethod(String billingMethod) {
    this.billingMethod = billingMethod;
  }

  public DescribeDBInstancePriceDetailResponse chargeItemPrices(List<ChargeItemPriceForDescribeDBInstancePriceDetailOutput> chargeItemPrices) {
    this.chargeItemPrices = chargeItemPrices;
    return this;
  }

  public DescribeDBInstancePriceDetailResponse addChargeItemPricesItem(ChargeItemPriceForDescribeDBInstancePriceDetailOutput chargeItemPricesItem) {
    if (this.chargeItemPrices == null) {
      this.chargeItemPrices = new ArrayList<ChargeItemPriceForDescribeDBInstancePriceDetailOutput>();
    }
    this.chargeItemPrices.add(chargeItemPricesItem);
    return this;
  }

   /**
   * Get chargeItemPrices
   * @return chargeItemPrices
  **/
  @Valid
  @Schema(description = "")
  public List<ChargeItemPriceForDescribeDBInstancePriceDetailOutput> getChargeItemPrices() {
    return chargeItemPrices;
  }

  public void setChargeItemPrices(List<ChargeItemPriceForDescribeDBInstancePriceDetailOutput> chargeItemPrices) {
    this.chargeItemPrices = chargeItemPrices;
  }

  public DescribeDBInstancePriceDetailResponse couponAmount(Double couponAmount) {
    this.couponAmount = couponAmount;
    return this;
  }

   /**
   * Get couponAmount
   * @return couponAmount
  **/
  @Schema(description = "")
  public Double getCouponAmount() {
    return couponAmount;
  }

  public void setCouponAmount(Double couponAmount) {
    this.couponAmount = couponAmount;
  }

  public DescribeDBInstancePriceDetailResponse currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(description = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public DescribeDBInstancePriceDetailResponse discountPrice(Double discountPrice) {
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

  public DescribeDBInstancePriceDetailResponse originalPrice(Double originalPrice) {
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

  public DescribeDBInstancePriceDetailResponse payablePrice(Double payablePrice) {
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

  public DescribeDBInstancePriceDetailResponse quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @Schema(description = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public DescribeDBInstancePriceDetailResponse refundAmount(Double refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * Get refundAmount
   * @return refundAmount
  **/
  @Schema(description = "")
  public Double getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(Double refundAmount) {
    this.refundAmount = refundAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeDBInstancePriceDetailResponse describeDBInstancePriceDetailResponse = (DescribeDBInstancePriceDetailResponse) o;
    return Objects.equals(this.billingMethod, describeDBInstancePriceDetailResponse.billingMethod) &&
        Objects.equals(this.chargeItemPrices, describeDBInstancePriceDetailResponse.chargeItemPrices) &&
        Objects.equals(this.couponAmount, describeDBInstancePriceDetailResponse.couponAmount) &&
        Objects.equals(this.currency, describeDBInstancePriceDetailResponse.currency) &&
        Objects.equals(this.discountPrice, describeDBInstancePriceDetailResponse.discountPrice) &&
        Objects.equals(this.originalPrice, describeDBInstancePriceDetailResponse.originalPrice) &&
        Objects.equals(this.payablePrice, describeDBInstancePriceDetailResponse.payablePrice) &&
        Objects.equals(this.quantity, describeDBInstancePriceDetailResponse.quantity) &&
        Objects.equals(this.refundAmount, describeDBInstancePriceDetailResponse.refundAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingMethod, chargeItemPrices, couponAmount, currency, discountPrice, originalPrice, payablePrice, quantity, refundAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeDBInstancePriceDetailResponse {\n");
    
    sb.append("    billingMethod: ").append(toIndentedString(billingMethod)).append("\n");
    sb.append("    chargeItemPrices: ").append(toIndentedString(chargeItemPrices)).append("\n");
    sb.append("    couponAmount: ").append(toIndentedString(couponAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    discountPrice: ").append(toIndentedString(discountPrice)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    payablePrice: ").append(toIndentedString(payablePrice)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
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