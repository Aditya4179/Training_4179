package com.libraryapp.LibraryManagementApp.service;

import java.util.List;

import com.libraryapp.LibraryManagementApp.model.Book;
import com.libraryapp.LibraryManagementApp.model.Customer;

public interface CustomerService {
	
	Customer saveCustomer(Customer customer);
	
	List<Customer> fetchCustomerList();
	
	Customer updateCustomer(Customer customer,Long customerId);
	
	void deleteCustomer(Long customerId);
	
	Customer borrowBook(Book book,Long customerId);

}
