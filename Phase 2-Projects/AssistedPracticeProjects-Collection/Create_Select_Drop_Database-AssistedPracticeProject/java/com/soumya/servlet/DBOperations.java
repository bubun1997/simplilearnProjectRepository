package com.soumya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soumya.dbutil.DBConnection;

/**
 * Servlet implementation class DBOperations
 */
public class DBOperations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBOperations() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection con = DBConnection.getConnection("jdbc:mysql://localhost:3306/","root","Bubun@1234");
			Statement stmt = con.createStatement();
           System.out.println(con);
			PrintWriter out = response.getWriter();
			stmt.executeUpdate("create database mydatabase1");
            out.println("<h1>Created database: mydatabase</h1>");
            stmt.executeUpdate("use mydatabase1");
            out.println("<h2>Selected database: mydatabase</h2>");
            stmt.executeUpdate("drop database mydatabase1");
            con.close();
            out.println("<h3>Dropped database: mydatabase</h3>");
           
			
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
