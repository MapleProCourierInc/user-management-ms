package com.maple.pro.courier.usermanagementms.core.services.implementation;

import com.maple.pro.courier.usermanagementms.core.models.domain.UserEntity;
import com.maple.pro.courier.usermanagementms.core.models.dto.UserResponse;
import com.maple.pro.courier.usermanagementms.core.services.interfaces.IGetUserApplicationService;
import com.maple.pro.courier.usermanagementms.integration.persistence.UserRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.Optional;

@Service
@NoArgsConstructor
public class GetUserApplicationService implements IGetUserApplicationService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserResponse getUser(String userId) {
        Optional<UserEntity> searchResult = userRepository.findById(userId);

        return searchResult.map(userEntity -> UserResponse.builder().userId(userEntity.getUserId())
                .email(userEntity.getEmail())
                .firstName(userEntity.getFirstName())
                .lastName(userEntity.getLastName())
                .mobileNumber(userEntity.getMobileNumber())
                .profilePictureUrl(userEntity.getProfilePictureUrl())
                .createdAt(OffsetDateTime.parse(userEntity.getCreatedAt()))
                .updatedAt(OffsetDateTime.parse(userEntity.getUpdatedAt()))
                .build()).orElse(null);
    }
}
