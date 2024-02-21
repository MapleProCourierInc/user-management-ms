package com.maple.pro.courier.usermanagementms.core.services.implementation;

import com.maple.pro.courier.usermanagementms.core.services.interfaces.IDeleteUserApplicationService;
import com.maple.pro.courier.usermanagementms.integration.persistence.UserRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class DeleteUserApplicationService implements IDeleteUserApplicationService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
}
