package com.study.springservicefeignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 说明：
 * 作者：hanll-a
 * 时间：2020/5/18 15:36
 */
//@FeignClient(value = "HELLO-SERVICE", fallback = HelloServiceFallback.class)
public interface HelloService {
    @GetMapping("hello")
    String hello(@RequestParam("name") String name);
}
