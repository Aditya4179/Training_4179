package com.tcs.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemoClass {
	public static void main(String args[]) {
		Connection con=null;
		try {
			//1.add driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded....");
			
			//2.give connection url and user and pass
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tcsdb", "root", "Root123$");
			if(con!=null)
			System.out.println("Sucessfully Connected to DB");
			
			//3.create statment using Statement interface
			Statement st=con.createStatement();
			
			//4.use resultset and execute query to get result
			ResultSet rs=st.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println("Student ID : "+rs.getInt(1)+"\t Student Name : "+rs.getString(2));
			}
			
			//5.close the connection
			con.close();
				
		}catch(SQLException e) {
			//e.printStackTrace();
			System.out.println("Facing : "+e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
