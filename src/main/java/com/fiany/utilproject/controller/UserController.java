package com.fiany.utilproject.controller;

import com.fiany.utilproject.Bean.UserBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("get")
    public UserBean get(){
        UserBean user = new UserBean();
        user.setUserId("1");
        user.setUsername("笑傲红");
        user.setPassword("abc");
        return user;
    }
}
