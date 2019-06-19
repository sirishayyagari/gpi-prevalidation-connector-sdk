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
 * Gets or Sets AccountValidationResponse2Code
 */
@JsonAdapter(AccountValidationResponse2Code.Adapter.class)
public enum AccountValidationResponse2Code {
  NMTC("NMTC"),
  MTCH("MTCH");

  private String value;

  AccountValidationResponse2Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountValidationResponse2Code fromValue(String text) {
    for (AccountValidationResponse2Code b : AccountValidationResponse2Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AccountValidationResponse2Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountValidationResponse2Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountValidationResponse2Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountValidationResponse2Code.fromValue(String.valueOf(value));
    }
  }
}
