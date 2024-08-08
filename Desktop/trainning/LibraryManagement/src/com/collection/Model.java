package com.collection;

public class Model {
	String name,city;
	int id;
	public Model(String name, String city, int id) {
		super();
		this.name = name;
		this.city = city;
		this.id = id;
	}
	
	public String toString() {
		return("Name : "+name+"\tId : "+id+"\tcity : "+city);
	}
}

