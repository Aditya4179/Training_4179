package com.springboot.MyNewSpringBoot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.MyNewSpringBoot.model.Product;

public interface ProductService {
	
	Product savProduct(Product product);
	
	List<Product> fetchProductList();
	
	Product updateProduct(Product product,Long productId);
	
	void deleteProduct(Long productId);

}
