package com.maple.pro.courier.usermanagementms.core.models.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.OffsetDateTime;
import java.util.List;

@Document(value = "user")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {

    @Id
    private String userId;

    @Indexed
    private String email;

    private String passwordHash;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Indexed
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Indexed
    private OffsetDateTime updatedAt;

    @Indexed
    private String mobileNumber;


    private List<Address> addresses;

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
}
