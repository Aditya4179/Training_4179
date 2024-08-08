package com.mongoservices.MongoMicroServicesDemo.model;


public class Address {
	
	private String addressLine;
	private String city;
	private String state;
	private int zipcode;
	public Address() {
		super();
	}
	public Address(String addressLine, String city, String state, int zipcode) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	

}
