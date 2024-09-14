package com.levmin.springboot003.config;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;

import java.util.Properties;

public class NacosConfig {

    public static void main(String[] args) {

//        String nacosConfig = getNacosConfig("http://192.168.119.129:8848/nacos", "nacostest", "DEFAULT_GROUP");
//        System.out.println("nacos连接配置响应信息：" + nacosConfig);

        String status = publishConfig("http://192.168.119.129:8848/nacos", "nacostest", "DEFAULT_GROUP", "你好！nacos");
        System.out.println("发布状态" + status);
    }

    public static String getNacosConfig(String serverAddr, String dataId, String group) {
        try {
            Properties properties = new Properties();
            properties.put("serverAddr", serverAddr);
            ConfigService configService = NacosFactory.createConfigService(properties);
            String config = configService.getConfig(dataId, group, 5000);
            return config;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }


    public static String publishConfig(String serverAddr, String dataId, String group, String content) {
        try {
            Properties properties = new Properties();
            properties.put("serverAddr", serverAddr);
            ConfigService configService = NacosFactory.createConfigService(properties);
            boolean b = configService.publishConfig(dataId, group, content);
            return "publish success!!";
        } catch (Exception e) {
            e.printStackTrace();
            return "publish fail!!";
        }
    }
}
