package com.syl.service.fallback;

import com.syl.pojo.User;
import com.syl.service.UserFeignService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserFeignFallback implements UserFeignService {
    @Override
    public User queryById(Integer userId) {
        return new User("此用户不存在!",0,"null");
    }

    @Override
    public boolean insertUser(User user) {
        return false;
    }

    @Override
    public List<User> queryAll() {
        return new ArrayList<User>();
    }
}
