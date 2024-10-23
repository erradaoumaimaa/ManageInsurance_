package com.manageInsurance.repositories;

import com.manageInsurance.entities.User;

import java.util.List;

public interface UserRepository {
    void save(User user);
    User findById(Long id);
    List<User> findAll();
    void delete(User user);
    User findByEmail(String email);
}
