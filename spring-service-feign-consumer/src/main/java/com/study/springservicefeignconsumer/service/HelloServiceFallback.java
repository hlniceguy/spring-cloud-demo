package com.study.springservicefeignconsumer.service;

import com.study.service.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 说明：
 * 作者：hanll-a
 * 时间：2020/5/18 19:40
 */
//@RequestMapping("/other")
//@Component
public class HelloServiceFallback implements HelloRefactorService {
    @Override
    public String hello(String name) {
        return "error";
    }
}
