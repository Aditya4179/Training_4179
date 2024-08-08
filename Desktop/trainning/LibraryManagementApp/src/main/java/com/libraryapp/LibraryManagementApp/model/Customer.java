package com.libraryapp.LibraryManagementApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long customerId;
	@Column(nullable=false)
	private String customerName;
	@Column(nullable=false)
	private long mobileNo;	
	@Column(nullable=true)
	private long bookId;
	@Column(nullable=true)
	private String bookName;
	
	public Customer() {
		super();
	}
	public Customer(long customerId, String customerName, long mobileNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNo = mobileNo;
		
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
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
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mobileNo=" + mobileNo
				+ ", bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	public void showCustomer(Customer c) {
		System.out.println("Customer details are : "+c);
	}
	public void borrowBook(Book b) {
		
	}
	public void returnBook(Book b) {
		
	}


}
