package com.org.tcs.bean;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {

	DevClass dev;
	OppClass opp;
	ProdClass prod;
	
	public Manager(DevClass dev, OppClass opp, ProdClass prod) {
		super();
		this.dev = dev;
		this.opp = opp;
		this.prod = prod;
	}

	
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager is managing all the teams...");
	}
	
	public void callMeeting() {
		dev.doWork();
		opp.doWork();
		prod.doWork();
	}

}
