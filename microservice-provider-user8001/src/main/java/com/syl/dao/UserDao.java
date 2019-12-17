package com.syl.dao;

import com.syl.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    boolean insertUser(User user);
    User queryById(Integer userId);
    List<User> list();
}
