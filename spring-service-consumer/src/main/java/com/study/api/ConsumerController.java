package com.study.api;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lei
 * @date 2020/4/18
 */
@RestController
public class ConsumerController {
    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient discoveryClient;

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

    // 服务名字
    public static final String SERVICE_HELLO_BASE_URL = "http://hello-service";

    @HystrixCommand(fallbackMethod = "helloFallback")
    @GetMapping
    public String index(){
        return restTemplate.getForEntity(SERVICE_HELLO_BASE_URL, String.class).getBody();
    }

    public String helloFallback(){
        return "hello fallback";
    }
}
