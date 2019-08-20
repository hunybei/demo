package com.test.instance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class InstanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InstanceApplication.class, args);
    }

    @GetMapping("hello")
    public String hello() {
        return "demo 下的 instance update 2";
    }
}
