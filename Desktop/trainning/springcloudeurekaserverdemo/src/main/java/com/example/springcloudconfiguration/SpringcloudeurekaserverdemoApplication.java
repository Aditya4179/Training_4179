package com.example.springcloudconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudeurekaserverdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudeurekaserverdemoApplication.class, args);
	}

}
