package com.bei.service;

import com.bei.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    boolean batchRemoveUser(List<Integer> ids);

    int getUserNum();

    int getUserOfMan();

    boolean isExistUser(String username);

    User getUserByName(String username);

    List<User> getUserByIds(List<Integer> ids);
}
