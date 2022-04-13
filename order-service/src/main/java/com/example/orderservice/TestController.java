package com.example.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    UserFeign userFeign;

    @GetMapping("/")
    public String hello() {
        return "[This is Order-Service] " + userFeign.get();
    }
}
