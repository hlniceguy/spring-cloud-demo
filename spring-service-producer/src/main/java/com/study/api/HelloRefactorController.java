package com.study.api;

import com.study.service.HelloService;
import org.springframework.web.bind.annotation.RestController;

/**
 * 说明：
 * 作者：hanll-a
 * 时间：2020/5/18 18:41
 */
@RestController
public class HelloRefactorController implements HelloService {
    @Override
    public String hello(String name) {
        return "hello " + name + " from refactor producer";
    }
}
