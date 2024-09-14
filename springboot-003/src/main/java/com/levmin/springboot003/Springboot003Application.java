package com.levmin.springboot003;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
//@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "${nacos.config.server-addr}"))
public class Springboot003Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot003Application.class, args);
    }

}
