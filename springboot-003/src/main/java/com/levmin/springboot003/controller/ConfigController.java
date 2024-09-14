package com.levmin.springboot003.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/nacos/config")
public class ConfigController {

    @NacosValue(value = "${useLocalCache}", autoRefreshed = true)
    private boolean useLocalCache;

//    @NacosValue(value = "${localCache}", autoRefreshed = true)
//    private boolean localCache;

    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
//    @GetMapping("/get")
    public boolean get() {
        return useLocalCache;
    }


//    @RequestMapping(value = "/getConfig", method = GET)
//    @ResponseBody
//    public boolean getConfig() {
//        return useLocalCache;
//    }

}
