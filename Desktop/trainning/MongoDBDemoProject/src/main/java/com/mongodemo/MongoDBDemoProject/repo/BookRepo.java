package com.mongodemo.MongoDBDemoProject.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodemo.MongoDBDemoProject.model.Book;

public interface BookRepo extends MongoRepository<Book,Integer> {

}
