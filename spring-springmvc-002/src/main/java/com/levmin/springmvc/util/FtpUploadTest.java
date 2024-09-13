package com.levmin.springmvc.util;

public class FtpUploadTest {
    public static void main(String[] args) {
        FtpUtil ftpUtil = new FtpUtil();
        String s = ftpUtil.uploadFile("192.168.119.129", 21, "admin", "root");
        System.out.println(s);
    }
}
