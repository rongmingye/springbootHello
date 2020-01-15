package com.example.helloworld.controller;

import com.example.helloworld.common.api.ApiResponse;
import com.example.helloworld.entity.User;
import com.example.helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("login")
    public ApiResponse login(@RequestParam String username, @RequestParam String password) {

        ApiResponse apiResponse = userService.login(username, password);
        return apiResponse;
    }

    @PostMapping("add")
    public ApiResponse add(User user) {

        ApiResponse apiResponse = userService.add(user);
        return apiResponse;
    }
}
