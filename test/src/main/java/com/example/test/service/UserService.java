package com.example.test.service;

import com.example.test.pojo.User;
import java.util.List;

public interface UserService {
    List<User> findAll(Integer num);

}
