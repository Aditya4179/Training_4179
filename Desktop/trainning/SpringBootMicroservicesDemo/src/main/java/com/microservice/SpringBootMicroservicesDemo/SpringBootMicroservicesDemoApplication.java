package com.microservice.SpringBootMicroservicesDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootMicroservicesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservicesDemoApplication.class, args);
	}

}
