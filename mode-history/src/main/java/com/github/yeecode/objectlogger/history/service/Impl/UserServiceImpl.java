package com.github.yeecode.objectlogger.history.service.Impl;

import com.github.yeecode.objectlogger.client.model.User;
import com.github.yeecode.objectlogger.history.dao.UserMapper;
import com.github.yeecode.objectlogger.history.service.UserService;

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
  public List<User> findAll(User user) {
    return userMapper.findAll(user);
  }

  @Override
  public int addUser(User user) {
    return userMapper.addUser(user);
  }
}
