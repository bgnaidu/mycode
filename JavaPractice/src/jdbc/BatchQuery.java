package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchQuery {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
	static final String UserName = "root";
	static final String Password = "Root";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
		Class.forName(JDBC_DRIVER);
		Connection conn=DriverManager.getConnection(DB_URL, UserName, Password);
		conn.setAutoCommit(false);
		Statement stmt=conn.createStatement();
		String sqlbatch="INSERT INTO employes VALUES(1234, 'rohith', 'm')";
		stmt.addBatch(sqlbatch);
		String sqlbatch1="INSERT INTO employes VALUES (4321, 'KOHLI', 'm')";
		stmt.addBatch(sqlbatch1);
		int[] count=stmt.executeBatch();
		conn.commit();
		System.out.println("executed the batch of records");
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
	}

}
