package com.maple.pro.courier.usermanagementms.web.controllers.implementation;

import com.maple.pro.courier.usermanagementms.core.models.dto.User;
import com.maple.pro.courier.usermanagementms.core.models.dto.UserResponse;
import com.maple.pro.courier.usermanagementms.core.models.dto.UserUpdate;
import com.maple.pro.courier.usermanagementms.core.services.interfaces.*;
import com.maple.pro.courier.usermanagementms.web.controllers.interfaces.IUserController;
import jakarta.validation.Valid;
import lombok.NoArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user-management/v1")
@NoArgsConstructor
public class UserController implements IUserController {

    @Autowired
    private ICreateUserApplicationService createUserApplicationService;

    @Autowired
    private IGetUserApplicationService getUserApplicationService;

    @Autowired
    private IDeleteUserApplicationService deleteUserApplicationService;

    @Autowired
    private IGetUsersByFiltersApplicationService getUsersByFiltersApplicationService;

    @Autowired
    private IUpdateUserApplicationService updateUserApplicationService;

    @Override
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody User user) {
        UserResponse response = createUserApplicationService.createUser(user);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<String> deleteUser(String id) {
        try{
            deleteUserApplicationService.deleteUser(id);
        }catch (Exception e){
            return new ResponseEntity<>("Unable to Delete user with id" + id + " StackTrace: " + Arrays.toString(e.getStackTrace()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("User with User Id : " + id + "deleted Successfully.", HttpStatus.NO_CONTENT);

    }

    @Override
    public ResponseEntity<UserResponse> getUserById(String id) {
        UserResponse response = getUserApplicationService.getUser(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<UserResponse>> getUsersByFilters(String mobileNumber, OffsetDateTime createdAt, OffsetDateTime updatedAt, String email) {
        List<UserResponse> responseList= getUsersByFiltersApplicationService.getUserByFilters(mobileNumber,createdAt, updatedAt, email);
        return new ResponseEntity<>(responseList, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserResponse> updateUser(String id, UserUpdate userUpdate) {
        UserResponse  response = updateUserApplicationService.updateUser(id, userUpdate);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
