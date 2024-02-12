package com.maple.pro.courier.usermanagementms.core.models.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserNotificationsEnabled {

    private Boolean email;

    private Boolean sms;

    private Boolean push;
}
