package com.syl.service;

import com.syl.pojo.User;

import java.util.List;

public interface UserService {
    boolean insertUser(User user);
    User queryById(Integer userId);
    List<User> list();
}
