package com.example.vue_springboot.service;

import com.example.vue_springboot.domain.User;
import com.example.vue_springboot.dao.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginSerivceImpl implements LoginSerivce {

    @Autowired
    public LoginMapper loginMapper;

    @Override
    public User getUser(String username) {
        User user = loginMapper.selectUserByUserName(username);
        return user;
    }
}
