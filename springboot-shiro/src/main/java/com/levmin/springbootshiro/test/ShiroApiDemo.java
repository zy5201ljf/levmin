package com.levmin.springbootshiro.test;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

@Slf4j
public class ShiroApiDemo {
    public static void main(String[] args) {
        //获取当前执行的主体
//        SecurityManager securityManager = SecurityUtils.getSecurityManager();
        DefaultSecurityManager securityManager = new DefaultSecurityManager();
        SecurityUtils.setSecurityManager(securityManager);


        Subject subject = SecurityUtils.getSubject();


        Session session = subject.getSession();
        session.setAttribute("say to shiro", "hello shiro!");
        if (!subject.isAuthenticated()) {

            UsernamePasswordToken token = new UsernamePasswordToken("zhangsan", "123");
            token.setRememberMe(true);
            subject.login(token);
        }

        //print their identifying principal (in this case, a username):
        log.info("User [" + subject.getPrincipal() + "] logged in successfully.");

        if (subject.hasRole("schwartz")) {
            log.info("May the Schwartz be with you!");
        } else {
            log.info("Hello, mere mortal.");
        }
        if (subject.isPermitted("lightsaber:wield")) {
            log.info("You may use a lightsaber ring.  Use it wisely.");
        } else {
            log.info("Sorry, lightsaber rings are for schwartz masters only.");
        }

        if (subject.isPermitted("winnebago:drive:eagle5")) {
            log.info("You are permitted to 'drive' the 'winnebago' with license plate (id) 'eagle5'.  " +
                    "Here are the keys - have fun!");
        } else {
            log.info("Sorry, you aren't allowed to drive the 'eagle5' winnebago!");
        }

        subject.logout();

    }
}
