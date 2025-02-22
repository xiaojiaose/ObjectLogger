package com.github.yeecode.objectlogger.history.dao;

import com.github.yeecode.objectlogger.client.model.User;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author mengdewei@danke.com
 * @date 2022/9/30
 */
@Mapper
@Repository
public interface UserMapper {
    List<User> findAll(@Param("user") User user);
    int addUser(@Param("user") User user);
}
