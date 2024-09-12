package com.levmin.springmvc.service;

import com.levmin.springmvc.dao.UserDaoImpl;
import com.levmin.springmvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    private UserDaoImpl userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }
}
