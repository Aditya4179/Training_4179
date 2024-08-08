package com.library;

import java.util.ArrayList;

public class Person {
	int personId;
	String personName;
	String borrowDate;
	String returnDate;
	
	public Person(int personId, String personName, String borrowDate, String returnDate) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
	}
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	
	public void addPerson(Person p,ArrayList<Person> person) {
		
	}
	public void removePerson(Person p,ArrayList<Person> person) {
		
	}
	public void borrowBook(Book b,ArrayList<Book> book) {
		
	}
	public void returnBook(Book b,ArrayList<Book> book) {
		
	}
	public void show() {
		
	}
	
	
	
}
