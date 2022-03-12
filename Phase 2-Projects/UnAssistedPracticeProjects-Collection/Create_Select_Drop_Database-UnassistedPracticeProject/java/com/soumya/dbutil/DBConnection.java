package com.soumya.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	static private Connection con;
	public static Connection getConnection(String URL,String userName,String password)throws ClassNotFoundException,SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		if(con==null)
			con = DriverManager.getConnection(URL,userName,password);
		return con;
	}
     public static void closeConnection() throws SQLException {
    	 if(con!=null)
    		 con.close();
     }

}
