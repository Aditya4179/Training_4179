package com.mongodemo.MongoDBDemoProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mongodemo.MongoDBDemoProject.model.Book;

public interface BookService {

	public Book saveBook(Book book);
	public List<Book> fetchAllBooks();
	public Book updateBook(Book book,int bookId);
	public void removeBook(int bookId);
}
