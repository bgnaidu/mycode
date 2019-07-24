package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
	static final String UserName = "root";
	static final String Password = "Root";
	
	public static void main(String[] args) {
		
		try {
			Class.forName(JDBC_DRIVER);
			Connection conn=DriverManager.getConnection(DB_URL, UserName, Password);
			Statement stmt=conn.createStatement();
			String sql="INSERT INTO employes "+ "VALUES (2224, 'bgnaidugaru', 'm')";
			stmt.executeUpdate(sql);
			System.out.println("inserted data");
			stmt.executeUpdate("INSERT INTO employes "+ "VALUE (2223, 'mssnaidu','f')");
			System.out.println("inserted data");
			conn.close();
			stmt.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
