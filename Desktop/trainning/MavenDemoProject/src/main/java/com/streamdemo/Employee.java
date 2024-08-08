package com.streamdemo;

public class Employee {
	int id,age,doj;
	String name,gender;
	long salary;
	public Employee(int id, int age, int doj, String name, String gender, long salary) {
		super();
		this.id = id;
		this.age = age;
		this.doj = doj;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDoj() {
		return doj;
	}
	public void setDoj(int doj) {
		this.doj = doj;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", doj=" + doj + ", name=" + name + ", gender=" + gender
				+ ", salary=" + salary + "]";
	}
	
}
