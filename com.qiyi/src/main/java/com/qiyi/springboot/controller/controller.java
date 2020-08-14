package com.qiyi.springboot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
    @RequestMapping("/")//映射到out地址
    public String index(){
        //访问index.html文件
        return  "idx";
    }
}
