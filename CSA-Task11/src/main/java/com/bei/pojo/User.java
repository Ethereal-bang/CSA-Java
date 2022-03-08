package com.bei.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String username;
    private String password;
    private Integer sex;
    private String phone_num;
    private String email;
    private Data birth;
    private String introduction;
    private String location;
    private String avator;
    private Data create_time;
    private Data update_time;

}
