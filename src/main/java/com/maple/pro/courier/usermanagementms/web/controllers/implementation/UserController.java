package com.maple.pro.courier.usermanagementms.web.controllers.implementation;

import com.maple.pro.courier.usermanagementms.core.models.dto.User;
import com.maple.pro.courier.usermanagementms.core.models.dto.UserResponse;
import com.maple.pro.courier.usermanagementms.core.models.dto.UserUpdate;
import com.maple.pro.courier.usermanagementms.core.services.interfaces.ICreateUserApplicationService;
import com.maple.pro.courier.usermanagementms.web.controllers.interfaces.IUserController;
import jakarta.validation.Valid;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.List;

@RestController
@RequestMapping("/user-management/v1")
@NoArgsConstructor
public class UserController implements IUserController {

    @Autowired
    private ICreateUserApplicationService createUserApplicationService;
    @Override
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody User user) {
        // Call the delegate to handle the business logic
        UserResponse response = createUserApplicationService.createUser(user);
        return new ResponseEntity<>(response, HttpStatus.CREATED);

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
