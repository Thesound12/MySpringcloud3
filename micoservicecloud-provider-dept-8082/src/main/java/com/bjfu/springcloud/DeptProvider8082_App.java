package com.bjfu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//用来做服务发现的
@EnableDiscoveryClient
public class DeptProvider8082_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8082_App.class, args);
    }
}
