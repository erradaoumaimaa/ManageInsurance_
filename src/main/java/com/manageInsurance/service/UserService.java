package com.manageInsurance.service;

import com.manageInsurance.entities.User;
import com.manageInsurance.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
private EntityManager entityManager;
    @Autowired
    private UserRepository userRepository;

    public boolean testDatabaseConnection() {
        try {
            if (entityManager != null) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}