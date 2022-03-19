package com.soumya.airlines.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dao {
	public Connection con=null;
	public Statement st=null;

	public Dao() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root","Bubun@1234");
		st=con.createStatement();
	}
public List<String[]> getAvailableFlights(String f, String t, String d) {
		
		List<String[]> flights=new ArrayList<>();
		String query="SELECT * FROM flights where fromf='"+f+"' and tof='"+t+"' and datef='"+d+"'";
		try {
			ResultSet rs=st.executeQuery(query);
			
			if(rs.next()) {
				String[] flight=new String[3];
				flight[0]=rs.getString("name");
				flight[1]=rs.getString("timef");
				flight[2]=rs.getString("price");
				flights.add(flight);
				con.close();
				return flights;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

public HashMap<String, String> checkUser(String email, String password) {
	
	HashMap<String,String> user=null;
	String query="select * from user where email='"+email+"' and password='"+password+"'";
	try {
		ResultSet rs=st.executeQuery(query);
		if(rs.next()) {
			user=new HashMap<>();
			user.put("name", rs.getString("name"));
			user.put("email",rs.getString("email"));
			user.put("phno",rs.getString("phno"));
			user.put("adno",rs.getString("adno"));
		}
		return user;
	} catch (SQLException e) {
		e.printStackTrace();
	}
    try {
		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return user;
}

public boolean insertUser(HashMap<String, String> user) {

	String query="INSERT INTO user (email, password, name, phno, adno) values('"+user.get("email")+"','"+user.get("password")+"','"+user.get("name")+"','"+user.get("phno")+"','"+user.get("adno")+"')";                   
	System.out.println(1);
	try {
		st.execute(query);
		con.close();
		return true;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;
}

public boolean checkAdmin(String email, String password) {
	
	try {
		ResultSet rs=st.executeQuery("select * from admin where email='"+email.toLowerCase()+"' and password='"+password+"'");
		if(rs.next()) {
			con.close();
			return true;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;
}

public boolean changeAdminPassword(String email, String password) {

	try {
		ResultSet rs=st.executeQuery("select * from admin where email='"+email+"'");
		if(!rs.next()) {
			con.close();
			return false;
		}
		st.execute("update admin set password='"+password+"' where email='"+email+"'");
		con.close();
		return true;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
}

public boolean insertFlight(HashMap<String, String> flight) throws SQLException {
	//PreparedStatement stm=con.prepareStatement("INSERT INTO 'flyaway.flights' ('name', 'from', 'to', 'date', 'time', 'price') values(?,?,?,?,?,?)");
	//String sql="INSERT INTO flights ('name','from','to','date','time','price') values('"+flight.get("name")+"','"+flight.get("from")+"','"+flight.get("to")+"','"+flight.get("date")+"','"+flight.get("time")+"','"+flight.get("price")+"');";
	String query1 = "INSERT INTO flights (name, fromf, tof, datef, timef, price) VALUES" + " ('"
			+ flight.get("name") + "'," + " '" + flight.get("from") + "'," + " '"
			+ flight.get("to") + "'," + " '" + flight.get("date") + "'," + " '"
			+ flight.get("time") + "'," + " '" + flight.get("price") + "')";
	
	//String sql="INSERT INTO `flyaway`.`flights` (`name`, `fromf`, `tof`, `datef`, `timef`, `price`) VALUES ('indigo', 'hyd', 'viz', '2021-04-08', '10:00', '2000');";
	
	//String query1="INSERT into flyaway.flights (name,from,to,date,time,price) values('indigo','hyd','viz','24-02-2022','10:30','2000')";
	try {
		//stm.execute();
		st.execute(query1);
		con.close();
		return true;
	} catch (SQLException e) {
		System.out.print("error");
		e.printStackTrace();
	}
	con.close();
	return false;
}
}