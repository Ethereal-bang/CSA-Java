package com.bei;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class CsaTask11ApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        /*测试是否连接成功*/
        // 获得连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        // 关闭连接
        connection.close();
    }

}
