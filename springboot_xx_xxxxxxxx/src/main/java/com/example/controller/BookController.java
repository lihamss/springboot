package com.example.controller;

import org.springframework.web.bind.annotation.*;

//Rest模式
@RestController

public class BookController {

    @RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id){
        System.out.println(id);
        return String.valueOf(id);
    }
}
