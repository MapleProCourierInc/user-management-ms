package com.maple.pro.courier.usermanagementms.core.services.interfaces;

import com.maple.pro.courier.usermanagementms.core.models.dto.UserResponse;

import java.time.OffsetDateTime;
import java.util.List;


public interface IGetUsersByFiltersApplicationService {

    List<UserResponse> getUserByFilters(String mobileNumber, OffsetDateTime createdAt, OffsetDateTime updatedAt, String email);
}
