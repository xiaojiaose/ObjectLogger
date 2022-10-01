package com.github.yeecode.objectlogger.client.model;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

/**
 * @author mengdewei@danke.com
 * @date 2022/9/30
 */
@Data
@Builder
public class User implements Serializable {
    private Long id;//编号
    private String username;//用户名
    private String password;//密码
    //省略get set方法
}