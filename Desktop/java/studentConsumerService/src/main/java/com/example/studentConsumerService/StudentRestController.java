package com.example.studentConsumerService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.ws.rs.GET;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	@Autowired
	private BookRestConsumer bookConsumer;
	
	@GetMapping("/data")
	public String getStudentInfo() {
		System.out.println(bookConsumer.getClass().getName());
		return "Accessing from STUDENT-SERVICE ==>"+bookConsumer.getBookData();
	}
	
	@GetMapping("/allBooks")
	public String getBooksInfo() {
		return "Accessing from STUDENT-SERVICE ==>"+bookConsumer.getAllBook();
	}
	
	@GetMapping("/getOneBook/{id}")
	public String getOneBookForStudent(@PathVariable("id") Integer id) {
		return "Accessing from STUDENT-SERVICE ==> "+bookConsumer.getBookById(id);
	}
	
	
}
