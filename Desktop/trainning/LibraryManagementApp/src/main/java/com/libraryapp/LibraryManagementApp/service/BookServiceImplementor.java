package com.libraryapp.LibraryManagementApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libraryapp.LibraryManagementApp.model.Book;
import com.libraryapp.LibraryManagementApp.repository.BookRepository;

@Service
public class BookServiceImplementor implements BookService{
	
	@Autowired
	BookRepository bookRepo;
	
	public Book saveBook(Book newBook) {	
		return bookRepo.save(newBook);	
	}
	
	public List<Book> fetchBookList(){
		return bookRepo.findAll();
	}
	
	public Book updateBook(Book newBook, Long bookId) {
		Book oldBook=bookRepo.findById(bookId).get();
		if(oldBook.getBookId()==newBook.getBookId()) {
			oldBook.setBookName(newBook.getBookName());
			oldBook.setBookAuthor(newBook.getBookName());
			oldBook.setType(newBook.getType());
			oldBook.setAvailable(newBook.getAvailable());
		}
		return bookRepo.save(oldBook);
	}
	
	public void deleteBook(Long bookId) {
		bookRepo.deleteById(bookId);
	}

}
