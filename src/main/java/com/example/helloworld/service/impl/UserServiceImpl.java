package com.example.helloworld.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.helloworld.common.api.ApiResponse;
import com.example.helloworld.common.utils.ObjectUtils;
import com.example.helloworld.entity.User;
import com.example.helloworld.mapper.UserMapper;
import com.example.helloworld.pojo.UserVO;
import com.example.helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public ApiResponse login(String username, String password) {

        ApiResponse apiResponse = new ApiResponse();
        UserVO userVO = new UserVO();

        User user = userMapper.selectByIUsername(username);

        if(user.getPassword().equals(password)) {
            ObjectUtils.copyNotNullProperties(user, userVO);
            apiResponse.success("登录成功！");
            apiResponse.setData(userVO);
        } else {
            apiResponse.failure("密码错误！");
        }

        return apiResponse;
    }
}
