package com.example.helloserviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HiserviceclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiserviceclientApplication.class, args);
	}

}
