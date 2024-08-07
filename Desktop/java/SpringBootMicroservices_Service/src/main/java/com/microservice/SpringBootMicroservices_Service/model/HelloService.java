package com.microservice.SpringBootMicroservices_Service.model;

public class HelloService {

	private int countMax;
	private int countMin;
	public HelloService() {
		super();
	}
	public HelloService(int countMax, int countMin) {
		super();
		this.countMax = countMax;
		this.countMin = countMin;
	}
	
	public int getCountMax() {
		return countMax;
	}
	public void setCountMax(int countMax) {
		this.countMax = countMax;
	}
	public int getCountMin() {
		return countMin;
	}
	public void setCountMin(int countMin) {
		this.countMin = countMin;
	}
	
	
	
}
