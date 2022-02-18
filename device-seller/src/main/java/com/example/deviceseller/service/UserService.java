package com.example.deviceseller.service;

import com.example.deviceseller.model.Role;
import com.example.deviceseller.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
