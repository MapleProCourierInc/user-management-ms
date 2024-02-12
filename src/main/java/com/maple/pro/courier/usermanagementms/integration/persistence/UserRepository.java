package com.maple.pro.courier.usermanagementms.integration.persistence;

import com.maple.pro.courier.usermanagementms.core.models.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
