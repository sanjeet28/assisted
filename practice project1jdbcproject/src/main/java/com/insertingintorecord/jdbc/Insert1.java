package com.insertingintorecord.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert1 {

	private static final String name = null;
	private static final String id = null;
	private static final String age = null;

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","root");
			stmt = conn.createStatement();
			
			String query = "insert into emp values('" +id+ "','"  +name+"','" +age+ "')";
			int x = stmt.executeUpdate(query);
			if(x>0) 
				System.out.println("sucessfully created");
			
			else 
				System.out.println("insert failed");
			conn.close();
		}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}

	}


