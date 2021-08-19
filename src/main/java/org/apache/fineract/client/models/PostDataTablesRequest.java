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
import org.apache.fineract.client.models.PostColumnHeaderData;

/**
 * PostDataTablesRequest
 */
@ApiModel(description = "PostDataTablesRequest")

public class PostDataTablesRequest {
  public static final String SERIALIZED_NAME_APPTABLE_NAME = "apptableName";
  @SerializedName(SERIALIZED_NAME_APPTABLE_NAME)
  private String apptableName;

  public static final String SERIALIZED_NAME_DATATABLE_NAME = "datatableName";
  @SerializedName(SERIALIZED_NAME_DATATABLE_NAME)
  private String datatableName;

  public static final String SERIALIZED_NAME_MULTI_ROW = "multiRow";
  @SerializedName(SERIALIZED_NAME_MULTI_ROW)
  private Boolean multiRow;

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<PostColumnHeaderData> columns = new ArrayList<PostColumnHeaderData>();


  public PostDataTablesRequest apptableName(String apptableName) {
    
    this.apptableName = apptableName;
    return this;
  }

   /**
   * Get apptableName
   * @return apptableName
  **/
  @ApiModelProperty(example = "m_client", required = true, value = "")

  public String getApptableName() {
    return apptableName;
  }


  public void setApptableName(String apptableName) {
    this.apptableName = apptableName;
  }


  public PostDataTablesRequest datatableName(String datatableName) {
    
    this.datatableName = datatableName;
    return this;
  }

   /**
   * Get datatableName
   * @return datatableName
  **/
  @ApiModelProperty(example = "extra_client_details", required = true, value = "")

  public String getDatatableName() {
    return datatableName;
  }


  public void setDatatableName(String datatableName) {
    this.datatableName = datatableName;
  }


  public PostDataTablesRequest multiRow(Boolean multiRow) {
    
    this.multiRow = multiRow;
    return this;
  }

   /**
   * Allows to create multiple entries in the Data Table. Optional, defaults to false. If this property is not provided Data Table will allow only one entry.
   * @return multiRow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Allows to create multiple entries in the Data Table. Optional, defaults to false. If this property is not provided Data Table will allow only one entry.")

  public Boolean getMultiRow() {
    return multiRow;
  }


  public void setMultiRow(Boolean multiRow) {
    this.multiRow = multiRow;
  }


  public PostDataTablesRequest columns(List<PostColumnHeaderData> columns) {
    
    this.columns = columns;
    return this;
  }

  public PostDataTablesRequest addColumnsItem(PostColumnHeaderData columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @ApiModelProperty(required = true, value = "")

  public List<PostColumnHeaderData> getColumns() {
    return columns;
  }


  public void setColumns(List<PostColumnHeaderData> columns) {
    this.columns = columns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostDataTablesRequest postDataTablesRequest = (PostDataTablesRequest) o;
    return Objects.equals(this.apptableName, postDataTablesRequest.apptableName) &&
        Objects.equals(this.datatableName, postDataTablesRequest.datatableName) &&
        Objects.equals(this.multiRow, postDataTablesRequest.multiRow) &&
        Objects.equals(this.columns, postDataTablesRequest.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apptableName, datatableName, multiRow, columns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostDataTablesRequest {\n");
    sb.append("    apptableName: ").append(toIndentedString(apptableName)).append("\n");
    sb.append("    datatableName: ").append(toIndentedString(datatableName)).append("\n");
    sb.append("    multiRow: ").append(toIndentedString(multiRow)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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

