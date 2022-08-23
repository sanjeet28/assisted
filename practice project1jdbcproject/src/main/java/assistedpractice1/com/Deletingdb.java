package assistedpractice1.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deletingdb {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection conn = null;
		Statement stmt = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/","root","root");
			stmt = conn.createStatement();
			String query = "DROP  DATABASE ASSITEDPR";
			stmt.executeUpdate(query);
			System.out.println("sucessfully deleted database");
			
			
		} catch (SQLException e) {
		System.err.println("cannot connect");
			e.printStackTrace();
		}
		finally {
			System.out.println("closing the connection");
			
	    if(conn!=null)
	    	try {
	    		conn.close();
	    	}
	    
        catch(SQLException ignore) {}
		}
	}

}
