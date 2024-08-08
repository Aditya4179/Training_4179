package com.mongodemo.MongoDBDemoProject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="book")
public class Book {
	@Id
	private int bookId;
	private String bookName;
	private String bookAuthor;
	public Book() {
		super();
	}
	public Book(int bookId,String bookName, String bookAuthor) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId=bookId;
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
		
	
	
	
	
	
	

}
