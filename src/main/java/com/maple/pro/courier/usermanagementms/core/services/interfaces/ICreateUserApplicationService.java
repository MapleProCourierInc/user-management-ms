package com.maple.pro.courier.usermanagementms.core.services.interfaces;

import com.maple.pro.courier.usermanagementms.core.models.dto.User;
import com.maple.pro.courier.usermanagementms.core.models.dto.UserResponse;
import jakarta.validation.Valid;

public interface ICreateUserApplicationService {

    public UserResponse createUser(User user);
}
