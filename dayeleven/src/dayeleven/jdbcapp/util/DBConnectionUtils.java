package dayeleven.jdbcapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtils {
	
	private static final String URL="jdbc:mysql://localhost:3306/test";
	//Static method which returns object of Connection type
	public static Connection getDBConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, "root", "password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
