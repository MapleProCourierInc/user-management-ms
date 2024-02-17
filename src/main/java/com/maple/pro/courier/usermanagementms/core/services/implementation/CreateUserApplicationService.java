package com.maple.pro.courier.usermanagementms.core.services.implementation;

import com.maple.pro.courier.usermanagementms.core.models.domain.UserEntity;
import com.maple.pro.courier.usermanagementms.core.models.dto.User;
import com.maple.pro.courier.usermanagementms.core.models.dto.UserResponse;
import com.maple.pro.courier.usermanagementms.core.services.interfaces.ICreateUserApplicationService;
import com.maple.pro.courier.usermanagementms.integration.persistence.UserRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;


@Service
@NoArgsConstructor
public class CreateUserApplicationService implements ICreateUserApplicationService {

    @Autowired
    private  UserRepository userRepository;


    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();


    public UserResponse createUser( User user){

        UserEntity userEntity = mapUsertoUserEntity(user);
        userRepository.save(userEntity);

        return prepareUserResponse(userEntity);
    }

    private UserResponse prepareUserResponse(UserEntity userEntity) {
        UserResponse userResponse = new UserResponse();
        userResponse.setUserId(userEntity.getUserId());
        //Will create a bug where canada's multiple timezones will cause this to fail
        if (userEntity.getCreatedAt() != null) {
            userResponse.setCreatedAt(userEntity.getCreatedAt().toInstant().atZone(ZoneId.systemDefault()).toOffsetDateTime());
        }
        userResponse.setEmail(userEntity.getEmail());
        userResponse.setFirstName(userEntity.getFirstName());
        userResponse.setLastName(userEntity.getLastName());
        userResponse.setProfilePictureUrl(userEntity.getProfilePictureUrl());

        return userResponse;
    }

    private UserEntity mapUsertoUserEntity(User user) {
        UserEntity userEntity = new UserEntity();
        if (user.getCreatedAt() != null) {
            userEntity.setCreatedAt(Date.from(user.getCreatedAt().toInstant()));
        }
        userEntity.setEmail(user.getEmail());
        userEntity.setUpdatedAt(userEntity.getCreatedAt());
        userEntity.setFirstName(user.getFirstName());
        userEntity.setLastName(user.getLastName());
        userEntity.setMobileNumber(user.getMobileNumber());
        userEntity.setPrivacyPolicyAccepted(user.getPrivacyPolicyAccepted());
        userEntity.setRole(user.getRole());
        userEntity.setProfilePictureUrl(user.getProfilePictureUrl());
        userEntity.setTosAccepted(user.getTosAccepted());
        userEntity.setPasswordHash(hashPassword(user.getPasswordHash()));
        userEntity.setUserId(generateUserId());

        return userEntity;
    }

    private static String generateUserId() {
        long randomNumber = ThreadLocalRandom.current().nextLong(1_000_000_000L, 10_000_000_000L);
        return "User_" + randomNumber;
    }

    private static String hashPassword(String password) {
        return encoder.encode(password);
    }
}
