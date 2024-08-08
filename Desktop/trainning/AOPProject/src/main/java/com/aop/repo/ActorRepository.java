package com.aop.repo;

import org.springframework.stereotype.Repository;

@Repository
public class ActorRepository {
	
	public ActorRepository add(String actorName) {
		
		if(actorName==null) {
			throw new RuntimeException("No actor name specified");
		}else {
			System.out.println("This is add method "+actorName);
			return this;
		}
		
	}
	public boolean deleteActor(String actorName) {
		if(actorName==null) {
			throw new RuntimeException();
		}else {
			return true;
		}
		
	}

}
