package com.library;

public class Customer {
	private int customerId;
	private long mobileNo;
	private String customerName;
	public Customer(int customerId, String customerName, long mobileNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNo = mobileNo;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String toString() {
		return("Customer Name : "+customerName+"\tCustomer Id : "+customerId+"\t Customer Mobile number : "+mobileNo);
	}
	
	public void showCustomer(Customer c) {
		System.out.println("Customer details are : "+c);
	}
	public void borrowBook(Book b) {
		
	}
	public void returnBook(Book b) {
		
	}
	
	
	
	

}
