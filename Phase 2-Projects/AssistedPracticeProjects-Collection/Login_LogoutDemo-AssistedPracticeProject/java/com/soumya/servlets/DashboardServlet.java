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
		 HttpSession session = request.getSession(false);
		  PrintWriter out=null;
		  RequestDispatcher rd=null;
		  
		  if(session!=null) {
			  String userId =(String) session.getAttribute("userid");
			  out = response.getWriter();
			  out.println("<h1>Hello "+userId+" , Welocme to Dashboard, you Logged in to your account successfully...</h1>");
			  out.println("<a href='logout'><button>Logout</button></a>");
			  
			  return;
		  }
		  out=response.getWriter();
		  rd=request.getRequestDispatcher("Index.html");
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
