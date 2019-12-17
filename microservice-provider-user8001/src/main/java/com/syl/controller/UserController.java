package com.syl.controller;

import com.syl.pojo.User;
import com.syl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User queryById(@PathVariable(value = "id") Integer userId){
        return userService.queryById(userId);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public boolean insertUser(User user){
        return userService.insertUser(user);
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<User> queryAll(){
        return userService.list();
    }
}
