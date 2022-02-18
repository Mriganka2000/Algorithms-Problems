package com.example.employeeapp.resource;

import com.example.employeeapp.exception.ExceptionHandling;
import com.example.employeeapp.exception.domain.EmailNotFoundException;
import com.example.employeeapp.exception.domain.UserNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = { "/", "/user"})
public class UserResource extends ExceptionHandling {

    @GetMapping(value = "/home")
    public String showUser() throws UserNotFoundException {
//        return "Hello World";
        throw new UserNotFoundException("The user is not exists.");
    }
}
