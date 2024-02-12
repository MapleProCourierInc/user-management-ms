package com.maple.pro.courier.usermanagementms.core.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * UserUpdate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-03T23:51:21.190824-04:00[America/Halifax]")
public class UserUpdate {

  private String userId;

  private String email;

  private JsonNullable<String> passwordHash = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  private String mobileNumber;

  @Valid
  private List<@Valid Address> addresses;

  private String firstName;

  private String lastName;

  private String profilePictureUrl;

  private JsonNullable<String> passwordResetToken = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> emailVerified = JsonNullable.<Boolean>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastLogin;

  private JsonNullable<Integer> loginAttempts = JsonNullable.<Integer>undefined();

  private JsonNullable<String> role = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> marketingPreferences = JsonNullable.<Boolean>undefined();

  private JsonNullable<Object> notificationsEnabled = JsonNullable.<Object>undefined();

  private JsonNullable<Boolean> tosAccepted = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> privacyPolicyAccepted = JsonNullable.<Boolean>undefined();

  private String locale;

  private String timeZone;

  public UserUpdate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserUpdate(String email, String passwordHash, String firstName, String lastName) {
    this.email = email;
    this.passwordHash = JsonNullable.of(passwordHash);
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public UserUpdate userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", example = "uuid-v4-string", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserUpdate email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull 
  @Schema(name = "email", example = "user@example.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserUpdate passwordHash(String passwordHash) {
    this.passwordHash = JsonNullable.of(passwordHash);
    return this;
  }

  /**
   * Get passwordHash
   * @return passwordHash
  */
  @NotNull 
  @Schema(name = "passwordHash", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("passwordHash")
  public JsonNullable<String> getPasswordHash() {
    return passwordHash;
  }

  public void setPasswordHash(JsonNullable<String> passwordHash) {
    this.passwordHash = passwordHash;
  }

  public UserUpdate createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "createdAt", example = "2024-01-20T12:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public UserUpdate updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updatedAt", example = "2024-01-20T12:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public UserUpdate mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * Get mobileNumber
   * @return mobileNumber
  */
  
  @Schema(name = "mobileNumber", example = "+1234567890", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobileNumber")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public UserUpdate addresses(List<@Valid Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public UserUpdate addAddressesItem(Address addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * Get addresses
   * @return addresses
  */
  @Valid 
  @Schema(name = "addresses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addresses")
  public List<@Valid Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<@Valid Address> addresses) {
    this.addresses = addresses;
  }

  public UserUpdate firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @NotNull 
  @Schema(name = "firstName", example = "John", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserUpdate lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @NotNull 
  @Schema(name = "lastName", example = "Doe", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserUpdate profilePictureUrl(String profilePictureUrl) {
    this.profilePictureUrl = profilePictureUrl;
    return this;
  }

  /**
   * Get profilePictureUrl
   * @return profilePictureUrl
  */
  
  @Schema(name = "profilePictureUrl", example = "https://example.com/images/user123.jpg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profilePictureUrl")
  public String getProfilePictureUrl() {
    return profilePictureUrl;
  }

  public void setProfilePictureUrl(String profilePictureUrl) {
    this.profilePictureUrl = profilePictureUrl;
  }

  public UserUpdate passwordResetToken(String passwordResetToken) {
    this.passwordResetToken = JsonNullable.of(passwordResetToken);
    return this;
  }

  /**
   * Get passwordResetToken
   * @return passwordResetToken
  */
  
  @Schema(name = "passwordResetToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passwordResetToken")
  public JsonNullable<String> getPasswordResetToken() {
    return passwordResetToken;
  }

  public void setPasswordResetToken(JsonNullable<String> passwordResetToken) {
    this.passwordResetToken = passwordResetToken;
  }

  public UserUpdate emailVerified(Boolean emailVerified) {
    this.emailVerified = JsonNullable.of(emailVerified);
    return this;
  }

  /**
   * Get emailVerified
   * @return emailVerified
  */
  
  @Schema(name = "emailVerified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailVerified")
  public JsonNullable<Boolean> getEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(JsonNullable<Boolean> emailVerified) {
    this.emailVerified = emailVerified;
  }

  public UserUpdate lastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

  /**
   * Get lastLogin
   * @return lastLogin
  */
  @Valid 
  @Schema(name = "lastLogin", example = "2024-01-20T11:50Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastLogin")
  public OffsetDateTime getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }

  public UserUpdate loginAttempts(Integer loginAttempts) {
    this.loginAttempts = JsonNullable.of(loginAttempts);
    return this;
  }

  /**
   * Get loginAttempts
   * @return loginAttempts
  */
  
  @Schema(name = "loginAttempts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("loginAttempts")
  public JsonNullable<Integer> getLoginAttempts() {
    return loginAttempts;
  }

  public void setLoginAttempts(JsonNullable<Integer> loginAttempts) {
    this.loginAttempts = loginAttempts;
  }

  public UserUpdate role(String role) {
    this.role = JsonNullable.of(role);
    return this;
  }

  /**
   * Get role
   * @return role
  */
  
  @Schema(name = "role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public JsonNullable<String> getRole() {
    return role;
  }

  public void setRole(JsonNullable<String> role) {
    this.role = role;
  }

  public UserUpdate marketingPreferences(Boolean marketingPreferences) {
    this.marketingPreferences = JsonNullable.of(marketingPreferences);
    return this;
  }

  /**
   * Get marketingPreferences
   * @return marketingPreferences
  */
  
  @Schema(name = "marketingPreferences", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketingPreferences")
  public JsonNullable<Boolean> getMarketingPreferences() {
    return marketingPreferences;
  }

  public void setMarketingPreferences(JsonNullable<Boolean> marketingPreferences) {
    this.marketingPreferences = marketingPreferences;
  }

  public UserUpdate notificationsEnabled(Object notificationsEnabled) {
    this.notificationsEnabled = JsonNullable.of(notificationsEnabled);
    return this;
  }

  /**
   * Get notificationsEnabled
   * @return notificationsEnabled
  */
  
  @Schema(name = "notificationsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notificationsEnabled")
  public JsonNullable<Object> getNotificationsEnabled() {
    return notificationsEnabled;
  }

  public void setNotificationsEnabled(JsonNullable<Object> notificationsEnabled) {
    this.notificationsEnabled = notificationsEnabled;
  }

  public UserUpdate tosAccepted(Boolean tosAccepted) {
    this.tosAccepted = JsonNullable.of(tosAccepted);
    return this;
  }

  /**
   * Get tosAccepted
   * @return tosAccepted
  */
  
  @Schema(name = "tosAccepted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tosAccepted")
  public JsonNullable<Boolean> getTosAccepted() {
    return tosAccepted;
  }

  public void setTosAccepted(JsonNullable<Boolean> tosAccepted) {
    this.tosAccepted = tosAccepted;
  }

  public UserUpdate privacyPolicyAccepted(Boolean privacyPolicyAccepted) {
    this.privacyPolicyAccepted = JsonNullable.of(privacyPolicyAccepted);
    return this;
  }

  /**
   * Get privacyPolicyAccepted
   * @return privacyPolicyAccepted
  */
  
  @Schema(name = "privacyPolicyAccepted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privacyPolicyAccepted")
  public JsonNullable<Boolean> getPrivacyPolicyAccepted() {
    return privacyPolicyAccepted;
  }

  public void setPrivacyPolicyAccepted(JsonNullable<Boolean> privacyPolicyAccepted) {
    this.privacyPolicyAccepted = privacyPolicyAccepted;
  }

  public UserUpdate locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
  */
  
  @Schema(name = "locale", example = "en-US", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public UserUpdate timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
  */
  
  @Schema(name = "timeZone", example = "America/New_York", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdate userUpdate = (UserUpdate) o;
    return Objects.equals(this.userId, userUpdate.userId) &&
        Objects.equals(this.email, userUpdate.email) &&
        Objects.equals(this.passwordHash, userUpdate.passwordHash) &&
        Objects.equals(this.createdAt, userUpdate.createdAt) &&
        Objects.equals(this.updatedAt, userUpdate.updatedAt) &&
        Objects.equals(this.mobileNumber, userUpdate.mobileNumber) &&
        Objects.equals(this.addresses, userUpdate.addresses) &&
        Objects.equals(this.firstName, userUpdate.firstName) &&
        Objects.equals(this.lastName, userUpdate.lastName) &&
        Objects.equals(this.profilePictureUrl, userUpdate.profilePictureUrl) &&
        equalsNullable(this.passwordResetToken, userUpdate.passwordResetToken) &&
        equalsNullable(this.emailVerified, userUpdate.emailVerified) &&
        Objects.equals(this.lastLogin, userUpdate.lastLogin) &&
        equalsNullable(this.loginAttempts, userUpdate.loginAttempts) &&
        equalsNullable(this.role, userUpdate.role) &&
        equalsNullable(this.marketingPreferences, userUpdate.marketingPreferences) &&
        equalsNullable(this.notificationsEnabled, userUpdate.notificationsEnabled) &&
        equalsNullable(this.tosAccepted, userUpdate.tosAccepted) &&
        equalsNullable(this.privacyPolicyAccepted, userUpdate.privacyPolicyAccepted) &&
        Objects.equals(this.locale, userUpdate.locale) &&
        Objects.equals(this.timeZone, userUpdate.timeZone);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, email, passwordHash, createdAt, updatedAt, mobileNumber, addresses, firstName, lastName, profilePictureUrl, hashCodeNullable(passwordResetToken), hashCodeNullable(emailVerified), lastLogin, hashCodeNullable(loginAttempts), hashCodeNullable(role), hashCodeNullable(marketingPreferences), hashCodeNullable(notificationsEnabled), hashCodeNullable(tosAccepted), hashCodeNullable(privacyPolicyAccepted), locale, timeZone);
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
    sb.append("class UserUpdate {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    passwordHash: ").append(toIndentedString(passwordHash)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    profilePictureUrl: ").append(toIndentedString(profilePictureUrl)).append("\n");
    sb.append("    passwordResetToken: ").append(toIndentedString(passwordResetToken)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    loginAttempts: ").append(toIndentedString(loginAttempts)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    marketingPreferences: ").append(toIndentedString(marketingPreferences)).append("\n");
    sb.append("    notificationsEnabled: ").append(toIndentedString(notificationsEnabled)).append("\n");
    sb.append("    tosAccepted: ").append(toIndentedString(tosAccepted)).append("\n");
    sb.append("    privacyPolicyAccepted: ").append(toIndentedString(privacyPolicyAccepted)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

