package com.tcs.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {
	private static final String url="jdbc:mysql://localhost:3306/tcsdb";
	private static final String user="root";
	private static final String password="Root123$";
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,user,password);
	}
	public static void main(String args[]) {
		try {
			Connection con=getConnection();
			if(con!=null) {
				System.out.println("Successfully Connected to DB");
			}
		}catch(SQLException e) {
			System.out.println("Connection failed : ");
			e.printStackTrace();
		}
		
	}

}
