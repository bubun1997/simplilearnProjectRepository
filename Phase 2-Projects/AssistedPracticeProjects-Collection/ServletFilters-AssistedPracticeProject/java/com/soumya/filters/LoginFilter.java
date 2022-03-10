package com.soumya.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
			String userId = request.getParameter("userid");
			PrintWriter out = response.getWriter();

			if(userId != null && userId.equalsIgnoreCase("SOUMYAJIT"))
			{
				out.println("LOGIN FILTER PASSED SUCCESSFULLY");
				chain.doFilter(request, response);
				return;
			}
//		RequestDispatcher rd=request.getRequestDispatcher("Index.html");
			
		out.println("You need to Login first!!");
			
//		rd.forward(request, response);
	}

}
