package com.study.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 说明：
 * 作者：hanll-a
 * 时间：2020/5/18 17:45
 */
@RequestMapping("/refactor")
public interface HelloService {
    @GetMapping("hello")
    String hello(@RequestParam("name") String name);
}
