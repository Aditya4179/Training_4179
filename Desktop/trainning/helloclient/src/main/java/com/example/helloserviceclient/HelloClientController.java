package com.example.helloserviceclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/client")
public class HelloClientController {
	
	@GetMapping("/getService")
	public void getService() {
		
		
	}

}
