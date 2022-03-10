package com.soumya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
		
		   String userEmailId = request.getParameter("email");
		   String userPassword = request.getParameter("password");
		   
		   RequestDispatcher rd = null;
		   PrintWriter out = null;

		   if(request.getSession(false)!=null) {
			   rd = request.getRequestDispatcher("/dashboard");
			   rd.forward(request, response);
			   return;
			   
		   }
		   
		   if(userEmailId==null || userPassword ==null) {
			   rd=request.getRequestDispatcher("Login.html");
			   out = response.getWriter();
			   rd.include(request, response);
			   out.println("<h1 style='color:red'>Please provide your credentials !!</h1>");

			   return;
		   }
		   else if(userEmailId.equals("") || userPassword.equals("")) {
			   rd=request.getRequestDispatcher("Login.html");
			   out = response.getWriter();
			   rd.include(request, response);
			   out.println("<h1 style='color:red'>Email-Id or password can't be empty !!</h1>");

			   return;
		   }
		   
		   
		   Map<String,String> mapObject = new HashMap<String,String>();
		   HttpSession userSession = request.getSession();

		   mapObject.put("soumyajit4banerjee@gmail.com", "abc@1234");
		   mapObject.put("Tom_123@gmail.com", "TOM_9999");
		   mapObject.put("Mark_456@rediffmail.co.in", "tiger012");
		   mapObject.put("Jenny$mj_888@yahoo.com", "Jen$123");
	   
		   Set<Entry<String,String>> setOfEntries = mapObject.entrySet();
		   
		   for(Entry<String,String> entries:setOfEntries) { 
			   String email = entries.getKey();
			   String password = entries.getValue();
			   
			   if(userEmailId.equalsIgnoreCase(email) && userPassword.equals(password)) {
				   
				   userSession.setAttribute("email", userEmailId);
				   rd = request.getRequestDispatcher("/dashboard");
				   rd.forward(request, response);
				   return;
			   }
		   }

          response.sendRedirect("error");		   
		  
	   
	   }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
