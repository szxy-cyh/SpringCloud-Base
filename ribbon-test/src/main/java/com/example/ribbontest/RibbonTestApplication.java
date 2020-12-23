package com.example.ribbontest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RibbonTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonTestApplication.class, args);
    }

}
