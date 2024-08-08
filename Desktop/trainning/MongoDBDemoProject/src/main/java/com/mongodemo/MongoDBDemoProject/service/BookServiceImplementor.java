package com.mongodemo.MongoDBDemoProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodemo.MongoDBDemoProject.model.Book;
import com.mongodemo.MongoDBDemoProject.repo.BookRepo;

@Service
public class BookServiceImplementor implements BookService{
	
	@Autowired
	BookRepo bookRepo;
	
	public Book saveBook(Book book) {
		return bookRepo.save(book);
	}
	
	public List<Book> fetchAllBooks(){
		return bookRepo.findAll();
	}
	
	public Book updateBook(Book book,int bookId) {
		Book b=bookRepo.findById(bookId).get();
		if(b.getBookId()==bookId) {
			b.setBookName(book.getBookName());
			b.setBookAuthor(book.getBookAuthor());
		}
		
		return bookRepo.save(b);
	}
	
	public void removeBook(int bookId) {
		bookRepo.deleteById(bookId);
	}
}
