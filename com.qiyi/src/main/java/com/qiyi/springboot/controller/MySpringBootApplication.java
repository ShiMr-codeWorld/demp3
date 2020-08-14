package com.qiyi.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //这是一个注解类，启动此类就可以启动SpringBoot
public class MySpringBootApplication {
    public static void main(String[] args) {
        //启动SpringBoot,并且初始化相关组件
        SpringApplication.run(MySpringBootApplication.class);
    }
}  
