package com.example.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    int a= 10;

    @Value("${eureka.client.service-url}")
    private String data;

    @GetMapping("/")
    public String hello() {
        return data;
    }
}
