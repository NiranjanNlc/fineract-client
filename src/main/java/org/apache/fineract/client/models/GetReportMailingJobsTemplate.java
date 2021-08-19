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
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.EnumOptionData;

/**
 * GetReportMailingJobsTemplate
 */
@ApiModel(description = "GetReportMailingJobsTemplate")

public class GetReportMailingJobsTemplate {
  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_EMAIL_ATTACHMENT_FILE_FORMAT_OPTIONS = "emailAttachmentFileFormatOptions";
  @SerializedName(SERIALIZED_NAME_EMAIL_ATTACHMENT_FILE_FORMAT_OPTIONS)
  private List<EnumOptionData> emailAttachmentFileFormatOptions = null;

  public static final String SERIALIZED_NAME_STRETCHY_REPORT_PARAM_DATE_OPTIONS = "stretchyReportParamDateOptions";
  @SerializedName(SERIALIZED_NAME_STRETCHY_REPORT_PARAM_DATE_OPTIONS)
  private List<EnumOptionData> stretchyReportParamDateOptions = null;


  public GetReportMailingJobsTemplate isActive(Boolean isActive) {
    
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


  public GetReportMailingJobsTemplate emailAttachmentFileFormatOptions(List<EnumOptionData> emailAttachmentFileFormatOptions) {
    
    this.emailAttachmentFileFormatOptions = emailAttachmentFileFormatOptions;
    return this;
  }

  public GetReportMailingJobsTemplate addEmailAttachmentFileFormatOptionsItem(EnumOptionData emailAttachmentFileFormatOptionsItem) {
    if (this.emailAttachmentFileFormatOptions == null) {
      this.emailAttachmentFileFormatOptions = new ArrayList<EnumOptionData>();
    }
    this.emailAttachmentFileFormatOptions.add(emailAttachmentFileFormatOptionsItem);
    return this;
  }

   /**
   * Get emailAttachmentFileFormatOptions
   * @return emailAttachmentFileFormatOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumOptionData> getEmailAttachmentFileFormatOptions() {
    return emailAttachmentFileFormatOptions;
  }


  public void setEmailAttachmentFileFormatOptions(List<EnumOptionData> emailAttachmentFileFormatOptions) {
    this.emailAttachmentFileFormatOptions = emailAttachmentFileFormatOptions;
  }


  public GetReportMailingJobsTemplate stretchyReportParamDateOptions(List<EnumOptionData> stretchyReportParamDateOptions) {
    
    this.stretchyReportParamDateOptions = stretchyReportParamDateOptions;
    return this;
  }

  public GetReportMailingJobsTemplate addStretchyReportParamDateOptionsItem(EnumOptionData stretchyReportParamDateOptionsItem) {
    if (this.stretchyReportParamDateOptions == null) {
      this.stretchyReportParamDateOptions = new ArrayList<EnumOptionData>();
    }
    this.stretchyReportParamDateOptions.add(stretchyReportParamDateOptionsItem);
    return this;
  }

   /**
   * Get stretchyReportParamDateOptions
   * @return stretchyReportParamDateOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EnumOptionData> getStretchyReportParamDateOptions() {
    return stretchyReportParamDateOptions;
  }


  public void setStretchyReportParamDateOptions(List<EnumOptionData> stretchyReportParamDateOptions) {
    this.stretchyReportParamDateOptions = stretchyReportParamDateOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReportMailingJobsTemplate getReportMailingJobsTemplate = (GetReportMailingJobsTemplate) o;
    return Objects.equals(this.isActive, getReportMailingJobsTemplate.isActive) &&
        Objects.equals(this.emailAttachmentFileFormatOptions, getReportMailingJobsTemplate.emailAttachmentFileFormatOptions) &&
        Objects.equals(this.stretchyReportParamDateOptions, getReportMailingJobsTemplate.stretchyReportParamDateOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive, emailAttachmentFileFormatOptions, stretchyReportParamDateOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReportMailingJobsTemplate {\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    emailAttachmentFileFormatOptions: ").append(toIndentedString(emailAttachmentFileFormatOptions)).append("\n");
    sb.append("    stretchyReportParamDateOptions: ").append(toIndentedString(stretchyReportParamDateOptions)).append("\n");
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

