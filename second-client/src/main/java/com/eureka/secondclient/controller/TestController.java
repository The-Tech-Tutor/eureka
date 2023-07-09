package com.eureka.secondclient.controller;

import com.eureka.secondclient.client.GreetingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class TestController {

    @Autowired
    GreetingClient greetingClient;

    @GetMapping("/test")
    public ResponseEntity<String> getTestResponse() {
        return greetingClient.test();
    }
}
