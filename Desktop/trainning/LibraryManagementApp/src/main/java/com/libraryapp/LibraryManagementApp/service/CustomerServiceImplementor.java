package com.libraryapp.LibraryManagementApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryapp.LibraryManagementApp.model.Book;
import com.libraryapp.LibraryManagementApp.model.Customer;
import com.libraryapp.LibraryManagementApp.repository.CustomerRepository;

@Service
public class CustomerServiceImplementor implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;
	
	public Customer saveCustomer(Customer newCustomer) {
		return customerRepo.save(newCustomer);
	}
	
	public List<Customer> fetchCustomerList(){
		return customerRepo.findAll();
	}
	
	public Customer updateCustomer(Customer newCustomer,Long customerId) {
		Customer oldCustomer=customerRepo.findById(customerId).orElse(null);
		if(oldCustomer.getCustomerId()==newCustomer.getCustomerId()) {
			oldCustomer.setCustomerName(newCustomer.getCustomerName());
			oldCustomer.setMobileNo(newCustomer.getMobileNo());
		}
		return customerRepo.save(oldCustomer);
	}
	
	public void deleteCustomer(Long customerId) {
		customerRepo.deleteById(customerId);
	}
	
	public Customer borrowBook(Book book,Long customerId) {
		Customer oldCustomer=customerRepo.findById(customerId).orElse(null);
		if(oldCustomer.getCustomerId()==customerId) {
			oldCustomer.setBookId(book.getBookId());
			oldCustomer.setBookName(book.getBookName());	
		}
		return customerRepo.save(oldCustomer);
		
	}

}
