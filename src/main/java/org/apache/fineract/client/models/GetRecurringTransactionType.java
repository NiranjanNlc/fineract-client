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
 * GetRecurringTransactionType
 */

public class GetRecurringTransactionType {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DEPOSIT = "deposit";
  @SerializedName(SERIALIZED_NAME_DEPOSIT)
  private Boolean deposit;

  public static final String SERIALIZED_NAME_WITHDRAWAL = "withdrawal";
  @SerializedName(SERIALIZED_NAME_WITHDRAWAL)
  private Boolean withdrawal;

  public static final String SERIALIZED_NAME_INTEREST_POSTING = "interestPosting";
  @SerializedName(SERIALIZED_NAME_INTEREST_POSTING)
  private Boolean interestPosting;

  public static final String SERIALIZED_NAME_FEE_DEDUCTION = "feeDeduction";
  @SerializedName(SERIALIZED_NAME_FEE_DEDUCTION)
  private Boolean feeDeduction;

  public static final String SERIALIZED_NAME_INITIATE_TRANSFER = "initiateTransfer";
  @SerializedName(SERIALIZED_NAME_INITIATE_TRANSFER)
  private Boolean initiateTransfer;

  public static final String SERIALIZED_NAME_APPROVE_TRANSFER = "approveTransfer";
  @SerializedName(SERIALIZED_NAME_APPROVE_TRANSFER)
  private Boolean approveTransfer;

  public static final String SERIALIZED_NAME_WITHDRAW_TRANSFER = "withdrawTransfer";
  @SerializedName(SERIALIZED_NAME_WITHDRAW_TRANSFER)
  private Boolean withdrawTransfer;

  public static final String SERIALIZED_NAME_REJECT_TRANSFER = "rejectTransfer";
  @SerializedName(SERIALIZED_NAME_REJECT_TRANSFER)
  private Boolean rejectTransfer;

