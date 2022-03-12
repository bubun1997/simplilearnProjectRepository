package com.soumya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soumya.dbutil.DBConnection;

/**
 * Servlet implementation class DBConnection
 */
public class DemoJDBC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoJDBC() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection con = DBConnection.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Bubun1234");
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
		doGet(request, response);
	}

}
