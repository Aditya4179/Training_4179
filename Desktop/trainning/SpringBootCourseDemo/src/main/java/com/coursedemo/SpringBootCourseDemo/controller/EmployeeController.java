package com.coursedemo.SpringBootCourseDemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursedemo.SpringBootCourseDemo.model.Employee;
import com.coursedemo.SpringBootCourseDemo.services.EmployeeService;

//Controller will handle all request and responses
@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService serv;
	
	@GetMapping("/all")
	public List<Employee> getAllEmployees(){
		return serv.getAllEmployee();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
		Optional<Employee> employee=serv.getEmployeeById(id);
		return employee.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return serv.saveEmployee(employee);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee employeeDetail) {
		Optional<Employee> optionalEmployee=serv.getEmployeeById(id);
		if(optionalEmployee.isPresent()) {
			Employee employee= optionalEmployee.get();
			employee.setName(employeeDetail.getName());
			employee.setSalary(employeeDetail.getSalary());
			employee.setSkill(employeeDetail.getSkill());
			return ResponseEntity.ok(serv.updateEmployee(employee));
		}else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		serv.deleteEmployee(id);
	}
	

}
