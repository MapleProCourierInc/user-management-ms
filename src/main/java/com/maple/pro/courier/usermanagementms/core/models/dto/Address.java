package com.maple.pro.courier.usermanagementms.core.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.util.Objects;

/**
 * Address
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-03T23:51:21.190824-04:00[America/Halifax]")
public class Address {

  private String streetNumber;

  private String streetName;

  private JsonNullable<String> unit = JsonNullable.<String>undefined();

  private String city;

  private String stateProvince;

  private String postalCode;

  private String country;

  public Address() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Address(String streetNumber, String streetName, String city, String stateProvince, String postalCode, String country) {
    this.streetNumber = streetNumber;
    this.streetName = streetName;
    this.city = city;
    this.stateProvince = stateProvince;
    this.postalCode = postalCode;
    this.country = country;
  }

  public Address streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

  /**
   * The number of the building on the street.
   * @return streetNumber
  */
  @NotNull 
  @Schema(name = "streetNumber", example = "123", description = "The number of the building on the street.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("streetNumber")
  public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public Address streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * The name of the street.
   * @return streetName
  */
  @NotNull 
  @Schema(name = "streetName", example = "Main St", description = "The name of the street.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("streetName")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Address unit(String unit) {
    this.unit = JsonNullable.of(unit);
    return this;
  }

  /**
   * Apartment or unit number, if applicable.
   * @return unit
  */
  
  @Schema(name = "unit", example = "Unit 2", description = "Apartment or unit number, if applicable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unit")
  public JsonNullable<String> getUnit() {
    return unit;
  }

  public void setUnit(JsonNullable<String> unit) {
    this.unit = unit;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The city or municipality.
   * @return city
  */
  @NotNull 
  @Schema(name = "city", example = "Anytown", description = "The city or municipality.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address stateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
    return this;
  }

  /**
   * The state or province of the address.
   * @return stateProvince
  */
  @NotNull 
  @Schema(name = "stateProvince", example = "NY", description = "The state or province of the address.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stateProvince")
  public String getStateProvince() {
    return stateProvince;
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * The postal or ZIP code of the address.
   * @return postalCode
  */
  @NotNull 
  @Schema(name = "postalCode", example = "12345", description = "The postal or ZIP code of the address.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The country of the address.
   * @return country
  */
  @NotNull 
  @Schema(name = "country", example = "USA", description = "The country of the address.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.streetNumber, address.streetNumber) &&
        Objects.equals(this.streetName, address.streetName) &&
        equalsNullable(this.unit, address.unit) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.stateProvince, address.stateProvince) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.country, address.country);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetNumber, streetName, hashCodeNullable(unit), city, stateProvince, postalCode, country);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

