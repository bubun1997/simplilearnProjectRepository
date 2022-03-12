package com.soumya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soumya.dbutil.SetDbConnection;

/**
 * Servlet implementation class DemoJdbc
 */
public class DemoJdbc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoJdbc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection con = SetDbConnection.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Bubun1234");
			PrintWriter out = response.getWriter();
			out.println("<h1 style='color:green'>Database Conncection is now established....</h1>");
			out.println("<a href='close'>Click here to close connection</a>");
			
			
		} catch (ClassNotFoundException c) {
			System.out.println("Class Not found");
		}
		catch(SQLException se) {
			System.out.println("Sql Exception");

			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
