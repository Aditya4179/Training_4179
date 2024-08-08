package com.example.jwtdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JWTController {
	
	@GetMapping("/call")
	public String hello() {
		return "Spring Boot";
	}

}
