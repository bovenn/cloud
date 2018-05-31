package com.bovenn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by kissy on 2017/8/31.
 */
@EnableFeignClients
@SpringCloudApplication
@ServletComponentScan
@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableSwagger2
public class CloudCatApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudCatApplication.class, args);
    }
}