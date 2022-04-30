package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String getById(){
        System.out.println("springboot222 is running...");
        return "springboot222 is running...";
    }
}
