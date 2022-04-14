package com.example.orderservice;

import com.ctc.wstx.shaded.msv_core.util.Uri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class TestController {
    @Autowired
    UserFeign userFeign;

    @GetMapping("/")
    public String hello() {
        return "[This is Order-Service] " + userFeign.get();
    }
}
