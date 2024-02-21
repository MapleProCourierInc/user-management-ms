package com.maple.pro.courier.usermanagementms.core.services.implementation;

import com.maple.pro.courier.usermanagementms.core.models.domain.UserEntity;
import com.maple.pro.courier.usermanagementms.core.models.dto.UserResponse;
import com.maple.pro.courier.usermanagementms.core.services.interfaces.IGetUsersByFiltersApplicationService;
import com.maple.pro.courier.usermanagementms.integration.persistence.UserRepository;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Criteria;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@NoArgsConstructor
@Slf4j
public class GetUsersByFiltersApplicationService implements IGetUsersByFiltersApplicationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public List<UserResponse> getUserByFilters(String mobileNumber, OffsetDateTime createdAt, OffsetDateTime updatedAt, String email) {
        log.info("Enter GetUsersByFiltersApplicationService.getUserByFilters");

        Query query = new Query();
        if (mobileNumber != null) {
            query.addCriteria(Criteria.where("mobileNumber").is(mobileNumber));
        }
        if (email != null) {
            query.addCriteria(Criteria.where("email").is(email));
        }

        List<UserEntity> userEntities = mongoTemplate.find(query, UserEntity.class);

        List<UserResponse> userResponses = userEntities.stream().map(userEntity -> {
            // Map from UserEntity to UserResponse here.
            return UserResponse.builder()
                    .userId(userEntity.getUserId())
                    .email(userEntity.getEmail())
                    .mobileNumber(userEntity.getMobileNumber())
                    .createdAt(OffsetDateTime.parse(userEntity.getCreatedAt()))
                    .updatedAt(OffsetDateTime.parse(userEntity.getUpdatedAt()))
                    .firstName(userEntity.getFirstName())
                    .lastName(userEntity.getLastName())
                    .build();
        }).collect(Collectors.toList());

        log.info("Exit GetUsersByFiltersApplicationService.getUserByFilters");
        return userResponses;
    }
}
