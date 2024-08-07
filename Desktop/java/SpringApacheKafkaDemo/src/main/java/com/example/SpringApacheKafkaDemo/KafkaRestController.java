package com.example.SpringApacheKafkaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaRestController {

	@Autowired
	private MessageProducer messageProducer;
	
	@Autowired
	private MessageRepository messageRepo;
	
	@GetMapping("/sent")
	public String sendMessage(@RequestParam("msg") String message){	
		messageProducer.sendMessage(message);
		return message+" "+" sent successfully!";
	}
	
	@GetMapping("/getAll")
	public String getAllMessages() {
		return messageRepo.getAllMessages();
	}
}
