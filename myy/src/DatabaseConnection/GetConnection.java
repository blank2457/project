package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class GetConnection {
	static Connection connection;
	public ResultSet rs, rs1, rs2;
	public PreparedStatement ps, ps1, ps2;
	public GetConnection() {
	}
	
	public static Connection getMysqlConnection() {
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/sapientdb?autoReconnect=true&useSSL=false", "root", "123456");
			return connection;
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
					
		}
		return null;
	}
}
