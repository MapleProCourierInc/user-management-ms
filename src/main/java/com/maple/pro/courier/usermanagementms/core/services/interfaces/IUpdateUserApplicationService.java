package com.maple.pro.courier.usermanagementms.core.services.interfaces;

import com.maple.pro.courier.usermanagementms.core.models.dto.UserResponse;
import com.maple.pro.courier.usermanagementms.core.models.dto.UserUpdate;
import org.springframework.http.ResponseEntity;

public interface IUpdateUserApplicationService {
    UserResponse updateUser(String id, UserUpdate userUpdate);
}
