package com.maple.pro.courier.usermanagementms.core.services.implementation;

import com.maple.pro.courier.usermanagementms.core.services.interfaces.IDeleteUserApplicationService;
import com.maple.pro.courier.usermanagementms.integration.persistence.UserRepository;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@Slf4j
public class DeleteUserApplicationService implements IDeleteUserApplicationService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public void deleteUser(String userId) {
        log.info("Enter DeleteUserApplicationService.deleteUser");

        userRepository.deleteById(userId);

        log.info("Exit DeleteUserApplicationService.deleteUser");
    }
}
