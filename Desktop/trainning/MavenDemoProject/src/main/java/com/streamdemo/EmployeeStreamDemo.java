package com.streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee(1,34,2010,"Karishma","female",9000000));
		emplist.add(new Employee(2,18,2011,"Madhuri","female",29683));
		emplist.add(new Employee(3,58,2010,"Teju","female",987589));
		emplist.add(new Employee(4,33,2013,"Vijay","male",29864));
		emplist.add(new Employee(5,15,2018,"Mayur","male",9000000));
		emplist.add(new Employee(6,32,2013,"Prakash","male",11299));
		emplist.add(new Employee(7,22,2022,"Isha","female",986767));
		emplist.add(new Employee(8,28,2023,"Manisha","female",90992));
		emplist.add(new Employee(9,33,2015,"Rahul","male",40000));
		emplist.add(new Employee(10,56,2021,"Neerja","female",24987));
		
		//how many male and female employees are there 
		
		long malecount=emplist.stream().filter(emp->emp.getGender().equalsIgnoreCase("male")).count();
		System.out.println(malecount);
		long femalecount=emplist.stream().filter(emp->emp.getGender().equalsIgnoreCase("female")).count();
		System.out.println(femalecount);
		
		
		Map<String, Long> countbygender=
		emplist.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		

				
		System.out.println(countbygender);
		
		//senior employee
		//junior employee
		//2nd highest salary
		//2nd lowest salary
		//max experience
		//min experience
		//name starts with a//done
		//department minimum salary
		
		//name starts with M
		List<String> namestartswithM=
				emplist.stream().filter(emp->emp.getName().startsWith("M")).map(emp->emp.getName()).collect(Collectors.toList());
		System.out.println(namestartswithM);
		
		
		//emplist.stream().sort((a,b)->b-a).collect(Collectors.toList());
	}

}
