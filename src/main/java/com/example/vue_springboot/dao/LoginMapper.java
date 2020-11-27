package com.example.vue_springboot.dao;

import com.example.vue_springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface LoginMapper {
    User selectUserByUserName(@Param("userName")String userName);
}
