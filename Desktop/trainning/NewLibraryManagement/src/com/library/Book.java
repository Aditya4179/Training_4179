package com.library;

public class Book {
	private int bookId;
	private String bookName,bookAuthor,type;
	public Book(int bookId, String bookName, String bookAuthor, String type) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.type = type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return("Book Name : "+bookName+"\tBook Id : "+bookId+"\t Book Author : "+bookAuthor+"\tBook Type : "+type);
	}
	
	public void showBook(Book b) {
		System.out.println("Book details are : "+b);
	}

}
