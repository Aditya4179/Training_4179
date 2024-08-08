package com.org.tcs.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class OppClass implements Employee {

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Operation Team, checks the deployment operation ");
	}

}
