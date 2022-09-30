package com.example.history.controller;

import com.example.history.entity.User;
import com.example.history.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mengdewei@danke.com
 * @date 2022/9/30
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/addUser")
    public String addUser(){

        userService.addUser(User.builder().username("阿毛").password("123456").build());
        return "添加成功";

    }
}