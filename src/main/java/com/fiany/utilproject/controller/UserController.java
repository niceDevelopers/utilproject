package com.fiany.utilproject.controller;

import com.fiany.utilproject.bean.UserBean;
import com.fiany.utilproject.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("get")
    public List<UserBean> get(){
        List<UserBean> list = userMapper.getAll();
        return list;
    }
}
