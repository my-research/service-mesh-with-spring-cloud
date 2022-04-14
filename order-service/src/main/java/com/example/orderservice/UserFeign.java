package com.example.orderservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-service", url = "${eureka.client.service-url:${url.user-service}}")
public interface UserFeign {
    @GetMapping("/")
    String get();
}
