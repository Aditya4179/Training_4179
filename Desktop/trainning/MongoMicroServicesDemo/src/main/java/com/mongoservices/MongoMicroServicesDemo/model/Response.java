package com.mongoservices.MongoMicroServicesDemo.model;

import java.util.List;

public class Response {
	
	private int code;
	private String message;	
	private List<User> user;
	public Response() {
		super();
	}
	public Response(int code, String message, List<User> user) {
		super();
		this.code = code;
		this.message = message;
		this.user = user;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	

	

}
