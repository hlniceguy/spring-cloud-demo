package com.study.api;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lei
 * @date 2020/4/18
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

//    @Qualifier("eurekaClient")
//    @Autowired
//    private EurekaClient discoveryClient;
//
//    @GetMapping
//    public String index(){
//        ApplicationInfoManager infoManager = discoveryClient.getApplicationInfoManager();
//        logger.info("/hello, host:{}, servid_id:{}", infoManager.getInfo().getIPAddr(), infoManager.getInfo().getInstanceId());
//        return "hello world";
//    }

    @GetMapping("/hello")
    public String hello(String name){
        return "hello " + name + " from producer";
    }

    @GetMapping("/test1")
    public String testQuery(@RequestParam String name, @RequestParam String age){
        return "hello " + name + " age " + age;
    }

    @GetMapping("/test2")
    public String testBody(@RequestBody HelloReq helloReq){
        return "hello " + helloReq.getName() + " age " + helloReq.getAge();
    }

    @GetMapping("/test3")
    public String test3(HelloReq helloReq){
        return "hello " + helloReq.getName() + " age " + helloReq.getAge();
    }
}
