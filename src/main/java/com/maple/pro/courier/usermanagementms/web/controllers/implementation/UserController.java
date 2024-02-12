package com.maple.pro.courier.usermanagementms.web.controllers.implementation;

import com.maple.pro.courier.usermanagementms.core.models.dto.User;
import com.maple.pro.courier.usermanagementms.core.models.dto.UserResponse;
import com.maple.pro.courier.usermanagementms.core.models.dto.UserUpdate;
import com.maple.pro.courier.usermanagementms.web.controllers.interfaces.IUserController;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.List;

@RestController
@RequestMapping("/user-management/v1")
public class UserController implements IUserController {

    @Override
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody User user) {
        // Call the delegate to handle the business logic
        return null;
    }

    @Override
    public ResponseEntity<UserResponse> deleteUser(String id) {
        return null;
    }

    @Override
    public ResponseEntity<UserResponse> getUserById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<List<UserResponse>> getUsersByFilters(String mobileNumber, OffsetDateTime createdAt, OffsetDateTime updatedAt, String email) {
        return null;
    }

    @Override
    public ResponseEntity<UserResponse> updateUser(String id, UserUpdate userUpdate) {
        return null;
    }
}
