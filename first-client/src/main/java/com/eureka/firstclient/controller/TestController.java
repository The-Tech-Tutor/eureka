package com.eureka.firstclient.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> getTestResponse() {
        return new ResponseEntity("First Client Response", HttpStatus.OK);
    }
}
