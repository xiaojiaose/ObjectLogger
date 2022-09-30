package com.example.history.service;

import com.example.history.entity.User;

import java.util.List;

/**
 * @author mengdewei@danke.com
 * @date 2022/9/30
 */
public interface UserService {
    List<User> findAll();
    int addUser(User user);
}