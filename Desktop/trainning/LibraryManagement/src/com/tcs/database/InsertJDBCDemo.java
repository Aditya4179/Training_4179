package com.tcs.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertJDBCDemo {
	public static void main(String args[]) {
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tcsdb","root","Root123$");
			if(con!=null)
				System.out.println("Successfully Connected");
			
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?)");
			int n;
			int id;
			String name;
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter how many records you want to enter : ");
			n=sc.nextInt();
			int i=1;
			do {
				System.out.println("Enter student id : ");
				id=sc.nextInt();
				System.out.println("Enter student name : ");
				name=sc.next();
				
				ps.setInt(1,id);
				ps.setString(2, name);
				int j=ps.executeUpdate();
				
				System.out.println(j+" Rows affected ");
				i++;
			}while(i<=n);
			
		}catch(SQLException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
