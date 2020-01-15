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
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public ApiResponse login(String username, String password) {

        UserVO userVO = new UserVO();

        User dbuser = getUserByUsername(username);

        if(dbuser == null) {
            return ApiResponse.failure("用户不存在");

        } else if(dbuser.getPassword().equals(password)) {
            ObjectUtils.copyNotNullProperties(dbuser, userVO);
            return ApiResponse.successWithData(userVO);

        } else {
            return ApiResponse.failure("密码错误！");
        }
    }

    @Override
    public ApiResponse add(User user) {
        User dbuser = getUserByUsername(user.getUsername());

        if(dbuser != null) {
            return ApiResponse.failure("用户名已存在");
        }

        this.save(user);

        return ApiResponse.successWithData(user);
    }

    @Override
    public User getUserByUsername(String username) {
        if(StringUtils.isEmpty(username)) {
            return null;
        }

        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("username", username);
        return userMapper.selectOne(userQueryWrapper);
    }
}
