package com.org.tcs.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ProdClass implements Employee {

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Production Team, is handling CICD ");
	}

}
