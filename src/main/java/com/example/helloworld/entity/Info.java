package com.example.helloworld.entity;


import lombok.Data;

// 实体类

@Data
public class Info {

    /**
     * 标题
     */
    private String name;


    /**
     * 内容
     */
    private String content;
}
