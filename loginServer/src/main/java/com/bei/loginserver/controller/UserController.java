package com.bei.loginserver.controller;

import com.bei.loginserver.common.JsonResult;
import com.bei.loginserver.pojo.User;
import com.bei.loginserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/register")
    public JsonResult<String> register(User user) {
        if (userService.isUserExists(user.getAccount())) {
            // 账号已存在，登录
//            报错：return new UserController().login(user.getAccount(), user.getPwd());
            if (userService.login(user.getAccount(), user.getPwd())) {
                return new JsonResult<String>(true, "登录成功");
            } else {
                return new JsonResult<String>("密码错误");
            }
        }
        userService.register(user);
        return new JsonResult<String>(true, "注册成功");
    }

//    @GetMapping("/login")
    public JsonResult<String> login(String account, String pwd) {
        if (userService.login(account, pwd)) {
            return new JsonResult<>(true, "登录成功");
        } else {
            return new JsonResult<>("密码错误");
        }
    }
}
