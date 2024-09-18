package com.levmin.springbootshiro.service.impl;


import com.levmin.springbootshiro.dao.UserInfoDao;
import com.levmin.springbootshiro.entity.UserInfo;
import com.levmin.springbootshiro.service.UserInfoService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}