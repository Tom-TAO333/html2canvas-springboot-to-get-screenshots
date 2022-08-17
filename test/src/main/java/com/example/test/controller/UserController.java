package com.example.test.controller;

import com.example.test.pojo.User;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    @CrossOrigin
    public List<User> findAll(Integer num){
        return userService.findAll(num);
    }
}
