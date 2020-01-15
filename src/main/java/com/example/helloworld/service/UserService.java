package com.example.helloworld.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.helloworld.common.api.ApiResponse;
import com.example.helloworld.entity.User;

public interface UserService extends IService<User> {

    public ApiResponse login(String username, String password);

    public ApiResponse add(User user);

    public User getUserByUsername(String username);
}
