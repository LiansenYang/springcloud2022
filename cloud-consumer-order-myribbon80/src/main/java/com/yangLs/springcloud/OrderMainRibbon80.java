package com.yangLs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderMainRibbon80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainRibbon80.class,args);
    }
}
