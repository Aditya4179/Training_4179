package com.streamdemo;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]=new int[20];
		System.out.println(x[10]);
		
		Integer x1[]=new Integer[20];
		//System.out.println(x1[10].intValue());
		//System.out.println();
		Optional<Integer> optional=Optional.ofNullable(x1[10]);
		if(optional.isPresent()) {
			System.out.println(x1[10].intValue());
		}else {
			System.out.println("Value not present");
		}
		
		Employee e=new Employee(1,26,2021,"Karishma","female",20000);
		Optional<Employee> optionalEmployee=Optional.ofNullable(e);
		optionalEmployee.ifPresent(emp->System.out.println("Name is "+e.getName()));
		
		Optional<Employee> employeeAge=Optional.of(e);
		employeeAge.ifPresent(emp->System.out.println("Age "+e.getAge()));
		
		Optional<String> op1=Optional.of("My String");
		Optional<String> op2=Optional.empty();
		System.out.println();
		
		//Optional Value transformation to map and flatmap
		String s="Karishma";
		Optional<String> optionalstring=Optional.of(s);
		
		//optionalstring.filter(s->s.length()>3).
		
		
	}

}
