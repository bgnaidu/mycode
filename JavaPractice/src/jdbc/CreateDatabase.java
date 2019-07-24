package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306";
	static final String UserName = "root";
	static final String Password = "Root";

	public static void main(String[] args) {
		Connection conn;
		Statement stmt;
		
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("connecting to database...");
			conn = DriverManager.getConnection(DB_URL, UserName, Password);
			stmt = conn.createStatement();
			String sqlquery = "CREATE DATABASE meraDatabase";
			stmt.executeUpdate(sqlquery);
			System.out.println("Database created successfully...");
		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

}