  public static final String SERIALIZED_NAME_OVERDRAFT_INTEREST = "overdraftInterest";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT_INTEREST)
  private Boolean overdraftInterest;

  public static final String SERIALIZED_NAME_WRITTENOFF = "writtenoff";
  @SerializedName(SERIALIZED_NAME_WRITTENOFF)
  private Boolean writtenoff;

  public static final String SERIALIZED_NAME_OVERDRAFT_FEE = "overdraftFee";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT_FEE)
  private Boolean overdraftFee;


  public GetRecurringTransactionType id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetRecurringTransactionType code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "savingsAccountTransactionType.deposit", value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public GetRecurringTransactionType description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Deposit", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetRecurringTransactionType deposit(Boolean deposit) {
    
    this.deposit = deposit;
    return this;
  }

   /**
   * Get deposit
   * @return deposit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getDeposit() {
    return deposit;
  }


  public void setDeposit(Boolean deposit) {
    this.deposit = deposit;
  }


  public GetRecurringTransactionType withdrawal(Boolean withdrawal) {
    
    this.withdrawal = withdrawal;
    return this;
  }

   /**
   * Get withdrawal
   * @return withdrawal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getWithdrawal() {
    return withdrawal;
  }


  public void setWithdrawal(Boolean withdrawal) {
    this.withdrawal = withdrawal;
  }


  public GetRecurringTransactionType interestPosting(Boolean interestPosting) {
    
    this.interestPosting = interestPosting;
    return this;
  }

   /**
   * Get interestPosting
   * @return interestPosting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getInterestPosting() {
    return interestPosting;
  }


  public void setInterestPosting(Boolean interestPosting) {
    this.interestPosting = interestPosting;
  }


  public GetRecurringTransactionType feeDeduction(Boolean feeDeduction) {
    
    this.feeDeduction = feeDeduction;
    return this;
  }

   /**
   * Get feeDeduction
   * @return feeDeduction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getFeeDeduction() {
    return feeDeduction;
  }


  public void setFeeDeduction(Boolean feeDeduction) {
    this.feeDeduction = feeDeduction;
  }


  public GetRecurringTransactionType initiateTransfer(Boolean initiateTransfer) {
    
    this.initiateTransfer = initiateTransfer;
    return this;
  }

   /**
   * Get initiateTransfer
   * @return initiateTransfer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getInitiateTransfer() {
    return initiateTransfer;
  }


  public void setInitiateTransfer(Boolean initiateTransfer) {
    this.initiateTransfer = initiateTransfer;
  }


  public GetRecurringTransactionType approveTransfer(Boolean approveTransfer) {
    
    this.approveTransfer = approveTransfer;
    return this;
  }

   /**
   * Get approveTransfer
   * @return approveTransfer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getApproveTransfer() {
    return approveTransfer;
  }


  public void setApproveTransfer(Boolean approveTransfer) {
    this.approveTransfer = approveTransfer;
  }


  public GetRecurringTransactionType withdrawTransfer(Boolean withdrawTransfer) {
    
    this.withdrawTransfer = withdrawTransfer;
    return this;
  }

   /**
   * Get withdrawTransfer
   * @return withdrawTransfer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getWithdrawTransfer() {
    return withdrawTransfer;
  }


  public void setWithdrawTransfer(Boolean withdrawTransfer) {
    this.withdrawTransfer = withdrawTransfer;
  }


  public GetRecurringTransactionType rejectTransfer(Boolean rejectTransfer) {
    
    this.rejectTransfer = rejectTransfer;
    return this;
  }

   /**
   * Get rejectTransfer
   * @return rejectTransfer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getRejectTransfer() {
    return rejectTransfer;
  }


  public void setRejectTransfer(Boolean rejectTransfer) {
    this.rejectTransfer = rejectTransfer;
  }


  public GetRecurringTransactionType overdraftInterest(Boolean overdraftInterest) {
    
    this.overdraftInterest = overdraftInterest;
    return this;
  }

   /**
   * Get overdraftInterest
   * @return overdraftInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getOverdraftInterest() {
    return overdraftInterest;
  }


  public void setOverdraftInterest(Boolean overdraftInterest) {
    this.overdraftInterest = overdraftInterest;
  }


  public GetRecurringTransactionType writtenoff(Boolean writtenoff) {
    
    this.writtenoff = writtenoff;
    return this;
  }

   /**
   * Get writtenoff
   * @return writtenoff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getWrittenoff() {
    return writtenoff;
  }


  public void setWrittenoff(Boolean writtenoff) {
    this.writtenoff = writtenoff;
  }


  public GetRecurringTransactionType overdraftFee(Boolean overdraftFee) {
    
    this.overdraftFee = overdraftFee;
    return this;
  }

   /**
   * Get overdraftFee
   * @return overdraftFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getOverdraftFee() {
    return overdraftFee;
  }


  public void setOverdraftFee(Boolean overdraftFee) {
    this.overdraftFee = overdraftFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringTransactionType getRecurringTransactionType = (GetRecurringTransactionType) o;
    return Objects.equals(this.id, getRecurringTransactionType.id) &&
        Objects.equals(this.code, getRecurringTransactionType.code) &&
        Objects.equals(this.description, getRecurringTransactionType.description) &&
        Objects.equals(this.deposit, getRecurringTransactionType.deposit) &&
        Objects.equals(this.withdrawal, getRecurringTransactionType.withdrawal) &&
        Objects.equals(this.interestPosting, getRecurringTransactionType.interestPosting) &&
        Objects.equals(this.feeDeduction, getRecurringTransactionType.feeDeduction) &&
        Objects.equals(this.initiateTransfer, getRecurringTransactionType.initiateTransfer) &&
        Objects.equals(this.approveTransfer, getRecurringTransactionType.approveTransfer) &&
        Objects.equals(this.withdrawTransfer, getRecurringTransactionType.withdrawTransfer) &&
        Objects.equals(this.rejectTransfer, getRecurringTransactionType.rejectTransfer) &&
        Objects.equals(this.overdraftInterest, getRecurringTransactionType.overdraftInterest) &&
        Objects.equals(this.writtenoff, getRecurringTransactionType.writtenoff) &&
        Objects.equals(this.overdraftFee, getRecurringTransactionType.overdraftFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, description, deposit, withdrawal, interestPosting, feeDeduction, initiateTransfer, approveTransfer, withdrawTransfer, rejectTransfer, overdraftInterest, writtenoff, overdraftFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringTransactionType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    withdrawal: ").append(toIndentedString(withdrawal)).append("\n");
    sb.append("    interestPosting: ").append(toIndentedString(interestPosting)).append("\n");
    sb.append("    feeDeduction: ").append(toIndentedString(feeDeduction)).append("\n");
    sb.append("    initiateTransfer: ").append(toIndentedString(initiateTransfer)).append("\n");
    sb.append("    approveTransfer: ").append(toIndentedString(approveTransfer)).append("\n");
    sb.append("    withdrawTransfer: ").append(toIndentedString(withdrawTransfer)).append("\n");
    sb.append("    rejectTransfer: ").append(toIndentedString(rejectTransfer)).append("\n");
    sb.append("    overdraftInterest: ").append(toIndentedString(overdraftInterest)).append("\n");
    sb.append("    writtenoff: ").append(toIndentedString(writtenoff)).append("\n");
    sb.append("    overdraftFee: ").append(toIndentedString(overdraftFee)).append("\n");
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

