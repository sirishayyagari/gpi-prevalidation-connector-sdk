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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets AccountValidationCheckContext1Code
 */
@JsonAdapter(AccountValidationCheckContext1Code.Adapter.class)
public enum AccountValidationCheckContext1Code {
  BENR("BENR"),
  PAYM("PAYM"),
  RFPP("RFPP");

  private String value;

  AccountValidationCheckContext1Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountValidationCheckContext1Code fromValue(String text) {
    for (AccountValidationCheckContext1Code b : AccountValidationCheckContext1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AccountValidationCheckContext1Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountValidationCheckContext1Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountValidationCheckContext1Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountValidationCheckContext1Code.fromValue(String.valueOf(value));
    }
  }
}
