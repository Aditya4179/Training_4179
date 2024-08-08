package com.mongoservices.MongoMicroServicesDemo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongoservices.MongoMicroServicesDemo.model.User;

public interface UserRepo extends MongoRepository<User, String> {

}
