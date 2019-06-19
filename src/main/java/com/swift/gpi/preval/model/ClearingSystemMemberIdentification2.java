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
import com.swift.gpi.preval.model.ClearingSystemIdentification2Choice;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * Unique identification, as assigned by a clearing system, to unambiguously identify a member of the clearing system.
 */
@Schema(description = "Unique identification, as assigned by a clearing system, to unambiguously identify a member of the clearing system.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-06-19T14:52:07.265298-04:00[America/New_York]")public class ClearingSystemMemberIdentification2 {

  @SerializedName("clearing_system_identification")
  private ClearingSystemIdentification2Choice clearingSystemIdentification = null;

  @SerializedName("member_identification")
  private String memberIdentification = null;
  public ClearingSystemMemberIdentification2 clearingSystemIdentification(ClearingSystemIdentification2Choice clearingSystemIdentification) {
    this.clearingSystemIdentification = clearingSystemIdentification;
    return this;
  }

  

  /**
  * Get clearingSystemIdentification
  * @return clearingSystemIdentification
  **/
  @Schema(description = "")
  public ClearingSystemIdentification2Choice getClearingSystemIdentification() {
    return clearingSystemIdentification;
  }
  public void setClearingSystemIdentification(ClearingSystemIdentification2Choice clearingSystemIdentification) {
    this.clearingSystemIdentification = clearingSystemIdentification;
  }
  public ClearingSystemMemberIdentification2 memberIdentification(String memberIdentification) {
    this.memberIdentification = memberIdentification;
    return this;
  }

  

  /**
  * Get memberIdentification
  * @return memberIdentification
  **/
  @Schema(required = true, description = "")
  public String getMemberIdentification() {
    return memberIdentification;
  }
  public void setMemberIdentification(String memberIdentification) {
    this.memberIdentification = memberIdentification;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearingSystemMemberIdentification2 clearingSystemMemberIdentification2 = (ClearingSystemMemberIdentification2) o;
    return Objects.equals(this.clearingSystemIdentification, clearingSystemMemberIdentification2.clearingSystemIdentification) &&
        Objects.equals(this.memberIdentification, clearingSystemMemberIdentification2.memberIdentification);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(clearingSystemIdentification, memberIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearingSystemMemberIdentification2 {\n");
    
    sb.append("    clearingSystemIdentification: ").append(toIndentedString(clearingSystemIdentification)).append("\n");
    sb.append("    memberIdentification: ").append(toIndentedString(memberIdentification)).append("\n");
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
