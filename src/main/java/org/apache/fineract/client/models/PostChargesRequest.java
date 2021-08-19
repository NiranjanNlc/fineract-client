/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 * Apache Fineract
 * Apache Fineract is a secure, multi-tenanted microfinance platform  The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform<br>The [reference app](https://cui.fineract.dev) (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation  - The API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) - Find out more about Apache Fineract [here](/fineract-provider/api-docs/apiLive.htm#top) - You can [Try The API From Your Browser](/fineract-provider/api-docs/apiLive.htm#interact) - The Generic Options are available [here](/fineract-provider/api-docs/apiLive.htm#genopts) - Find out more about [Updating Dates and Numbers](/fineract-provider/api-docs/apiLive.htm#dates_and_numbers) - For the Authentication and the Basic of HTTP and HTTPS refer [here](/fineract-provider/api-docs/apiLive.htm#authentication_overview) - Check about ERROR codes [here](/fineract-provider/api-docs/apiLive.htm#errors)  Please refer to the [old documentation](/fineract-provider/api-docs/apiLive.htm) for any documentation queries
 *
 * The version of the OpenAPI document: 1.5.0-39-gc7b9611-dirty
 * Contact: dev@fineract.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.apache.fineract.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PostChargesRequest
 */
@ApiModel(description = "PostChargesRequest")

public class PostChargesRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CHARGE_APPLIES_TO = "chargeAppliesTo";
  @SerializedName(SERIALIZED_NAME_CHARGE_APPLIES_TO)
  private Integer chargeAppliesTo;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_CHARGE_TIME_TYPE = "chargeTimeType";
  @SerializedName(SERIALIZED_NAME_CHARGE_TIME_TYPE)
  private Integer chargeTimeType;

  public static final String SERIALIZED_NAME_CHARGE_CALCULATION_TYPE = "chargeCalculationType";
  @SerializedName(SERIALIZED_NAME_CHARGE_CALCULATION_TYPE)
  private Integer chargeCalculationType;

  public static final String SERIALIZED_NAME_CHARGE_PAYMENT_MODE = "chargePaymentMode";
  @SerializedName(SERIALIZED_NAME_CHARGE_PAYMENT_MODE)
  private Integer chargePaymentMode;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private String active;


  public PostChargesRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Loan Service fee", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PostChargesRequest chargeAppliesTo(Integer chargeAppliesTo) {
    
    this.chargeAppliesTo = chargeAppliesTo;
    return this;
  }

   /**
   * Get chargeAppliesTo
   * @return chargeAppliesTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getChargeAppliesTo() {
    return chargeAppliesTo;
  }


  public void setChargeAppliesTo(Integer chargeAppliesTo) {
    this.chargeAppliesTo = chargeAppliesTo;
  }


  public PostChargesRequest currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public PostChargesRequest locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en", value = "")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public PostChargesRequest amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "230.56", value = "")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public PostChargesRequest chargeTimeType(Integer chargeTimeType) {
    
    this.chargeTimeType = chargeTimeType;
    return this;
  }

   /**
   * Get chargeTimeType
   * @return chargeTimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getChargeTimeType() {
    return chargeTimeType;
  }


  public void setChargeTimeType(Integer chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
  }


  public PostChargesRequest chargeCalculationType(Integer chargeCalculationType) {
    
    this.chargeCalculationType = chargeCalculationType;
    return this;
  }

   /**
   * Get chargeCalculationType
   * @return chargeCalculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getChargeCalculationType() {
    return chargeCalculationType;
  }


  public void setChargeCalculationType(Integer chargeCalculationType) {
    this.chargeCalculationType = chargeCalculationType;
  }


  public PostChargesRequest chargePaymentMode(Integer chargePaymentMode) {
    
    this.chargePaymentMode = chargePaymentMode;
    return this;
  }

   /**
   * Get chargePaymentMode
   * @return chargePaymentMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getChargePaymentMode() {
    return chargePaymentMode;
  }


  public void setChargePaymentMode(Integer chargePaymentMode) {
    this.chargePaymentMode = chargePaymentMode;
  }


  public PostChargesRequest active(String active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public String getActive() {
    return active;
  }


  public void setActive(String active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostChargesRequest postChargesRequest = (PostChargesRequest) o;
    return Objects.equals(this.name, postChargesRequest.name) &&
        Objects.equals(this.chargeAppliesTo, postChargesRequest.chargeAppliesTo) &&
        Objects.equals(this.currencyCode, postChargesRequest.currencyCode) &&
        Objects.equals(this.locale, postChargesRequest.locale) &&
        Objects.equals(this.amount, postChargesRequest.amount) &&
        Objects.equals(this.chargeTimeType, postChargesRequest.chargeTimeType) &&
        Objects.equals(this.chargeCalculationType, postChargesRequest.chargeCalculationType) &&
        Objects.equals(this.chargePaymentMode, postChargesRequest.chargePaymentMode) &&
        Objects.equals(this.active, postChargesRequest.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, chargeAppliesTo, currencyCode, locale, amount, chargeTimeType, chargeCalculationType, chargePaymentMode, active);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostChargesRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    chargeAppliesTo: ").append(toIndentedString(chargeAppliesTo)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargeTimeType: ").append(toIndentedString(chargeTimeType)).append("\n");
    sb.append("    chargeCalculationType: ").append(toIndentedString(chargeCalculationType)).append("\n");
    sb.append("    chargePaymentMode: ").append(toIndentedString(chargePaymentMode)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

