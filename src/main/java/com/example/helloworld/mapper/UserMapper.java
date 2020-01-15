package com.example.helloworld.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.helloworld.entity.User;

public interface UserMapper extends BaseMapper<User> {

    User selectByUsername(String username);
}
