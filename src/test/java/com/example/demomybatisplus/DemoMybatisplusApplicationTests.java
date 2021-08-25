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
    @Test
    void insertTest() {
        User user = new User();
        user.setName("小明");
        user.setAge(1);
        user.setEmail("xh@163.com");

        int insert = userMapper.insert(user); // 自动生成了id
        System.out.println("insert = " + insert); // 受影响的行数
        System.out.println("user = " + user);
    }
    @Test
    void updateTest() {
        User user = new User();
        user.setId(5L);
        user.setName("John");

        // 传入一个对象进行更新
        int i = userMapper.updateById(user);
        System.out.println("i = " + i);
    }

}
