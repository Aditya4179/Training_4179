package com.libraryapp.LibraryManagementApp.service;

import java.util.List;

import com.libraryapp.LibraryManagementApp.model.Book;

public interface BookService {
	
	Book saveBook(Book book);
	
	List<Book> fetchBookList();
	
	Book updateBook(Book book, Long bookId);
	
	void deleteBook(Long bookId);

}
