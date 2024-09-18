package com.levmin.springbootshiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * shiro的4个重要特性
 * 1、身份验证-验证身份，常用于登录
 * 2、授权-访问控制  对于某些接口做访问权限
 * 3、密码-保护隐藏数据
 * 4、会话管理-token
 */
@SpringBootApplication
public class SpringbootShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShiroApplication.class, args);
    }

}
