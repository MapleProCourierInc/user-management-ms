package com.maple.pro.courier.usermanagementms.core.services.implementation;

import com.maple.pro.courier.usermanagementms.core.models.domain.AddressEntity;
import com.maple.pro.courier.usermanagementms.core.models.domain.UserEntity;
import com.maple.pro.courier.usermanagementms.core.models.dto.Address;
import com.maple.pro.courier.usermanagementms.core.models.dto.UserResponse;
import com.maple.pro.courier.usermanagementms.core.models.dto.UserUpdate;
import com.maple.pro.courier.usermanagementms.core.services.interfaces.IUpdateUserApplicationService;
import com.maple.pro.courier.usermanagementms.integration.persistence.UserRepository;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@NoArgsConstructor
@Slf4j
public class UpdateUserApplicationService implements IUpdateUserApplicationService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserResponse updateUser(String id, UserUpdate userUpdate) {
        log.info("Enter UpdateUserApplicationService.updateUser");

        UserEntity updatedUser = mapUserUpdateToUserEntity(userUpdate);
        UserEntity response = userRepository.save(updatedUser);

        log.info("Exit UpdateUserApplicationService.updateUser");

        return prepareUserResponse(response);
    }

    private static UserEntity mapUserUpdateToUserEntity(UserUpdate userUpdate) {
        UserEntity userEntity = new UserEntity();


        userEntity.setUserId(userUpdate.getUserId());
        userEntity.setEmail(userUpdate.getEmail());
        userEntity.setFirstName(userUpdate.getFirstName());
        userEntity.setLastName(userUpdate.getLastName());
        userEntity.setMobileNumber(userUpdate.getMobileNumber());
        userEntity.setProfilePictureUrl(userUpdate.getProfilePictureUrl());
        userEntity.setLocale(userUpdate.getLocale());
        userEntity.setTimeZone(userUpdate.getTimeZone());


        userEntity.setPasswordHash(userUpdate.getPasswordHash());
        userEntity.setPasswordResetToken(userUpdate.getPasswordResetToken());
        userEntity.setEmailVerified(userUpdate.getEmailVerified());
        userEntity.setLoginAttempts(userUpdate.getLoginAttempts());
        userEntity.setRole(userUpdate.getRole());
        userEntity.setMarketingPreferences(userUpdate.getMarketingPreferences());
        userEntity.setTosAccepted(userUpdate.getTosAccepted());
        userEntity.setPrivacyPolicyAccepted(userUpdate.getPrivacyPolicyAccepted());

        //Notification Enabled needs handling
        //userEntity.setNotificationsEnabled(userUpdate.getNotificationsEnabled());

        if (userUpdate.getAddresses() != null) {
            userEntity.setAddressEntities(mapAddressesToAddressEntities(userUpdate.getAddresses()));
        }


        if (userUpdate.getCreatedAt() != null) {
            userEntity.setCreatedAt(userUpdate.getCreatedAt().toString());
        }
        if (userUpdate.getUpdatedAt() != null) {
            userEntity.setUpdatedAt(userUpdate.getUpdatedAt().toString());
        }
        if (userUpdate.getLastLogin() != null) {
            userEntity.setLastLogin(userUpdate.getLastLogin().toString());
        }

        return userEntity;
    }

    private static List<AddressEntity> mapAddressesToAddressEntities(List<Address> addresses) {
        if (addresses == null || addresses.isEmpty()) {
            return null;
        }

        return addresses.stream()
                .map(address -> mapAddressToAddressEntity(address))
                .collect(Collectors.toList());
    }

    private static AddressEntity mapAddressToAddressEntity(Address address) {
        if (address == null) {
            return null;
        }

        return AddressEntity.builder()
                .streetNumber(address.getStreetNumber())
                .streetName(address.getStreetName())
                .unit(address.getUnit())
                .city(address.getCity())
                .stateProvince(address.getStateProvince())
                .postalCode(address.getPostalCode())
                .country(address.getCountry())
                .build();
    }

    private UserResponse prepareUserResponse(UserEntity userEntity) {
        UserResponse userResponse = UserResponse.builder().build();
        userResponse.setUserId(userEntity.getUserId());
        userResponse.setCreatedAt(OffsetDateTime.parse(userEntity.getCreatedAt()));
        userResponse.setUpdatedAt(OffsetDateTime.parse(userEntity.getUpdatedAt()));
        userResponse.setEmail(userEntity.getEmail());
        userResponse.setFirstName(userEntity.getFirstName());
        userResponse.setLastName(userEntity.getLastName());
        userResponse.setProfilePictureUrl(userEntity.getProfilePictureUrl());

        return userResponse;
    }
}
