package com.example.helloserviceclient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	Environment environment;
	
	@GetMapping("/getBook")
	public String getBookData() {
		return environment.getProperty("local.server.port");
	}
	
	@GetMapping("/bookById/{id}")
	public Book getBookById(@PathVariable("id") int bookId) {
		return new Book(bookId,"MyBook",90.60);
		
	}
	
	@GetMapping("/allBooks")
	public List<Book> getAllBook(){
		return List.of(new Book(1,"Book1",30.97),new Book(2,"Book2",89.00),new Book(3,"Book3",50.48),new Book(1,"Book1",30.97));
	}

}
