package com.example.helloworld;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@MapperScan("com.example.helloworld.mapper")
@SpringBootApplication
public class ProjectHelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectHelloworldApplication.class, args);
    }

}
