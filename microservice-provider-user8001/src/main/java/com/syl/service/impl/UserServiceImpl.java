package com.syl.service.impl;

import com.syl.dao.UserDao;
import com.syl.pojo.User;
import com.syl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public boolean insertUser(User user) {
        return userDao.insertUser(user);
    }

    public User queryById(Integer userId) {
        return userDao.queryById(userId);
    }

    public List<User> list() {
        return userDao.list();
    }
}
