package com.springboot.MyNewSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.MyNewSpringBoot.model.Product;
import com.springboot.MyNewSpringBoot.service.ProductServiceImplementor;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductServiceImplementor prodservimpl;
	
	@GetMapping("/allproduct")
	public List<Product> fetchProductList(){
		return prodservimpl.fetchProductList();
	}
	
	@PostMapping("/saveproduct")
	public Product saveProduct(@RequestBody Product product) {
		return prodservimpl.savProduct(product);
	}
	
	@PutMapping("/updateproduct/{id}")
	public Product updaProduct(@RequestBody Product product, @PathVariable("id") Long productId) {
		
		return prodservimpl.updateProduct(product, productId);
	}

	@DeleteMapping("/deleteproduct/{id}")
	public String deleteProduct(@PathVariable("id") Long productId) {
		prodservimpl.deleteProduct(productId);
		return "Product deleted successfully";
	}
}
