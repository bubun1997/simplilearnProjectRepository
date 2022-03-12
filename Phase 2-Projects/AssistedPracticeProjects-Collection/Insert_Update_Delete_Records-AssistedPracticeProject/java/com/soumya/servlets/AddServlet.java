package com.soumya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soumya.dbutil.DBConnection;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection con = DBConnection.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Bubun@1234");
			
			PreparedStatement pstmt = con.prepareStatement("insert into eproduct (pname,price) values (?,?)");
			
			pstmt.setString(1, request.getParameter("name"));
			pstmt.setDouble(2, Double.parseDouble(request.getParameter("price")));
//			pstmt.setDate(3, new java.sql.Date(new java.util.Date().getTime()));
			int count = pstmt.executeUpdate();
			
			PrintWriter out = response.getWriter();
			if(count>0) {
			out.println("<h1 style='color:green'>Product addedd successfully!!</h1>");
			   con.close();

			   out.println("<a href='read'><button>View Products</button></a><br><br>");
			   out.println("<a href='Index.html'><button>Go back To Home Page</button></a>");
			   return;
			}
			out.println("<h2 style='color:red'>Something went Wrong!!</h2>");
			con.close();
			   out.println("<a href='Index.html'><button>Go back To Home Page</button></a>");

			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
