package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Employee >employee=new ArrayList<Employee>();
		
		employee.add(new Employee(11075L));
		employee.add(new Employee(55864L));
		employee.add(new Employee(2443L));
		employee.add(new Employee(553L));
		employee.add(new Employee(24575L));
		
		List <Employee> emp1=employee.stream().filter(emp->emp.getEmployeeId()>553L).collect(Collectors.toList());
		for(int i=0;i<emp1.size();i++) {
			System.out.println(emp1.get(i).getEmployeeId());
		}
		
		List emp2=employee.stream().map(emp->emp.toString().startsWith("55")).collect(Collectors.toList());
		for(int i=0;i<emp2.size();i++) {
			System.out.println(emp1.get(i).getEmployeeId());
		}
	}

}
