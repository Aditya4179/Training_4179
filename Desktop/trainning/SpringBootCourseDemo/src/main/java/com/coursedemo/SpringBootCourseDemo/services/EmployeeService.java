package com.coursedemo.SpringBootCourseDemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursedemo.SpringBootCourseDemo.model.Employee;
import com.coursedemo.SpringBootCourseDemo.model.EmployeeRepository;
//service class can be class or interface
//Service layar is centralizing  the data services
@Service
public class EmployeeService {//Responsible to carrying out the business logic and encapsulate the functionality

	@Autowired
	private EmployeeRepository emp;
	
	public List<Employee> getAllEmployee(){
		return emp.findAll();
	}
	
	public Optional<Employee> getEmployeeById(Long id){
		return emp.findById(id);
	}
	
	public Employee saveEmployee(Employee e) {
		return emp.save(e);
	}
	
	public Employee updateEmployee(Employee e1) {
		return emp.save(e1);
	}
	
	public void deleteEmployee(Long id) {
		emp.deleteById(id);
	}
}
