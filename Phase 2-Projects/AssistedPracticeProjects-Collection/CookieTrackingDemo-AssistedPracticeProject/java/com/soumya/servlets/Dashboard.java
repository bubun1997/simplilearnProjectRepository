package com.soumya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dashboard
 */
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dashboard() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    Cookie[] cookies = request.getCookies();
	    PrintWriter out = null;
	    RequestDispatcher rd = null;
	    System.out.println(cookies);
	    if(cookies!=null)
	    {
	    	for(Cookie cookie:cookies)
	    	{
	    		out=response.getWriter();
	    		out.println("Your Entered Id is : "+cookie.getValue());
	    	}
	    	return;
	    }
	    
	    out=response.getWriter();
	    rd = request.getRequestDispatcher("Index.html");

	    out.println("Please Login !!");
	    rd.include(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
