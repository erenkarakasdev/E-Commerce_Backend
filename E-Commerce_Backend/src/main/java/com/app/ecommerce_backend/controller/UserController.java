package com.app.ecommerce_backend.controller;

import com.app.ecommerce_backend.dto.CreateUserRequest;
import com.app.ecommerce_backend.entities.User;
import com.app.ecommerce_backend.repository.UserRepository;
import com.app.ecommerce_backend.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {

    private  final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/register")
    public User addUser(@RequestBody CreateUserRequest request) {
        return userService.createUser(request);
    }
}
