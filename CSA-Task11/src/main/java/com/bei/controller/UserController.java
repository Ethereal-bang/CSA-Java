package com.bei.controller;

import com.bei.pojo.User;
import com.bei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    // 批量删除用户
    @GetMapping("/deleteUsers")
    public boolean batchRemoveUser(List<Integer> ids) {
        return userService.batchRemoveUser(ids);
    }


    // 获取总用户数
    @GetMapping("/getUserNum")
    public int getUserNum() {
        return userService.getUserNum();
    }

    // 获取男性用户数
    @GetMapping("/getManNum")
    public int getUserOfMan() {
        return userService.getUserOfMan();
    }

    // 用户名是否存在
    @GetMapping("/isExistUser")
    public boolean isExistUser(String username) {
        return userService.isExistUser(username);
    }

    // 用户名查询用户
    @GetMapping("/getUserByName")
    public User getUserByName(String username) {
        return userService.getUserByName(username);
    }

    // 根据ids批量查询用户
    @GetMapping("/getUserByIds")
    public List<User> getUserByIds(List<Integer> ids) {
        return userService.getUserByIds(ids);
    }
}
