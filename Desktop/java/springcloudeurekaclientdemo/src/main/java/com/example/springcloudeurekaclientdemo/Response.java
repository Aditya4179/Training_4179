package com.example.springcloudeurekaclientdemo;

import java.util.List;

public class Response {
	int code;
	String message;
	List<Product> productList;
	
	public Response() {
		super();
	}
	
	public Response(int code, String message, List<Product> productList) {
		super();
		this.code = code;
		this.message = message;
		this.productList = productList;
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
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	
	
}
