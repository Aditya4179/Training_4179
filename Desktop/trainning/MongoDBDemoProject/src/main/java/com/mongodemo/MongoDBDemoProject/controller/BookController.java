package com.mongodemo.MongoDBDemoProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodemo.MongoDBDemoProject.model.Book;
import com.mongodemo.MongoDBDemoProject.service.BookServiceImplementor;

@RestController
@RequestMapping("/bookservices")
public class BookController {
	
	@Autowired
	BookServiceImplementor bookserviceimpl;
	
	@GetMapping("/allbooks")
	public List<Book> fetchAllBooks(){
		return bookserviceimpl.fetchAllBooks();
	}
	
	@PostMapping("/saveBook")
	public Book saveBook(@RequestBody Book book) {
		return bookserviceimpl.saveBook(book);
	}
	

}
