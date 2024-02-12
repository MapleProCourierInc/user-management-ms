package com.maple.pro.courier.usermanagementms.core.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * User
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-03T23:51:21.190824-04:00[America/Halifax]")
public class User {

  private String userId;

  private String email;

  private String passwordHash;

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

  private String passwordResetToken;

  private Boolean emailVerified;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastLogin;

  private Integer loginAttempts;

  private String role;

  private Boolean marketingPreferences;

  private UserNotificationsEnabled notificationsEnabled;

  private Boolean tosAccepted;

  private Boolean privacyPolicyAccepted;

  private String locale;

  private String timeZone;

  public User() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public User(String email, String passwordHash, String firstName, String lastName) {
    this.email = email;
    this.passwordHash = passwordHash;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public User userId(String userId) {
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

  public User email(String email) {
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

  public User passwordHash(String passwordHash) {
    this.passwordHash = passwordHash;
    return this;
  }

  /**
   * Get passwordHash
   * @return passwordHash
  */
  @NotNull 
  @Schema(name = "passwordHash", example = "hashedPasswordString", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("passwordHash")
  public String getPasswordHash() {
    return passwordHash;
  }

  public void setPasswordHash(String passwordHash) {
    this.passwordHash = passwordHash;
  }

  public User createdAt(OffsetDateTime createdAt) {
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

  public User updatedAt(OffsetDateTime updatedAt) {
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

  public User mobileNumber(String mobileNumber) {
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

  public User addresses(List<@Valid Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public User addAddressesItem(Address addressesItem) {
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

  public User firstName(String firstName) {
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

  public User lastName(String lastName) {
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

  public User profilePictureUrl(String profilePictureUrl) {
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

  public User passwordResetToken(String passwordResetToken) {
    this.passwordResetToken = passwordResetToken;
    return this;
  }

  /**
   * Get passwordResetToken
   * @return passwordResetToken
  */
  
  @Schema(name = "passwordResetToken", example = "tokenString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passwordResetToken")
  public String getPasswordResetToken() {
    return passwordResetToken;
  }

  public void setPasswordResetToken(String passwordResetToken) {
    this.passwordResetToken = passwordResetToken;
  }

  public User emailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

  /**
   * Get emailVerified
   * @return emailVerified
  */
  
  @Schema(name = "emailVerified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailVerified")
  public Boolean getEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  public User lastLogin(OffsetDateTime lastLogin) {
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

  public User loginAttempts(Integer loginAttempts) {
    this.loginAttempts = loginAttempts;
    return this;
  }

  /**
   * Get loginAttempts
   * @return loginAttempts
  */
  
  @Schema(name = "loginAttempts", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("loginAttempts")
  public Integer getLoginAttempts() {
    return loginAttempts;
  }

  public void setLoginAttempts(Integer loginAttempts) {
    this.loginAttempts = loginAttempts;
  }

  public User role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  
  @Schema(name = "role", example = "customer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public User marketingPreferences(Boolean marketingPreferences) {
    this.marketingPreferences = marketingPreferences;
    return this;
  }

  /**
   * Get marketingPreferences
   * @return marketingPreferences
  */
  
  @Schema(name = "marketingPreferences", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketingPreferences")
  public Boolean getMarketingPreferences() {
    return marketingPreferences;
  }

  public void setMarketingPreferences(Boolean marketingPreferences) {
    this.marketingPreferences = marketingPreferences;
  }

  public User notificationsEnabled(UserNotificationsEnabled notificationsEnabled) {
    this.notificationsEnabled = notificationsEnabled;
    return this;
  }

  /**
   * Get notificationsEnabled
   * @return notificationsEnabled
  */
  @Valid 
  @Schema(name = "notificationsEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notificationsEnabled")
  public UserNotificationsEnabled getNotificationsEnabled() {
    return notificationsEnabled;
  }

  public void setNotificationsEnabled(UserNotificationsEnabled notificationsEnabled) {
    this.notificationsEnabled = notificationsEnabled;
  }

  public User tosAccepted(Boolean tosAccepted) {
    this.tosAccepted = tosAccepted;
    return this;
  }

  /**
   * Get tosAccepted
   * @return tosAccepted
  */
  
  @Schema(name = "tosAccepted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tosAccepted")
  public Boolean getTosAccepted() {
    return tosAccepted;
  }

  public void setTosAccepted(Boolean tosAccepted) {
    this.tosAccepted = tosAccepted;
  }

  public User privacyPolicyAccepted(Boolean privacyPolicyAccepted) {
    this.privacyPolicyAccepted = privacyPolicyAccepted;
    return this;
  }

  /**
   * Get privacyPolicyAccepted
   * @return privacyPolicyAccepted
  */
  
  @Schema(name = "privacyPolicyAccepted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privacyPolicyAccepted")
  public Boolean getPrivacyPolicyAccepted() {
    return privacyPolicyAccepted;
  }

  public void setPrivacyPolicyAccepted(Boolean privacyPolicyAccepted) {
    this.privacyPolicyAccepted = privacyPolicyAccepted;
  }

  public User locale(String locale) {
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

  public User timeZone(String timeZone) {
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
    User user = (User) o;
    return Objects.equals(this.userId, user.userId) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.passwordHash, user.passwordHash) &&
        Objects.equals(this.createdAt, user.createdAt) &&
        Objects.equals(this.updatedAt, user.updatedAt) &&
        Objects.equals(this.mobileNumber, user.mobileNumber) &&
        Objects.equals(this.addresses, user.addresses) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.profilePictureUrl, user.profilePictureUrl) &&
        Objects.equals(this.passwordResetToken, user.passwordResetToken) &&
        Objects.equals(this.emailVerified, user.emailVerified) &&
        Objects.equals(this.lastLogin, user.lastLogin) &&
        Objects.equals(this.loginAttempts, user.loginAttempts) &&
        Objects.equals(this.role, user.role) &&
        Objects.equals(this.marketingPreferences, user.marketingPreferences) &&
        Objects.equals(this.notificationsEnabled, user.notificationsEnabled) &&
        Objects.equals(this.tosAccepted, user.tosAccepted) &&
        Objects.equals(this.privacyPolicyAccepted, user.privacyPolicyAccepted) &&
        Objects.equals(this.locale, user.locale) &&
        Objects.equals(this.timeZone, user.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, email, passwordHash, createdAt, updatedAt, mobileNumber, addresses, firstName, lastName, profilePictureUrl, passwordResetToken, emailVerified, lastLogin, loginAttempts, role, marketingPreferences, notificationsEnabled, tosAccepted, privacyPolicyAccepted, locale, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
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

