package com.study.springservicefeignconsumer.api;

import com.study.springservicefeignconsumer.service.HelloRefactorService;
import com.study.springservicefeignconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 说明：
 * 作者：hanll-a
 * 时间：2020/5/18 15:41
 */
@RestController
public class FeignConsumerController {

//    @Autowired
//    HelloService helloService;

    @Autowired
    HelloRefactorService helloRefactorService;

//    @GetMapping
//    public String helloConsumer(){
//        return helloService.hello("Feign Consumer");
//    }

    @GetMapping("refactor")
    public String helloRefactorConsumer(){
        return helloRefactorService.hello("Feign Consumer");
    }

}
