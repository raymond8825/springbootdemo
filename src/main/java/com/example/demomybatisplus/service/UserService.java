package com.example.demomybatisplus.service;

import com.example.demomybatisplus.domain.User;
import com.example.demomybatisplus.mapper.UserMapper;
import jdk.nashorn.internal.runtime.JSONFunctions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class UserService {
    @Resource
    UserMapper userMapper;

    public List<User> selectUsers(){
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            log.info(user.toString());
        }
        return users;
    }
}
