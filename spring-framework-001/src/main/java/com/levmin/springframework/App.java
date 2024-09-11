package com.levmin.springframework;

import com.levmin.springframework.service.AopDemoServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


    /**
     * ioc 配置的三种方式 xml配置，Java配置，注解配置
     * DI 依赖注入的三种方式，setter方法注入，构造函数注入，注解注入
     *
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aspect.xml", "daos.xml", "service.xml");
        AopDemoServiceImpl aopDemoService = context.getBean("aopDemoService", AopDemoServiceImpl.class);

        aopDemoService.doMethod1();
        aopDemoService.doMethod2();
        try {
            aopDemoService.doMethod3();
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }
//        all.forEach(user -> System.out.println(user.getName()+","+user.getAge()));

    }
}
