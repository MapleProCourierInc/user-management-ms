package com.maple.pro.courier.usermanagementms.core.services.interfaces;

import com.maple.pro.courier.usermanagementms.core.models.dto.UserResponse;

public interface IGetUserApplicationService {
     UserResponse getUser(String user);
}
