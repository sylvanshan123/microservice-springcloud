package com.syl.service;

import com.syl.pojo.User;
import com.syl.service.fallback.UserFeignFallback;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "provider-user", fallback = UserFeignFallback.class)
public interface UserFeignService {
    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    User queryById(@PathVariable(value = "userId") Integer userId);

    @RequestMapping(value = "/user/add",method = RequestMethod.POST)
    boolean insertUser(@Param(value = "user") User user);

    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    List<User> queryAll();
}
