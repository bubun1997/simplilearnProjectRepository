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
		  String userId = request.getParameter("userid");
	       PrintWriter out=null;

	       if(userId !=null && !userId.equals("") && !userId.equalsIgnoreCase("Null")) {
	    	   HttpSession session = request.getSession();
	    	   session.setAttribute("userid", userId);
	    	   RequestDispatcher rd = request.getRequestDispatcher("/dashboard");
	    	   rd.forward(request, response);
	    	   return;
	       }
	       out=response.getWriter();
			  RequestDispatcher rd=request.getRequestDispatcher("Index.html");
			  out.println("<h1>Please Login to access Dashboard !!</h1>");
			  rd.include(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
