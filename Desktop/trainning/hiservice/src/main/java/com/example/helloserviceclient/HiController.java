package com.example.helloserviceclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HiController {

	@GetMapping("/message")
	public String getHiMessage() {
		return "Hi,I am HiServiceClient";
	}
}
