/*
 * Beneficiary account pre-validation
 * Move your app forward with the Account Pre-Validation API
 *
 * OpenAPI spec version: 1.0.7-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.swift.gpi.preval.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.swift.gpi.preval.model.StatusCodeConnector;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * ErrorCodeConsumer
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-06-19T14:52:07.265298-04:00[America/New_York]")public class ErrorCodeConsumer {

  @SerializedName("status")
  private StatusCodeConnector status = null;
  public ErrorCodeConsumer status(StatusCodeConnector status) {
    this.status = status;
    return this;
  }

  

  /**
  * Get status
  * @return status
  **/
  @Schema(required = true, description = "")
  public StatusCodeConnector getStatus() {
    return status;
  }
  public void setStatus(StatusCodeConnector status) {
    this.status = status;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorCodeConsumer errorCodeConsumer = (ErrorCodeConsumer) o;
    return Objects.equals(this.status, errorCodeConsumer.status);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorCodeConsumer {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
