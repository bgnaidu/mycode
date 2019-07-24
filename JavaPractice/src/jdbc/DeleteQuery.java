package jdbc;

import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQuery {

	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
	static final String UserName = "root";
	static final String Password = "Root";
	
	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			conn=DriverManager.getConnection(DB_URL, UserName, Password);
			stmt=conn.createStatement();
			String sql="DELETE FROM employes WHERE name='naidudud' ";
			stmt.executeUpdate(sql);
			System.out.println("deleted row succesfully");
			String query="SELECT * FROM employes";
			
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()) {
		int id=rs.getInt("empid");
		String name=rs.getString("name");
			Reader sex=rs.getCharacterStream("male");
			
				System.out.println("id is"+id);
				System.out.println("name is"+name);
				System.out.println("sex is "+sex);
				
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
