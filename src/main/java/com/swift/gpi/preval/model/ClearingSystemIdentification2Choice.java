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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * Choice of a clearing system identifier.
 */
@Schema(description = "Choice of a clearing system identifier.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-06-19T14:52:07.265298-04:00[America/New_York]")public class ClearingSystemIdentification2Choice {

  @SerializedName("code")
  private String code = null;

  @SerializedName("proprietary")
  private String proprietary = null;
  public ClearingSystemIdentification2Choice code(String code) {
    this.code = code;
    return this;
  }

  

  /**
  * Get code
  * @return code
  **/
  @Schema(description = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public ClearingSystemIdentification2Choice proprietary(String proprietary) {
    this.proprietary = proprietary;
    return this;
  }

  

  /**
  * Get proprietary
  * @return proprietary
  **/
  @Schema(description = "")
  public String getProprietary() {
    return proprietary;
  }
  public void setProprietary(String proprietary) {
    this.proprietary = proprietary;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearingSystemIdentification2Choice clearingSystemIdentification2Choice = (ClearingSystemIdentification2Choice) o;
    return Objects.equals(this.code, clearingSystemIdentification2Choice.code) &&
        Objects.equals(this.proprietary, clearingSystemIdentification2Choice.proprietary);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(code, proprietary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearingSystemIdentification2Choice {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    proprietary: ").append(toIndentedString(proprietary)).append("\n");
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
