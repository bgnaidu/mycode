package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Dropdatabase {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/";
	static final String UserName = "root";
	static final String Password = "Root";

	public static void main(String[] args) {
	Connection conn;
 Statement stmt;
	
	try {
		Class.forName(JDBC_DRIVER);
		conn=DriverManager.getConnection(DB_URL, UserName, Password);
		stmt=conn.createStatement();
		String sql="DROP DATABASE meradatabase";
		stmt.executeUpdate(sql);
		System.out.println("deleted database succesfully");
	} catch (SQLException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
