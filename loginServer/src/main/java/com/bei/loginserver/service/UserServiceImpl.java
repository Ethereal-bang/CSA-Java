package com.bei.loginserver.service;

import com.bei.loginserver.mapper.UserMapper;
import com.bei.loginserver.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override   // 注册
    public boolean register(User user) {
        return userMapper.addUser(user) == 1;
    }

    @Override   // 登录——验证密码
    public boolean login(String account, String pwd) {
        return (Objects.equals(userMapper.getUser(account), pwd));
    }

    @Override
    public boolean isUserExists(String account) {
        return (userMapper.isUserExists(account) == 1);
    }
}
