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
 * The version of the OpenAPI document: 1.5.0-11-gd287218-dirty
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
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.PostFloatingRatesRatePeriods;

/**
 * PutFloatingRatesFloatingRateIdRequest
 */
@ApiModel(description = "PutFloatingRatesFloatingRateIdRequest")

public class PutFloatingRatesFloatingRateIdRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_BASE_LENDING_RATE = "isBaseLendingRate";
  @SerializedName(SERIALIZED_NAME_IS_BASE_LENDING_RATE)
  private Boolean isBaseLendingRate;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_RATE_PERIODS = "ratePeriods";
  @SerializedName(SERIALIZED_NAME_RATE_PERIODS)
  private List<PostFloatingRatesRatePeriods> ratePeriods = null;


  public PutFloatingRatesFloatingRateIdRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Floating Rate 1", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PutFloatingRatesFloatingRateIdRequest isBaseLendingRate(Boolean isBaseLendingRate) {
    
    this.isBaseLendingRate = isBaseLendingRate;
    return this;
  }

   /**
   * Get isBaseLendingRate
   * @return isBaseLendingRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsBaseLendingRate() {
    return isBaseLendingRate;
  }


  public void setIsBaseLendingRate(Boolean isBaseLendingRate) {
    this.isBaseLendingRate = isBaseLendingRate;
  }


  public PutFloatingRatesFloatingRateIdRequest isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public PutFloatingRatesFloatingRateIdRequest ratePeriods(List<PostFloatingRatesRatePeriods> ratePeriods) {
    
    this.ratePeriods = ratePeriods;
    return this;
  }

  public PutFloatingRatesFloatingRateIdRequest addRatePeriodsItem(PostFloatingRatesRatePeriods ratePeriodsItem) {
    if (this.ratePeriods == null) {
      this.ratePeriods = new ArrayList<PostFloatingRatesRatePeriods>();
    }
    this.ratePeriods.add(ratePeriodsItem);
    return this;
  }

   /**
   * Get ratePeriods
   * @return ratePeriods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PostFloatingRatesRatePeriods> getRatePeriods() {
    return ratePeriods;
  }


  public void setRatePeriods(List<PostFloatingRatesRatePeriods> ratePeriods) {
    this.ratePeriods = ratePeriods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutFloatingRatesFloatingRateIdRequest putFloatingRatesFloatingRateIdRequest = (PutFloatingRatesFloatingRateIdRequest) o;
    return Objects.equals(this.name, putFloatingRatesFloatingRateIdRequest.name) &&
        Objects.equals(this.isBaseLendingRate, putFloatingRatesFloatingRateIdRequest.isBaseLendingRate) &&
        Objects.equals(this.isActive, putFloatingRatesFloatingRateIdRequest.isActive) &&
        Objects.equals(this.ratePeriods, putFloatingRatesFloatingRateIdRequest.ratePeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isBaseLendingRate, isActive, ratePeriods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutFloatingRatesFloatingRateIdRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isBaseLendingRate: ").append(toIndentedString(isBaseLendingRate)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    ratePeriods: ").append(toIndentedString(ratePeriods)).append("\n");
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

