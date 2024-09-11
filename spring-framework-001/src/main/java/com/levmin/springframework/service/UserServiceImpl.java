package com.levmin.springframework.service;

import com.levmin.springframework.dao.UserDaoImpl;
import com.levmin.springframework.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl {
    @Autowired
    private UserDaoImpl userDao;
    public UserServiceImpl() {

    }

    public List<User> findAll() {
        return this.userDao.findAll();
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}
