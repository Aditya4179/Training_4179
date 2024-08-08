package com.coursedemo.SpringBootCourseDemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id//it means the column will be primary
	@GeneratedValue(strategy=GenerationType.IDENTITY)// IDENTITY/AUTO/TABLE will specify the values for column will be generated automatically
	private long empid;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private Double salary;
	@Column
	private String skill;
	
	public Employee() {
		
	}
	
	public Employee(long empid, String name, Double salary, String skill) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.skill = skill;
	}
	
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
	

}
