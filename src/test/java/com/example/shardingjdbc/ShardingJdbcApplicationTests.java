package com.example.shardingjdbc;

import com.example.shardingjdbc.entity.User;
import com.example.shardingjdbc.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingJdbcApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(ShardingJdbcApplicationTests.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    void testAddUser() {

        for (int i = 0; i < 10; i++) {
            userMapper.insert(
                    new User()//.setId((long) i)
                    .setUserName("name" + i)
                    .setUserType("type" + i)
                    .setGender(i % 2 == 0 ? "0" : "1")
            );
        }

        logger.info("insert successful");

    }

}
