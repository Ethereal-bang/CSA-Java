package com.bei.loginserver.mapper;

import com.bei.loginserver.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    // 添加用户
    int addUser(User user);

    // 查询该用户是否存在
    int isUserExists(String account);

    // 返回该用户密码
    String getUser(String account);

}
