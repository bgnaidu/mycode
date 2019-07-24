package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectJdbcquery {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/jid_thrillio";
	static final String UserName = "root";
	static final String Password = "Root";

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		try {
			// register driver class wi
			Class.forName(JDBC_DRIVER);

			System.out.println("connecting Database.......");
			
			conn = DriverManager.getConnection(DB_URL, UserName, Password);
			
			stmt=conn.createStatement();
			
			String sql="SELECT * FROM book";
			ResultSet rset=stmt.executeQuery(sql);
			System.out.println(rset);
			while(rset.next()) {
				
				int id=rset.getInt("id");
				String title=rset.getString("title");
				int publisher_id=rset.getInt("publisher_id");
				System.out.println("id is:"+id);
				System.out.println("title is:"+title);
				System.out.println("publisher_id is:"+publisher_id);
				
			}
			conn.close();
			stmt.close();
			
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

}
