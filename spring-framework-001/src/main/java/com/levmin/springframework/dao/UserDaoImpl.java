package com.levmin.springframework.dao;

import com.levmin.springframework.pojo.User;

import java.util.Collections;
import java.util.List;

public class UserDaoImpl {

    public UserDaoImpl() {

    }

    public List<User> findAll() {
        return Collections.singletonList(new User("zhangyue", 25));
    }
}
