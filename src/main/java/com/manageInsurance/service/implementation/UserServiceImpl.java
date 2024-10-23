package com.manageInsurance.service.implementation;

import com.manageInsurance.service.UserService;
import com.manageInsurance.entities.User;
import com.manageInsurance.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

    @Service
    public class UserServiceImpl implements UserService {

        @Autowired
        private UserRepository userRepository;

        @Override
        @Transactional
        public void register(User user) {
            if (userRepository.findByEmail(user.getEmail()) != null) {
                throw new RuntimeException("Email already in use");
            }
            userRepository.save(user);
        }
}
