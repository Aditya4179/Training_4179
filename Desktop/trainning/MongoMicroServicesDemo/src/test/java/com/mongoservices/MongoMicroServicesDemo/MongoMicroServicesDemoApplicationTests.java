package com.mongoservices.MongoMicroServicesDemo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mongoservices.MongoMicroServicesDemo.model.User;
import com.mongoservices.MongoMicroServicesDemo.repo.UserRepo;

@SpringBootTest
class MongoMicroServicesDemoApplicationTests {

	@Autowired
	UserRepo userRepo;
	public MongoMicroServicesDemoApplicationTests()
    {
        super();
    }
	/*@Test
	void contextLoads() {
		
	}*/
	
	@Test
	public void getEmployee() {
		User user=userRepo.findById("Maharashtra").get();
		assertEquals(user.getUserId(),"Maharashtra");
	}
	
	@Test
	public void saveUser() {
		//User user1=new User("kan")
	}
	
	 public void testApp()
	    {
	        assertTrue( true );
	    }
	
	

}
