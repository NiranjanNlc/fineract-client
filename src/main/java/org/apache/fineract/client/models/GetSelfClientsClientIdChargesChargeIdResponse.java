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
import java.util.Date;
import org.apache.fineract.client.models.GetSelfClientsChargeCalculationType;
import org.apache.fineract.client.models.GetSelfClientsChargeTimeType;
import org.apache.fineract.client.models.GetSelfClientsSavingsAccountsCurrency;

/**
 * GetSelfClientsClientIdChargesChargeIdResponse
 */
@ApiModel(description = "GetSelfClientsClientIdChargesChargeIdResponse")

public class GetSelfClientsClientIdChargesChargeIdResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Integer clientId;

  public static final String SERIALIZED_NAME_CHARGE_ID = "chargeId";
  @SerializedName(SERIALIZED_NAME_CHARGE_ID)
  private Integer chargeId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CHARGE_TIME_TYPE = "chargeTimeType";
  @SerializedName(SERIALIZED_NAME_CHARGE_TIME_TYPE)
  private GetSelfClientsChargeTimeType chargeTimeType;

  public static final String SERIALIZED_NAME_DUE_DATE = "dueDate";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private Date dueDate;

  public static final String SERIALIZED_NAME_CHARGE_CALCULATION_TYPE = "chargeCalculationType";
  @SerializedName(SERIALIZED_NAME_CHARGE_CALCULATION_TYPE)
  private GetSelfClientsChargeCalculationType chargeCalculationType;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetSelfClientsSavingsAccountsCurrency currency;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_AMOUNT_PAID = "amountPaid";
  @SerializedName(SERIALIZED_NAME_AMOUNT_PAID)
  private Float amountPaid;

  public static final String SERIALIZED_NAME_AMOUNT_WAIVED = "amountWaived";
  @SerializedName(SERIALIZED_NAME_AMOUNT_WAIVED)
  private Float amountWaived;

  public static final String SERIALIZED_NAME_AMOUNT_WRITTEN_OFF = "amountWrittenOff";
  @SerializedName(SERIALIZED_NAME_AMOUNT_WRITTEN_OFF)
  private Float amountWrittenOff;

  public static final String SERIALIZED_NAME_AMOUNT_OUTSTANDING = "amountOutstanding";
  @SerializedName(SERIALIZED_NAME_AMOUNT_OUTSTANDING)
  private Float amountOutstanding;

  public static final String SERIALIZED_NAME_PENALTY = "penalty";
  @SerializedName(SERIALIZED_NAME_PENALTY)
  private Boolean penalty;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_IS_PAID = "isPaid";
  @SerializedName(SERIALIZED_NAME_IS_PAID)
  private Boolean isPaid;

  public static final String SERIALIZED_NAME_IS_WAIVED = "isWaived";
  @SerializedName(SERIALIZED_NAME_IS_WAIVED)
  private Boolean isWaived;


  public GetSelfClientsClientIdChargesChargeIdResponse id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetSelfClientsClientIdChargesChargeIdResponse clientId(Integer clientId) {
    
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


  public GetSelfClientsClientIdChargesChargeIdResponse chargeId(Integer chargeId) {
    
    this.chargeId = chargeId;
    return this;
  }

   /**
   * Get chargeId
   * @return chargeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getChargeId() {
    return chargeId;
  }


  public void setChargeId(Integer chargeId) {
    this.chargeId = chargeId;
  }


  public GetSelfClientsClientIdChargesChargeIdResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Client Fee 1", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetSelfClientsClientIdChargesChargeIdResponse chargeTimeType(GetSelfClientsChargeTimeType chargeTimeType) {
    
    this.chargeTimeType = chargeTimeType;
    return this;
  }

   /**
   * Get chargeTimeType
   * @return chargeTimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSelfClientsChargeTimeType getChargeTimeType() {
    return chargeTimeType;
  }


  public void setChargeTimeType(GetSelfClientsChargeTimeType chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
  }


  public GetSelfClientsClientIdChargesChargeIdResponse dueDate(Date dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getDueDate() {
    return dueDate;
  }


  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }


  public GetSelfClientsClientIdChargesChargeIdResponse chargeCalculationType(GetSelfClientsChargeCalculationType chargeCalculationType) {
    
    this.chargeCalculationType = chargeCalculationType;
    return this;
  }

   /**
   * Get chargeCalculationType
   * @return chargeCalculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSelfClientsChargeCalculationType getChargeCalculationType() {
    return chargeCalculationType;
  }


  public void setChargeCalculationType(GetSelfClientsChargeCalculationType chargeCalculationType) {
    this.chargeCalculationType = chargeCalculationType;
  }


  public GetSelfClientsClientIdChargesChargeIdResponse currency(GetSelfClientsSavingsAccountsCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetSelfClientsSavingsAccountsCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetSelfClientsSavingsAccountsCurrency currency) {
    this.currency = currency;
  }


  public GetSelfClientsClientIdChargesChargeIdResponse amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public GetSelfClientsClientIdChargesChargeIdResponse amountPaid(Float amountPaid) {
    
    this.amountPaid = amountPaid;
    return this;
  }

   /**
   * Get amountPaid
   * @return amountPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Float getAmountPaid() {
    return amountPaid;
  }


  public void setAmountPaid(Float amountPaid) {
    this.amountPaid = amountPaid;
  }


  public GetSelfClientsClientIdChargesChargeIdResponse amountWaived(Float amountWaived) {
    
    this.amountWaived = amountWaived;
    return this;
  }

   /**
   * Get amountWaived
   * @return amountWaived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public Float getAmountWaived() {
    return amountWaived;
  }


  public void setAmountWaived(Float amountWaived) {
    this.amountWaived = amountWaived;
  }


  public GetSelfClientsClientIdChargesChargeIdResponse amountWrittenOff(Float amountWrittenOff) {
    
    this.amountWrittenOff = amountWrittenOff;
    return this;
  }

   /**
   * Get amountWrittenOff
   * @return amountWrittenOff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Float getAmountWrittenOff() {
    return amountWrittenOff;
  }


  public void setAmountWrittenOff(Float amountWrittenOff) {
    this.amountWrittenOff = amountWrittenOff;
  }


  public GetSelfClientsClientIdChargesChargeIdResponse amountOutstanding(Float amountOutstanding) {
    
    this.amountOutstanding = amountOutstanding;
    return this;
  }

   /**
   * Get amountOutstanding
   * @return amountOutstanding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Float getAmountOutstanding() {
    return amountOutstanding;
  }


  public void setAmountOutstanding(Float amountOutstanding) {
    this.amountOutstanding = amountOutstanding;
  }


  public GetSelfClientsClientIdChargesChargeIdResponse penalty(Boolean penalty) {
    
    this.penalty = penalty;
    return this;
  }

   /**
   * Get penalty
   * @return penalty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getPenalty() {
    return penalty;
  }


  public void setPenalty(Boolean penalty) {
    this.penalty = penalty;
  }


  public GetSelfClientsClientIdChargesChargeIdResponse isActive(Boolean isActive) {
    
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


  public GetSelfClientsClientIdChargesChargeIdResponse isPaid(Boolean isPaid) {
    
    this.isPaid = isPaid;
    return this;
  }

   /**
   * Get isPaid
   * @return isPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsPaid() {
    return isPaid;
  }


  public void setIsPaid(Boolean isPaid) {
    this.isPaid = isPaid;
  }


  public GetSelfClientsClientIdChargesChargeIdResponse isWaived(Boolean isWaived) {
    
    this.isWaived = isWaived;
    return this;
  }

   /**
   * Get isWaived
   * @return isWaived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsWaived() {
    return isWaived;
  }


  public void setIsWaived(Boolean isWaived) {
    this.isWaived = isWaived;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSelfClientsClientIdChargesChargeIdResponse getSelfClientsClientIdChargesChargeIdResponse = (GetSelfClientsClientIdChargesChargeIdResponse) o;
    return Objects.equals(this.id, getSelfClientsClientIdChargesChargeIdResponse.id) &&
        Objects.equals(this.clientId, getSelfClientsClientIdChargesChargeIdResponse.clientId) &&
        Objects.equals(this.chargeId, getSelfClientsClientIdChargesChargeIdResponse.chargeId) &&
        Objects.equals(this.name, getSelfClientsClientIdChargesChargeIdResponse.name) &&
        Objects.equals(this.chargeTimeType, getSelfClientsClientIdChargesChargeIdResponse.chargeTimeType) &&
        Objects.equals(this.dueDate, getSelfClientsClientIdChargesChargeIdResponse.dueDate) &&
        Objects.equals(this.chargeCalculationType, getSelfClientsClientIdChargesChargeIdResponse.chargeCalculationType) &&
        Objects.equals(this.currency, getSelfClientsClientIdChargesChargeIdResponse.currency) &&
        Objects.equals(this.amount, getSelfClientsClientIdChargesChargeIdResponse.amount) &&
        Objects.equals(this.amountPaid, getSelfClientsClientIdChargesChargeIdResponse.amountPaid) &&
        Objects.equals(this.amountWaived, getSelfClientsClientIdChargesChargeIdResponse.amountWaived) &&
        Objects.equals(this.amountWrittenOff, getSelfClientsClientIdChargesChargeIdResponse.amountWrittenOff) &&
        Objects.equals(this.amountOutstanding, getSelfClientsClientIdChargesChargeIdResponse.amountOutstanding) &&
        Objects.equals(this.penalty, getSelfClientsClientIdChargesChargeIdResponse.penalty) &&
        Objects.equals(this.isActive, getSelfClientsClientIdChargesChargeIdResponse.isActive) &&
        Objects.equals(this.isPaid, getSelfClientsClientIdChargesChargeIdResponse.isPaid) &&
        Objects.equals(this.isWaived, getSelfClientsClientIdChargesChargeIdResponse.isWaived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, chargeId, name, chargeTimeType, dueDate, chargeCalculationType, currency, amount, amountPaid, amountWaived, amountWrittenOff, amountOutstanding, penalty, isActive, isPaid, isWaived);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSelfClientsClientIdChargesChargeIdResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    chargeId: ").append(toIndentedString(chargeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    chargeTimeType: ").append(toIndentedString(chargeTimeType)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    chargeCalculationType: ").append(toIndentedString(chargeCalculationType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    amountWaived: ").append(toIndentedString(amountWaived)).append("\n");
    sb.append("    amountWrittenOff: ").append(toIndentedString(amountWrittenOff)).append("\n");
    sb.append("    amountOutstanding: ").append(toIndentedString(amountOutstanding)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isPaid: ").append(toIndentedString(isPaid)).append("\n");
    sb.append("    isWaived: ").append(toIndentedString(isWaived)).append("\n");
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

