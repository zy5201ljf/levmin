package com.levmin.springframework.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamDemo {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Administrator\\Desktop\\aaa.txt");
            File fileOut = new File("C:\\Users\\Administrator\\Desktop\\bbb.txt");

            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(fileOut);

            int byteData;
            System.out.println("开始写入数据！！！");
            while ((byteData = fileInputStream.read())!= -1){
                fileOutputStream.write(byteData);
            }
            System.out.println("写入数据完毕！！！");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
