package com.example.springcloudeurekaclientdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	List<Product> prodList;
	@GetMapping("/allProducts")
	public Response getAllProduct() {
		
		Product p1=new Product("Dell Laptop",123);
		Product p2=new Product("lenovo mouse",500);
		Product p3=new Product("Hp Laptop",297);
		
		prodList=new ArrayList<Product>();
		prodList.add(p1);
		prodList.add(p2);
		prodList.add(p3);
		
		Response response=new Response(200," Successfully fetched all Products ",prodList);
		
		return response;
		
	}
}
