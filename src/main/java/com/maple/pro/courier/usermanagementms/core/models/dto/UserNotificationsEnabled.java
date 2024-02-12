package com.maple.pro.courier.usermanagementms.core.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * UserNotificationsEnabled
 */

@JsonTypeName("User_notificationsEnabled")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-03T23:51:21.190824-04:00[America/Halifax]")
public class UserNotificationsEnabled {

  private Boolean email;

  private Boolean sms;

  private Boolean push;

  public UserNotificationsEnabled email(Boolean email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public Boolean getEmail() {
    return email;
  }

  public void setEmail(Boolean email) {
    this.email = email;
  }

  public UserNotificationsEnabled sms(Boolean sms) {
    this.sms = sms;
    return this;
  }

  /**
   * Get sms
   * @return sms
  */
  
  @Schema(name = "sms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sms")
  public Boolean getSms() {
    return sms;
  }

  public void setSms(Boolean sms) {
    this.sms = sms;
  }

  public UserNotificationsEnabled push(Boolean push) {
    this.push = push;
    return this;
  }

  /**
   * Get push
   * @return push
  */
  
  @Schema(name = "push", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("push")
  public Boolean getPush() {
    return push;
  }

  public void setPush(Boolean push) {
    this.push = push;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserNotificationsEnabled userNotificationsEnabled = (UserNotificationsEnabled) o;
    return Objects.equals(this.email, userNotificationsEnabled.email) &&
        Objects.equals(this.sms, userNotificationsEnabled.sms) &&
        Objects.equals(this.push, userNotificationsEnabled.push);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, sms, push);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserNotificationsEnabled {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    push: ").append(toIndentedString(push)).append("\n");
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

