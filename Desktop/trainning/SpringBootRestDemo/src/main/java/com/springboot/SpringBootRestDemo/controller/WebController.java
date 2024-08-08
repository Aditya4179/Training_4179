package com.springboot.SpringBootRestDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SpringBootRestDemo.model.PostRequest;
import com.springboot.SpringBootRestDemo.model.PostResponse;
import com.springboot.SpringBootRestDemo.model.SampleResponse;

@RestController
@RequestMapping("/sample")
public class WebController {
	
	@GetMapping("/edu")
	public String call() {
		return "Edureka";
	}

	@GetMapping("/data")
	public SampleResponse sample(@RequestParam(value="name", defaultValue = "Karishma") String name) {
		
		SampleResponse sampleResponse=new SampleResponse();
		sampleResponse.setId(101L);
		sampleResponse.setMessage("My name is : "+name);
		return sampleResponse;

	}
	
	@PostMapping
	public PostResponse test(@RequestBody PostRequest postRequest) {
		PostResponse postResponse=new PostResponse();
		postResponse.setId(postRequest.getId()*100);
		postResponse.setMessage("Hello "+postRequest.getName());
		postResponse.setExtra("This is my extra one ");
		return postResponse;
		
	}
}
