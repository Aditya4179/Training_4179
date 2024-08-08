package com.springboot.MyNewSpringBoot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.MyNewSpringBoot.model.Product;
import com.springboot.MyNewSpringBoot.repo.ProductRepository;
import com.springboot.MyNewSpringBoot.service.ProductServiceImplementor;


@SpringBootTest
class MyNewSpringBootApplicationTests {

	@Autowired
	//ProductServiceImplementor prodservice;
	ProductRepository prodRepo;
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testSaveProduct() {
		Product product=new Product(202L,"Lenovo","laptop");
		prodRepo.save(product);
		assertNotNull(product);
		assertEquals("Hp", product.getProductName());
	}
	@Test
	public void testGetProduct() {
		Product product=new Product(102L,"Hp","Mouse");
		prodRepo.save(product);
		Product p=prodRepo.findById(product.getProductId()).orElse(null);
		assertNotNull(p);
		assertEquals(p.getProductId(), product.getProductId());
	}
	
	@Test
	public void testUpdateProduct() {
		Product product=new Product(103L,"Dell","Mouse");
		prodRepo.save(product);
		Product p=prodRepo.findById(product.getProductId()).orElse(null);
		if(p.getProductId()==product.getProductId()) {
			p.setProductName("Lenovo");
			p.setProductType("mouse");
		}
		prodRepo.save(p);
		assertNotNull(p);
		assertNotEquals(p.getProductName(), product.getProductName());
		System.out.println("Karishma"+p.getProductName());
	}
	@Test
	public void testRemoveProduct() {
		Product product=new Product(200,"Dell","mouse");
		prodRepo.save(product);
		Product p1=prodRepo.findById(200L).orElse(null);
		assertNotNull(p1);
		prodRepo.deleteById(product.getProductId());
		Product p2=prodRepo.findById(200L).orElse(null);
		assertNotNull(p2);
	
	}

}
