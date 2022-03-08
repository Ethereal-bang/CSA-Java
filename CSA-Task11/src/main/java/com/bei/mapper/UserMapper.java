package com.bei.mapper;

import com.bei.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    /**
     * 批量删除
     * @param ids
     * @return
     */
    boolean batchRemoveUser(List<Integer> ids);

    int getUserNum();

    int getManNum();

    boolean isExists(String username);

    User getUserByName(String username);

    List<User> getUserByIds(List<Integer> ids);
}

