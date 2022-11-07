package com.example.cau5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Cau5Application {

    public static void main(String[] args) {
        SpringApplication.run(Cau5Application.class, args);
    }

}
