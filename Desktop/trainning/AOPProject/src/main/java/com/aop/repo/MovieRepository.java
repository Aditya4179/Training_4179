package com.aop.repo;

import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {
	
	public MovieRepository add(String movieName) {
		if(movieName==null) {
			throw new RuntimeException("Movie name is not specified");
		}else {
			return this;
		}
	}
	public boolean deleteMovie(String movieName) {
		if(movieName==null) {
			throw new RuntimeException("Movie name is not specified");
		}else {
			return true;
		}
	}

}
