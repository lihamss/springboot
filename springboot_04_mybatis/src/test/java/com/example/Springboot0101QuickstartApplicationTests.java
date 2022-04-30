package com.example;

import com.example.dao.UserDao;
import com.example.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot0101QuickstartApplicationTests {

    @Autowired
    private UserDao userDao;
    @Test
    void contextLoads() {
        User user = userDao.findUserById(1);
        System.out.println(user);
    }

}
