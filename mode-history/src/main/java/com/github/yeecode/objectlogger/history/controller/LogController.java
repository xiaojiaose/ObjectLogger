package com.github.yeecode.objectlogger.history.controller;

import com.github.yeecode.objectlogger.client.model.User;
import com.github.yeecode.objectlogger.history.business.LogBusiness;
import com.github.yeecode.objectlogger.history.form.OperationForm;
import com.github.yeecode.objectlogger.history.service.UserService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {
    @Autowired
    private LogBusiness logBusiness;

    @RequestMapping(value = "/add")
    public Map<String, Object> add(String logJsonString) {
        return logBusiness.add(logJsonString);
    }

    @RequestMapping(value = "/query")
    public Map<String, Object> query(OperationForm operationForm) {
        return logBusiness.query(operationForm);
    }

    @Autowired
    private UserService userService;

    @RequestMapping("/find")
    public List<User> findAll(){
    return userService.findAll(User.builder().username("阿毛").build());
    }

}
