package com.levmin.springmvc.entity;

import lombok.Data;

@Data
public class Student extends Teacher{
    /**
     * user's name.
     */
    private String name;

    /**
     * user's age.
     */
    public int age;

//    protected String password;
}
