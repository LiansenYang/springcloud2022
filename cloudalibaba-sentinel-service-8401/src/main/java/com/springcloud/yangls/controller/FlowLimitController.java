package com.springcloud.yangls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: yangLs
 * @create: 2021-05-09 23:04
 **/
@RestController
public class FlowLimitController {
    @GetMapping("testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("testB")
    public String testB() {
        return "------testB";
    }
}
