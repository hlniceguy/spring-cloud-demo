package com.study.api;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.discovery.DiscoveryClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lei
 * @date 2020/4/18
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient client;

    @GetMapping
    public String index(){
        ApplicationInfoManager infoManager = client.getApplicationInfoManager();
        logger.info("/hello, host:{}, servid_id:{}", infoManager.getInfo().getIPAddr(), infoManager.getInfo().getInstanceId());
        return "hello world";
    }
}
