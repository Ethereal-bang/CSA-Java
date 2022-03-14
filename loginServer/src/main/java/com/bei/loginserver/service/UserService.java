package com.bei.loginserver.service;

import com.bei.loginserver.pojo.User;

public interface UserService {

    boolean register(User user);

    boolean login(String account, String pwd);

    boolean isUserExists(String account);
}
