package com.kuang.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author starsea
 * @create 2020-11-24 16:30
 */
@RestController
public class UserController {

    @RequestMapping("/getUser")
    public String getUser(){
        return "Hello world";
    }
}
