package com.study.springservicefeignconsumer.service;

import com.study.service.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 说明：
 * 作者：hanll-a
 * 时间：2020/5/18 19:00
 */
@FeignClient(value = "HELLO-SERVICE", fallbackFactory = HelloServiceFallbackFactory.class)
public interface HelloRefactorService extends HelloService {


}
