package com.study.springservicefeignconsumer.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 说明：
 * 作者：hanll-a
 * 时间：2020/5/18 20:40
 */
@Component
public class HelloServiceFallbackFactory implements FallbackFactory<HelloRefactorService> {
    @Override
    public HelloRefactorService create(Throwable throwable) {
        return new HelloRefactorService() {
            @Override
            public String hello(String name) {
                return "error";
            }
        };
    }
}
