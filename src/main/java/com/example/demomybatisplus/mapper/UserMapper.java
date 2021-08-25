package com.example.demomybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demomybatisplus.domain.User;
import org.springframework.stereotype.Repository;

// 在对应的Mapper上面实现基本的接口 BaseMapper
@Repository // 持久层
public interface UserMapper extends BaseMapper<User> {
    // 所有的CRUD操作已经编写完成
    // 不需要像以前的配置一大堆文件
}