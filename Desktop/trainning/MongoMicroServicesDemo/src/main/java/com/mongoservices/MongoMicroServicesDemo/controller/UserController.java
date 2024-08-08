package com.mongoservices.MongoMicroServicesDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongoservices.MongoMicroServicesDemo.UserNotFoundException;
import com.mongoservices.MongoMicroServicesDemo.model.Address;
import com.mongoservices.MongoMicroServicesDemo.model.Response;
import com.mongoservices.MongoMicroServicesDemo.model.User;
import com.mongoservices.MongoMicroServicesDemo.repo.UserRepo;

@RestController
//@RequestMapping("/service")
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	
	List<User> userList=new ArrayList<User>();
	
	@PostMapping("/save")
	public ResponseEntity<Response> saveUser(@RequestParam  String userName, @RequestParam String phone, @RequestParam String email, @RequestParam  String addressLine, @RequestParam  String city, @RequestParam  String state, @RequestParam int zipcode){
		Address address=new Address(addressLine,city,state,zipcode);
		User user=new User(state, userName, phone, email, address);
		userList.add(user);
		userRepo.save(user);
		
		Response response=new Response(200,"User "+userName+" successfully added ",userList);
		
		return new ResponseEntity<Response>(response, HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update/{userId}")
	public ResponseEntity<Response> updateUser(@PathVariable("userId") String userId ,@RequestParam  String userName, @RequestParam String phone, @RequestParam String email, @RequestParam  String addressLine, @RequestParam  String city, @RequestParam  String state, @RequestParam int zipcode)
	throws UserNotFoundException{
		Address address=new Address(addressLine,city,state,zipcode);
		User user=new User(userId, userName, phone, email, address);
		userList.add(user);
		User u=userRepo.findById(userId).get();
		if(u.getUserId().equals(userId)) {
			u.setUserName(user.getUserName());
			u.setPhone(user.getPhone());
			u.setAddress(user.getAddress());
		}
		userRepo.save(u);
		
		Response response =new Response(201,"User "+userName+" Successfully updated ",userList);
		return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/allusers")
	public List<User> fetchAllUser(){
		
		return userRepo.findAll();
	}
}
