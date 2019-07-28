package myy;

import java.sql.*;

public class start {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
		String url="jdbc:mysql://localhost/sapientdb";
		String uname="root";
		String pass="123456";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		PreparedStatement st= con.prepareStatement("insert into news values(?,?)");
		int i=st.executeUpdate();  
		System.out.println(i+" records inserted");  
		st.close();
		con.close();
	}
	
}
