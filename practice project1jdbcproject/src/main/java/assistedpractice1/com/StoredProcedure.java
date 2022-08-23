package assistedpractice1.com;
import java.sql.*;

public class StoredProcedure {
	public static void main(String[] args) throws Exception
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root","root");
	String sql_string = "insert into emp values(?)";
	CallableStatement cs = conn.prepareCall(sql_string);
	cs.setString(1,"rohan");
//	cs.setString(2,"sanjeet");
	//cs.setString(3,"sam");
	//cs.setString(4,"satish");
	cs.execute();

	System.out.println("sucessfully");
	
	
	
	}
}
