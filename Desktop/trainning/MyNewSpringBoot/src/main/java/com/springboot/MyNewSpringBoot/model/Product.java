package com.springboot.MyNewSpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productdata")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long productId;
	private String productName;
	private String productType;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(long productId, String productName, String productType) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	
}
