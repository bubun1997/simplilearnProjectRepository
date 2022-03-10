package com.soumya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DashboardServlet
 */
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DashboardServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession userSession = request.getSession(false);
		PrintWriter out = null;
		RequestDispatcher rd = null;
		if(userSession != null) {
//			String emailId = (String) userSession.getAttribute("email");
			out = response.getWriter();
			out.println("<h1 style='color:green'>Welcome To Dashboard</h1>");
			out.println("<a href='logout'><button>Logout</button></a>");
			return;
		}
		
		out = response.getWriter();
		rd = request.getRequestDispatcher("Login.html");
		rd.include(request, response);
		out.println("<h1 style='color:red'>Please Login to access dashboard</h1>");

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
