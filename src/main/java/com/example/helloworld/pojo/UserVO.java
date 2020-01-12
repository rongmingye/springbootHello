package com.example.helloworld.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserVO {

    private String id;

    private String username;

    private String phone;

    private String avatar;

    private Integer sex;

    private  String createTime;

    private LocalDateTime updateTime;
}
