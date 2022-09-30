package com.example.history.service.Impl;

import com.example.history.entity.User;
import com.example.history.mapper.UserMapper;
import com.example.history.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mengdewei@danke.com
 * @date 2022/9/30
 */
@Service("userService")
class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;

  @Override
  public List<User> findAll() {
    return userMapper.findAll();
  }

  @Override
  public int addUser(User user) {
    return userMapper.addUser(user);
  }
}
