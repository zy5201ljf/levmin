package com.levmin.springmvc.tests;

import java.lang.reflect.Field;

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.levmin.springmvc.entity.Student");
            Field[] column =
                    clazz.getDeclaredFields();

//            反射中getField()方法只能活动public修饰的字段，同时可以获取继承的类的字段，getDeclaredFields()可以获取private修饰的字段，只能获取当前类的字段名，不能获取
//            继承的类的字段名
            Field age = clazz.getField("age");
//            Field name = clazz.getField("name");
            Field teacherName = clazz.getField("teacherName");
//            String name = age.getName();
            System.out.println(age.getName());
//            System.out.println(name.getName());
            System.out.println(teacherName.getName());

            for (Field field : column) {
                System.out.println(field.getName());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
