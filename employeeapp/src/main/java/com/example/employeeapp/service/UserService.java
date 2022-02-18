package com.example.employeeapp.service;

import com.example.employeeapp.domain.User;
import com.example.employeeapp.exception.domain.EmailExistException;
import com.example.employeeapp.exception.domain.UserNotFoundException;
import com.example.employeeapp.exception.domain.UsernameExistException;

import javax.mail.MessagingException;
import java.util.List;

public interface UserService {

    User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, UsernameExistException, EmailExistException, MessagingException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);

}
