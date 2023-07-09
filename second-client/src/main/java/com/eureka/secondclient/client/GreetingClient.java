package com.eureka.secondclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-eureka-first-client")
public interface GreetingClient {
    @RequestMapping("/first/test")
    ResponseEntity<String> test();
}