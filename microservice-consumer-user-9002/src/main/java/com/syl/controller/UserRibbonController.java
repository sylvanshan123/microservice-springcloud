package com.syl.controller;

import com.syl.pojo.User;
import com.syl.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/userConsumer")
public class UserRibbonController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    UserFeignService userFeignService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List queryAll(){
        return userFeignService.queryAll();
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public User queryById(@PathVariable(value = "userId") Integer userId){
        return userFeignService.queryById(userId);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean insertUser(User user){
        return userFeignService.insertUser(user);
    }
}
