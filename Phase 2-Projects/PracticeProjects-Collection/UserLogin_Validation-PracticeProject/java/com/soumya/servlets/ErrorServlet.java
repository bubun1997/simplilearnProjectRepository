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
 * Servlet implementation class ErrorServlet
 */
public class ErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErrorServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession userSession = request.getSession(false);
		PrintWriter out = null;
		RequestDispatcher rd = null;

		if(userSession!=null &&  userSession.getAttribute("email")!=null) {
			   rd = request.getRequestDispatcher("/dashboard");
			   out = response.getWriter();
				out.println("<h1 style='color:green'>You are already logged in !!</h1>");
				rd.include(request, response);
				return;

		}
		else if(userSession!=null) {
        	out = response.getWriter();
        	out.println("<h1 style='color:red'>Invalid credentials !!</h1>");
			out.println("<a href='Login.html'><button>Re-Login</button></a>");
			userSession.invalidate();
			return;
        }
        
        out = response.getWriter();
		rd = request.getRequestDispatcher("Login.html");
		rd.include(request, response);
		out.println("<h1 style='color:red'>You are not logged in !!</h1>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
