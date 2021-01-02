package com.bjfu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.bjfu.springcloud"})
public class DeptConsumer80_Feign_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_APP.class, args);
    }
}
