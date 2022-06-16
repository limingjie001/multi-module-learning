package com.example.datasource;

import com.example.datasource.generator.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DataSourceApplicationTests {
    @Resource
    UserService userService;

    @Test
    void contextLoads() {
        System.out.println(userService.list());
    }

}
