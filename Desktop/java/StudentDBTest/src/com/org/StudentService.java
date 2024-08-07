package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentService {
	ArrayList<Student> student;
	Connection connect;
	PreparedStatement preparedStatement;
	
	public StudentService() {
		student=new ArrayList<Student>();
		
		connectToDB();
	}
	
	public void connectToDB() {
		try {
			//Class.forName("com.mysql.jdbc.Driver"); option if we don't add .jar file
			this.connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/tcsdb","root","Root123$");
			if(connect!=null) {
				System.out.println("Successfully Connected");
			}
		}catch(SQLException e) {
			System.out.println(e);
		}catch(Exception s) {
			System.out.println(s);
		}
	}
	public void add(Student stud) {
		student.add(stud);
		try {
			preparedStatement=connect.prepareStatement("insert into student1 values(?,?,?)");
			preparedStatement.setInt(1,stud.getId());
			preparedStatement.setString(2, stud.getName());
			preparedStatement.setString(3, stud.getCity());
			preparedStatement.executeUpdate();
		}catch(SQLException e) {
			System.out.println(e);
		}
		
	}
	
	public void remove(int studentId) {
		boolean remove=student.removeIf(student->student.getId()==studentId);
		if(remove) {
			System.out.println("Student removed with id "+studentId);
		}
		try{
			preparedStatement=connect.prepareStatement("Delete from student1 where id=?");
			preparedStatement.setInt(1, studentId);
			preparedStatement.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void update(Student stud) {
		for(Student stud1:student) {
			if(stud1.getId()==stud.getId()) {
				stud1.setId(stud.getId());
				stud1.setName(stud.getName());
				stud1.setCity(stud.getName());
			}
		}
		try {
			preparedStatement=connect.prepareStatement("update student1 set id=?,name=?,city=? where id=?");
			preparedStatement.setInt(1,stud.getId());
			preparedStatement.setString(2, stud.getName());
			preparedStatement.setString(3, stud.getCity());
			preparedStatement.setInt(4, stud.getId());
			preparedStatement.executeUpdate();
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public void display() {
		if(student.isEmpty()) {
			System.out.println("Student list is empty");
		}else {
			try {
				preparedStatement=connect.prepareStatement("Select * from student1");
				ResultSet resultSet=preparedStatement.executeQuery();
				System.out.println("Id\t\tName\t\tCity");
				while(resultSet.next()) {			
					System.out.println(resultSet.getInt(1)+"\t\t"+resultSet.getString(2)+"\t\t"+resultSet.getString(3));
				}
			
			}catch(SQLException e) {
				System.out.println(e);
			}
		}
		
	}

}
