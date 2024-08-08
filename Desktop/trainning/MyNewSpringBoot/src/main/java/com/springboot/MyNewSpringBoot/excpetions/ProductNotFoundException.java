package com.springboot.MyNewSpringBoot.excpetions;

public class ProductNotFoundException extends Exception{

	public ProductNotFoundException(String msg) {
		super(msg);
	}
}
