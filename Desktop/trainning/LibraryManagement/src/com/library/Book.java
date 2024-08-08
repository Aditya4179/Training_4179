package com.library;

import java.util.ArrayList;

public class Book implements Library{
	private int bookId;
	private String bookName;
	private String bookAuthor;
	
	public Book(int bookId, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
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
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	public void addBook(Book b,ArrayList<Book> book) {
		
		book.add(b);
	}
	public void removeBook(int id,ArrayList<Book> book) {
		
		book.remove(id);
	}
	@Override
	public void show() {
		System.out.println();
	}

}
