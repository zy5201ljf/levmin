package com.levmin.springmvc.dao;

import com.levmin.springmvc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class UserDaoImpl {

    public List<User> findAll() {
        return Collections.singletonList(new User("zhangyue", 25));
    }
}
