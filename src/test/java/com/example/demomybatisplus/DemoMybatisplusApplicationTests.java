package com.example.demomybatisplus;

import com.example.demomybatisplus.domain.User;
import com.example.demomybatisplus.mapper.UserMapper;
import com.example.demomybatisplus.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@Slf4j
class DemoMybatisplusApplicationTests {
    @Resource
    UserService userService;
    @Resource
    UserMapper userMapper;

    @Test
    void contextLoads() {
      log.info("lll");
    }
    @Test
    void test(){
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            log.info(user.toString());
        }
    }

}
