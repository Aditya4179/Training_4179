package com.example.helloserviceclient;

public class Book {
	int bookId;
	String bookName;
	double bookCost;
	public Book() {
		super();
	}
	public Book(int bookId, String bookName, double bookCost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCost = bookCost;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookCost() {
		return bookCost;
	}
	public void setBookCost(double bookCost) {
		this.bookCost = bookCost;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookCost=" + bookCost + "]";
	}
	
	

}
