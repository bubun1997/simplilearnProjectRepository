package com.soumya.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	static private Connection con;
	public static Connection getConnection(String URL,String userName,String password)throws ClassNotFoundException,SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		if(con==null)
			con = DriverManager.getConnection(URL,userName,password);
		return con;
	}
     public static boolean closeConnection() throws SQLException {
    	 System.out.println(con);
    	 if(con!=null) {
    	   con.close();
    	   return true;
    	 }
    	 return false;
     }

}
