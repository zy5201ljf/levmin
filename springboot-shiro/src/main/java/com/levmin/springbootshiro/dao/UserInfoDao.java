package com.levmin.springbootshiro.dao;

import com.levmin.springbootshiro.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoDao extends CrudRepository<UserInfo, Long> {
    /**
     * 通过username查找用户信息;
     */
    public UserInfo findByUsername(String username);
}