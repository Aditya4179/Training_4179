package com.microservice.SpringBootMicroservices_Service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.SpringBootMicroservices_Service.model.HelloService;

@RestController
public class HelloController {

	@GetMapping("/getlimit")
	public HelloService retriveLimit() {
		return new HelloService(5000,100);
	}
	
	
}
