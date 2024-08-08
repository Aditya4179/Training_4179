package com.example.studentConsumerService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="producerService")
public interface BookRestConsumer {

	@GetMapping("/book/getBook")
	public String getBookData();
	
	@GetMapping("/book/bookById/{id}")
	public Book getBookById(@PathVariable("id") int bookId);
	
	@GetMapping("/book/allBooks")
	public List<Book> getAllBook();
}
