package com.yangls.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/*import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;*/

/**
 * @description:
 * @author: yangLs
 * @create: 2020-06-12 00:20
 **/
@SpringBootApplication
@EnableEurekaClient
//@EnableEurekaClient和@EnableDiscoveryClient其实二者的功能是一样的。但是如果选用的是eureka服务器，那么就推荐@EnableEurekaClient，如果是其他的注册中心，那么推荐使用@EnableDiscoveryClient。
/*@EnableDiscoveryClient*/
public class Payment8001 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8001.class,args);
    }
}
