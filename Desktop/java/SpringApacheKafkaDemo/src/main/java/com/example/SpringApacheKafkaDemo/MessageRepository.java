package com.example.SpringApacheKafkaDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessageRepository {

	private List<String> messageList=new ArrayList<String>();
	
	public void addMessage(String message) {
		messageList.add(message);
	}
	
	public String getAllMessages(){
		return messageList.toString();
	}
}
