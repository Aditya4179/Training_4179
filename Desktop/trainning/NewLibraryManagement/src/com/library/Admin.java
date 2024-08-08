package com.library;

import java.util.ArrayList;
import java.util.Iterator;

public class Admin {
	ArrayList<Book> booklist;
	ArrayList<Customer> customerlist;
	int customerCount=0, bookCount=0;
	Iterator<Book> iterateBook;
	Iterator<Customer> iterateCustomer;
	ArrayList<Book> tempbook;
	ArrayList<Customer> tempcustomer;
	
	public Admin(int customerCount, int bookCount) {
		booklist=new ArrayList<Book>();
		customerlist=new ArrayList<Customer>();
		iterateBook=booklist.iterator();
		iterateCustomer=customerlist.iterator();
		this.bookCount=bookCount;
		this.customerCount=customerCount;
		tempbook=new ArrayList<Book>();
		tempcustomer=new ArrayList<Customer>();
	}
	
	public void addBook(Book b) {
		if(booklist.size()<bookCount) {
			booklist.add(b);
		}else {
			System.out.println("Library is full cannot add more books"+booklist.size());
		}
	}
	public void removeBook(int bookId) {
		if(booklist.isEmpty()) {
			System.out.println("Book list is empty...");
		}else {		
			tempbook.addAll(booklist);
			for(Book book:tempbook) {
				if(book.getBookId()==bookId) {
					booklist.remove(book);
				}
			}
			System.out.println("Book with id "+(bookId)+" is removed.....");
		}
		
	}
	public void replaceBook(Book b ) {
		for(Book book:booklist) {
			if(book.getBookId()==b.getBookId()) {
				book.setBookId(b.getBookId());
				book.setBookName(b.getBookName());
				book.setBookAuthor(b.getBookAuthor());
				book.setType(b.getType());
			}
		}
	}
	public void showAllBooks() {
		System.out.println("\nAll Book details : ");
		for(Book b:booklist) {
			System.out.println(b);
		}
	}
	public void addCustomer(Customer c) {
		if(customerlist.size()<customerCount) {
			customerlist.add(c);
		}else {
			System.out.println("Library membership is not available now.");
		}
	}
	public void removeCustomer(int customerId) {
		if(customerlist.isEmpty()) {
			System.out.println("Customer list is empty...");
		}else {
			tempcustomer.addAll(customerlist);
			for(Customer customer:tempcustomer) {
				if(customer.getCustomerId()==customerId) {
					customerlist.remove(customer);
				}
			}
			System.out.println("Customer with id "+(customerId)+" is removed.....");
		}
	}
	public void showAllCustomers() {
		System.out.println("\nAll Customer details : ");
		for(Customer c:customerlist) {
			System.out.println(c);
		}
	}
	

}
