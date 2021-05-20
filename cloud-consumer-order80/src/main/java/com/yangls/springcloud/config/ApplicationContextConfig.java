package com.yangls.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: yangLs
 * @create: 2020-06-12 10:09
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    //为什么要加上@LoadBalanced?因为集群之后不知道是应该找集群的那一台机器了，所以需要加上rabbion的LoadBalanced
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
