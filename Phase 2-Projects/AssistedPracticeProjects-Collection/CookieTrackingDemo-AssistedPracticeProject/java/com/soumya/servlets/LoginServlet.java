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
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		String userId= request.getParameter("userid");
		RequestDispatcher rd = null;
		PrintWriter out =null;
		
		if(userId!=null) {
		Cookie cookie = new Cookie("userid",userId);
		System.out.println(cookie+" "+userId);
		response.addCookie(cookie);
		
		 out = response.getWriter();
		out.println("<h1>Login successful</h1>");
		rd = request.getRequestDispatcher("/Dashboard");
		rd.include(request,response);
		return;
		}
		 out = response.getWriter();

		 out.println("Please Login !!");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
