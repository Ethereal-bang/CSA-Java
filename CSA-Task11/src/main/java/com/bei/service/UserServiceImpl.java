package com.bei.service;

import com.bei.mapper.UserMapper;
import com.bei.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public boolean batchRemoveUser(List<Integer> ids) {
        return userMapper.batchRemoveUser(ids);
    }

    @Override
    public int getUserNum() {
        return userMapper.getUserNum();
    }

    @Override
    public int getUserOfMan() {
        return userMapper.getManNum();
    }

    @Override
    public boolean isExistUser(String username) {
        return userMapper.isExists(username);
    }

    @Override
    public User getUserByName(String username) {
        return null;
    }

    @Override
    public List<User> getUserByIds(List<Integer> ids) {
        return null;
    }
}
