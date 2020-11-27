package com.example.vue_springboot.service;

import com.example.vue_springboot.domain.User;

public interface LoginSerivce {
    public User getUser(String username);
}
