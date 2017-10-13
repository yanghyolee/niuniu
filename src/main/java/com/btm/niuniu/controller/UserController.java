package com.btm.niuniu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.btm.niuniu.domain.User;
import com.btm.niuniu.mapper.UserMapper;


import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController implements Serializable{

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "getUserByUserName", method = RequestMethod.POST)
    public List<User> getUserByUserName(@RequestParam(name = "userName", required = false) String userName) {
        List<User> data = userMapper.getUserByUserName(userName);
        return data;
    }

    @RequestMapping(value = "listAllUser", method = RequestMethod.POST)
    List<User> listAllUser() {
        List<User> data = userMapper.listAllUser();
        return data;
    }

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    int addUser(@RequestBody User user) {
        int data = userMapper.addUser(user);

        return data;
    }
}
