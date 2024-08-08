package com.org.tcs.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DevClass implements Employee {

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("This is Developer Team, busy in developing the app ");
	}

}
