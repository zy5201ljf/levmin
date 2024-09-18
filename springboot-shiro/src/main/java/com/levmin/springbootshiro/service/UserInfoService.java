package com.levmin.springbootshiro.service;


import com.levmin.springbootshiro.entity.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}