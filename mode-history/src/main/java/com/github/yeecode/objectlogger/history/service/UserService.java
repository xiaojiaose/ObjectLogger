package com.github.yeecode.objectlogger.history.service;


import com.github.yeecode.objectlogger.client.model.User;

import java.util.List;

/**
 * @author mengdewei@danke.com
 * @date 2022/9/30
 */
public interface UserService {
    List<User> findAll(User user);
    int addUser(User user);
}