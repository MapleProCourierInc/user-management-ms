package com.maple.pro.courier.usermanagementms.integration.persistence;

import com.maple.pro.courier.usermanagementms.core.models.domain.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
}
