package com.libraryapp.LibraryManagementApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.libraryapp.LibraryManagementApp.model.Book;
import com.libraryapp.LibraryManagementApp.model.Customer;
import com.libraryapp.LibraryManagementApp.service.BookServiceImplementor;
import com.libraryapp.LibraryManagementApp.service.CustomerServiceImplementor;

@RestController
@RequestMapping("/library")
public class LibraryController {
	
	@Autowired
	BookServiceImplementor bookServiceImpl;
	
	@Autowired
	CustomerServiceImplementor customerServiceImpl;
	
	@GetMapping("/allBooks")
	public List<Book> fetchAllBooks(){
		return bookServiceImpl.fetchBookList();
	}
	
	@GetMapping("/allCustomers")
	public List<Customer> fetchAllCustomer(){
		return customerServiceImpl.fetchCustomerList();
	}
	
	@PostMapping("/saveBook")
	public Book saveBook(@RequestBody Book newBook) {
		return bookServiceImpl.saveBook(newBook);
	}
	
	@PostMapping("/saveCustomer")
	public Customer saveCustomer(@RequestBody Customer newCustomer) {
		return customerServiceImpl.saveCustomer(newCustomer);
	}
	
	@DeleteMapping("/removeBook/{bookId}")
	public void removeBook(@PathVariable("bookId") Long bookId) {
		bookServiceImpl.deleteBook(bookId);
	}
	
	@DeleteMapping("/removeCustomer/{customerId}")
	public void removeCustomer(@PathVariable("customerId") Long customerId) {
		customerServiceImpl.deleteCustomer(customerId);
	}
	
	@PutMapping("/updateBook/{bookId}")
	public Book updateBook(@PathVariable("bookId") Long bookId,@RequestBody Book newBook) {
		return bookServiceImpl.updateBook(newBook, bookId);
	}
	
	@PutMapping("/updateCustomer/{customerId}")
	public Customer updateCustomer(@PathVariable("customerId") Long customerId,@RequestBody Customer newCustomer) {
		return customerServiceImpl.updateCustomer(newCustomer, customerId);
	}
	

}
