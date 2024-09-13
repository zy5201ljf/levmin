package com.levmin.springmvc.util;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FtpUtil {
    public String uploadFile(String url,int port,String user,String password){
        FTPClient ftpClient = new FTPClient();
        try {
            //连接到服务器
            ftpClient.connect(url,port);
            //登录
            ftpClient.login(user,password);
            int reply = ftpClient.getReply();
            if (!FTPReply.isPositiveCompletion(reply)) {
                System.out.println("登录失败，服务器拒绝连接");
                return "fail";
            }
            // 设置为二进制文件类型
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            ftpClient.changeWorkingDirectory("/temp/");
            File file = new File("C:/Users/Administrator/Desktop/aaa.txt");

            String uploadFileName = "bbb.txt";
            InputStream fileInputStream = new FileInputStream(file);
            System.out.println("开始上传文件");
            boolean done = ftpClient.storeFile(uploadFileName, fileInputStream);
            if (done) {
                System.out.println("文件上传成功！");
            } else {
                System.out.println("文件上传失败！");
            }
            // 退出登录并断开连接
            ftpClient.logout();

            return "success";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }
}
