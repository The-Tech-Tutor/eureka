package com.eureka.secondclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SecondClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondClientApplication.class, args);
	}

}
