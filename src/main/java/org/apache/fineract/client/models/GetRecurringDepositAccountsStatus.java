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

/**
 * GetRecurringDepositAccountsStatus
 */

public class GetRecurringDepositAccountsStatus {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SUBMITTED_AND_PENDING_APPROVAL = "submittedAndPendingApproval";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_AND_PENDING_APPROVAL)
  private Boolean submittedAndPendingApproval;

  public static final String SERIALIZED_NAME_APPROVED = "approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  private Boolean approved;

  public static final String SERIALIZED_NAME_REJECTED = "rejected";
  @SerializedName(SERIALIZED_NAME_REJECTED)
  private Boolean rejected;

  public static final String SERIALIZED_NAME_WITHDRAWN_BY_APPLICANT = "withdrawnByApplicant";
  @SerializedName(SERIALIZED_NAME_WITHDRAWN_BY_APPLICANT)
  private Boolean withdrawnByApplicant;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_CLOSED = "closed";
  @SerializedName(SERIALIZED_NAME_CLOSED)
  private Boolean closed;

  public static final String SERIALIZED_NAME_PREMATURE_CLOSED = "prematureClosed";
  @SerializedName(SERIALIZED_NAME_PREMATURE_CLOSED)
  private Boolean prematureClosed;

  public static final String SERIALIZED_NAME_TRANSFER_IN_PROGRESS = "transferInProgress";
  @SerializedName(SERIALIZED_NAME_TRANSFER_IN_PROGRESS)
  private Boolean transferInProgress;

  public static final String SERIALIZED_NAME_TRANSFER_ON_HOLD = "transferOnHold";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ON_HOLD)
  private Boolean transferOnHold;


  public GetRecurringDepositAccountsStatus id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetRecurringDepositAccountsStatus code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "savingsAccountStatusType.submitted.and.pending.approval", value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public GetRecurringDepositAccountsStatus description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Submitted and pending approval", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetRecurringDepositAccountsStatus submittedAndPendingApproval(Boolean submittedAndPendingApproval) {
    
    this.submittedAndPendingApproval = submittedAndPendingApproval;
    return this;
  }

   /**
   * Get submittedAndPendingApproval
   * @return submittedAndPendingApproval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getSubmittedAndPendingApproval() {
    return submittedAndPendingApproval;
  }


  public void setSubmittedAndPendingApproval(Boolean submittedAndPendingApproval) {
    this.submittedAndPendingApproval = submittedAndPendingApproval;
  }


  public GetRecurringDepositAccountsStatus approved(Boolean approved) {
    
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getApproved() {
    return approved;
  }


  public void setApproved(Boolean approved) {
    this.approved = approved;
  }


  public GetRecurringDepositAccountsStatus rejected(Boolean rejected) {
    
    this.rejected = rejected;
    return this;
  }

   /**
   * Get rejected
   * @return rejected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getRejected() {
    return rejected;
  }


  public void setRejected(Boolean rejected) {
    this.rejected = rejected;
  }


  public GetRecurringDepositAccountsStatus withdrawnByApplicant(Boolean withdrawnByApplicant) {
    
    this.withdrawnByApplicant = withdrawnByApplicant;
    return this;
  }

   /**
   * Get withdrawnByApplicant
   * @return withdrawnByApplicant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getWithdrawnByApplicant() {
    return withdrawnByApplicant;
  }


  public void setWithdrawnByApplicant(Boolean withdrawnByApplicant) {
    this.withdrawnByApplicant = withdrawnByApplicant;
  }


  public GetRecurringDepositAccountsStatus active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public GetRecurringDepositAccountsStatus closed(Boolean closed) {
    
    this.closed = closed;
    return this;
  }

   /**
   * Get closed
   * @return closed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getClosed() {
    return closed;
  }


  public void setClosed(Boolean closed) {
    this.closed = closed;
  }


  public GetRecurringDepositAccountsStatus prematureClosed(Boolean prematureClosed) {
    
    this.prematureClosed = prematureClosed;
    return this;
  }

   /**
   * Get prematureClosed
   * @return prematureClosed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getPrematureClosed() {
    return prematureClosed;
  }


  public void setPrematureClosed(Boolean prematureClosed) {
    this.prematureClosed = prematureClosed;
  }


  public GetRecurringDepositAccountsStatus transferInProgress(Boolean transferInProgress) {
    
    this.transferInProgress = transferInProgress;
    return this;
  }

   /**
   * Get transferInProgress
   * @return transferInProgress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getTransferInProgress() {
    return transferInProgress;
  }


  public void setTransferInProgress(Boolean transferInProgress) {
    this.transferInProgress = transferInProgress;
  }


  public GetRecurringDepositAccountsStatus transferOnHold(Boolean transferOnHold) {
    
    this.transferOnHold = transferOnHold;
    return this;
  }

   /**
   * Get transferOnHold
   * @return transferOnHold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getTransferOnHold() {
    return transferOnHold;
  }


  public void setTransferOnHold(Boolean transferOnHold) {
    this.transferOnHold = transferOnHold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringDepositAccountsStatus getRecurringDepositAccountsStatus = (GetRecurringDepositAccountsStatus) o;
    return Objects.equals(this.id, getRecurringDepositAccountsStatus.id) &&
        Objects.equals(this.code, getRecurringDepositAccountsStatus.code) &&
        Objects.equals(this.description, getRecurringDepositAccountsStatus.description) &&
        Objects.equals(this.submittedAndPendingApproval, getRecurringDepositAccountsStatus.submittedAndPendingApproval) &&
        Objects.equals(this.approved, getRecurringDepositAccountsStatus.approved) &&
        Objects.equals(this.rejected, getRecurringDepositAccountsStatus.rejected) &&
        Objects.equals(this.withdrawnByApplicant, getRecurringDepositAccountsStatus.withdrawnByApplicant) &&
        Objects.equals(this.active, getRecurringDepositAccountsStatus.active) &&
        Objects.equals(this.closed, getRecurringDepositAccountsStatus.closed) &&
        Objects.equals(this.prematureClosed, getRecurringDepositAccountsStatus.prematureClosed) &&
        Objects.equals(this.transferInProgress, getRecurringDepositAccountsStatus.transferInProgress) &&
        Objects.equals(this.transferOnHold, getRecurringDepositAccountsStatus.transferOnHold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, description, submittedAndPendingApproval, approved, rejected, withdrawnByApplicant, active, closed, prematureClosed, transferInProgress, transferOnHold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringDepositAccountsStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    submittedAndPendingApproval: ").append(toIndentedString(submittedAndPendingApproval)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    rejected: ").append(toIndentedString(rejected)).append("\n");
    sb.append("    withdrawnByApplicant: ").append(toIndentedString(withdrawnByApplicant)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    prematureClosed: ").append(toIndentedString(prematureClosed)).append("\n");
    sb.append("    transferInProgress: ").append(toIndentedString(transferInProgress)).append("\n");
    sb.append("    transferOnHold: ").append(toIndentedString(transferOnHold)).append("\n");
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

