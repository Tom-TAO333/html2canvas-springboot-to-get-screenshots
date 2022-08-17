package com.example.test.serviceImpl;

import com.example.test.mapper.UserMapper;
import com.example.test.pojo.User;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll(Integer num){
        return userMapper.findAll(num);
    }

}
