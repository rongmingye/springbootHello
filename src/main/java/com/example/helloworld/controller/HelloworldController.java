package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloworldController {

    @RequestMapping("hello")
    public String hello() {
        return "hello world";
    }

}
