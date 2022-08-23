package assistedpractice1.com;
import java.sql.*;




public class mysql{

	public static void main(String[] args) throws ClassNotFoundException {

			
				Class.forName("com.mysql.cj.jdbc.Driver");
		
			try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			Statement stmt =  conn.createStatement();
			 ResultSet rs = stmt.executeQuery("select * from emp");){
				while(rs.next()) {
					System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getInt(3));
					//conn.close();
				}
				}catch(Exception e) {
					e.printStackTrace();
				}
	}
	}			
				
	


