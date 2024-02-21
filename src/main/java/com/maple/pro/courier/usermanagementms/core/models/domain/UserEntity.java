package com.maple.pro.courier.usermanagementms.core.models.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "user")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserEntity {

    @Id
    private String userId;

    @Indexed
    private String email;

    private String passwordHash;

    @Indexed
    private String createdAt;

    @Indexed
    private String updatedAt;

    @Indexed
    private String mobileNumber;

    private List<Address> addresses;

    private String firstName;

    private String lastName;

    private String profilePictureUrl;

    private String passwordResetToken;

    private Boolean emailVerified;

    private String lastLogin;

    private Integer loginAttempts;

    private String role;

    private Boolean marketingPreferences;

    private UserNotificationsEnabled notificationsEnabled;

    private Boolean tosAccepted;

    private Boolean privacyPolicyAccepted;

    private String locale;

    private String timeZone;
}
