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
import org.apache.fineract.client.models.PostSelfLoansLoanIdStatus;

/**
 * PostSelfLoansLoanIdChanges
 */

public class PostSelfLoansLoanIdChanges {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PostSelfLoansLoanIdStatus status;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;

  public static final String SERIALIZED_NAME_WITHDRAWN_ON_DATE = "withdrawnOnDate";
  @SerializedName(SERIALIZED_NAME_WITHDRAWN_ON_DATE)
  private String withdrawnOnDate;

  public static final String SERIALIZED_NAME_CLOSED_ON_DATE = "closedOnDate";
  @SerializedName(SERIALIZED_NAME_CLOSED_ON_DATE)
  private String closedOnDate;


  public PostSelfLoansLoanIdChanges status(PostSelfLoansLoanIdStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PostSelfLoansLoanIdStatus getStatus() {
    return status;
  }


  public void setStatus(PostSelfLoansLoanIdStatus status) {
    this.status = status;
  }


  public PostSelfLoansLoanIdChanges locale(String locale) {
    
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


  public PostSelfLoansLoanIdChanges dateFormat(String dateFormat) {
    
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


  public PostSelfLoansLoanIdChanges withdrawnOnDate(String withdrawnOnDate) {
    
    this.withdrawnOnDate = withdrawnOnDate;
    return this;
  }

   /**
   * Get withdrawnOnDate
   * @return withdrawnOnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20 September 2011", value = "")

  public String getWithdrawnOnDate() {
    return withdrawnOnDate;
  }


  public void setWithdrawnOnDate(String withdrawnOnDate) {
    this.withdrawnOnDate = withdrawnOnDate;
  }


  public PostSelfLoansLoanIdChanges closedOnDate(String closedOnDate) {
    
    this.closedOnDate = closedOnDate;
    return this;
  }

   /**
   * Get closedOnDate
   * @return closedOnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20 September 2011", value = "")

  public String getClosedOnDate() {
    return closedOnDate;
  }


  public void setClosedOnDate(String closedOnDate) {
    this.closedOnDate = closedOnDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSelfLoansLoanIdChanges postSelfLoansLoanIdChanges = (PostSelfLoansLoanIdChanges) o;
    return Objects.equals(this.status, postSelfLoansLoanIdChanges.status) &&
        Objects.equals(this.locale, postSelfLoansLoanIdChanges.locale) &&
        Objects.equals(this.dateFormat, postSelfLoansLoanIdChanges.dateFormat) &&
        Objects.equals(this.withdrawnOnDate, postSelfLoansLoanIdChanges.withdrawnOnDate) &&
        Objects.equals(this.closedOnDate, postSelfLoansLoanIdChanges.closedOnDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, locale, dateFormat, withdrawnOnDate, closedOnDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSelfLoansLoanIdChanges {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    withdrawnOnDate: ").append(toIndentedString(withdrawnOnDate)).append("\n");
    sb.append("    closedOnDate: ").append(toIndentedString(closedOnDate)).append("\n");
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

