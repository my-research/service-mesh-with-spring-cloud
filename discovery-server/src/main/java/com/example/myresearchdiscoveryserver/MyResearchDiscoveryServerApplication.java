package com.example.myresearchdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyResearchDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyResearchDiscoveryServerApplication.class, args);
    }

}
