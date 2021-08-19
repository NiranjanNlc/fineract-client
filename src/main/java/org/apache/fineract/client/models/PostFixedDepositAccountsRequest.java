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
 * PostFixedDepositAccountsRequest
 */
@ApiModel(description = "PostFixedDepositAccountsRequest")

public class PostFixedDepositAccountsRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Integer clientId;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;

  public static final String SERIALIZED_NAME_SUBMITTED_ON_DATE = "submittedOnDate";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_ON_DATE)
  private String submittedOnDate;

  public static final String SERIALIZED_NAME_DEPOSIT_AMOUNT = "depositAmount";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_AMOUNT)
  private Float depositAmount;

  public static final String SERIALIZED_NAME_DEPOSIT_PERIOD = "depositPeriod";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_PERIOD)
  private Integer depositPeriod;

  public static final String SERIALIZED_NAME_DEPOSIT_PERIOD_FREQUENCY_ID = "depositPeriodFrequencyId";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_PERIOD_FREQUENCY_ID)
  private Integer depositPeriodFrequencyId;


  public PostFixedDepositAccountsRequest clientId(Integer clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getClientId() {
    return clientId;
  }


  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }


  public PostFixedDepositAccountsRequest productId(Integer productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getProductId() {
    return productId;
  }


  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public PostFixedDepositAccountsRequest locale(String locale) {
    
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


  public PostFixedDepositAccountsRequest dateFormat(String dateFormat) {
    
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dd MMMM yyyy", value = "")

  public String getDateFormat() {
    return dateFormat;
  }


  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }


  public PostFixedDepositAccountsRequest submittedOnDate(String submittedOnDate) {
    
    this.submittedOnDate = submittedOnDate;
    return this;
  }

   /**
   * Get submittedOnDate
   * @return submittedOnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01 March 2014", value = "")

  public String getSubmittedOnDate() {
    return submittedOnDate;
  }


  public void setSubmittedOnDate(String submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
  }


  public PostFixedDepositAccountsRequest depositAmount(Float depositAmount) {
    
    this.depositAmount = depositAmount;
    return this;
  }

   /**
   * Get depositAmount
   * @return depositAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000", value = "")

  public Float getDepositAmount() {
    return depositAmount;
  }


  public void setDepositAmount(Float depositAmount) {
    this.depositAmount = depositAmount;
  }


  public PostFixedDepositAccountsRequest depositPeriod(Integer depositPeriod) {
    
    this.depositPeriod = depositPeriod;
    return this;
  }

   /**
   * Get depositPeriod
   * @return depositPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", value = "")

  public Integer getDepositPeriod() {
    return depositPeriod;
  }


  public void setDepositPeriod(Integer depositPeriod) {
    this.depositPeriod = depositPeriod;
  }


  public PostFixedDepositAccountsRequest depositPeriodFrequencyId(Integer depositPeriodFrequencyId) {
    
    this.depositPeriodFrequencyId = depositPeriodFrequencyId;
    return this;
  }

   /**
   * Get depositPeriodFrequencyId
   * @return depositPeriodFrequencyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getDepositPeriodFrequencyId() {
    return depositPeriodFrequencyId;
  }


  public void setDepositPeriodFrequencyId(Integer depositPeriodFrequencyId) {
    this.depositPeriodFrequencyId = depositPeriodFrequencyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostFixedDepositAccountsRequest postFixedDepositAccountsRequest = (PostFixedDepositAccountsRequest) o;
    return Objects.equals(this.clientId, postFixedDepositAccountsRequest.clientId) &&
        Objects.equals(this.productId, postFixedDepositAccountsRequest.productId) &&
        Objects.equals(this.locale, postFixedDepositAccountsRequest.locale) &&
        Objects.equals(this.dateFormat, postFixedDepositAccountsRequest.dateFormat) &&
        Objects.equals(this.submittedOnDate, postFixedDepositAccountsRequest.submittedOnDate) &&
        Objects.equals(this.depositAmount, postFixedDepositAccountsRequest.depositAmount) &&
        Objects.equals(this.depositPeriod, postFixedDepositAccountsRequest.depositPeriod) &&
        Objects.equals(this.depositPeriodFrequencyId, postFixedDepositAccountsRequest.depositPeriodFrequencyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, productId, locale, dateFormat, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostFixedDepositAccountsRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    submittedOnDate: ").append(toIndentedString(submittedOnDate)).append("\n");
    sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
    sb.append("    depositPeriod: ").append(toIndentedString(depositPeriod)).append("\n");
    sb.append("    depositPeriodFrequencyId: ").append(toIndentedString(depositPeriodFrequencyId)).append("\n");
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

