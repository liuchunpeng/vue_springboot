package com.example.vue_springboot.controller;

import com.example.vue_springboot.domain.User;
import com.example.vue_springboot.service.LoginSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginSerivce loginSerivce;
    @PostMapping("/login")
    public Boolean login(@RequestBody User user){
        User uesrDto = loginSerivce.getUser(user.getUserName());
        if (user.equals(uesrDto)){
            return  true;
        }
        return  false;
    }
}
