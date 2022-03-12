package com.soumya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soumya.dbutil.DBConnection;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection con = DBConnection.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Bubun@1234");
			
			int id=Integer.parseInt(request.getParameter("id"));
			
			PreparedStatement psmt = con.prepareStatement("select * from eproduct where pid=?");
			psmt.setInt(1, id);
			
			ResultSet rs = psmt.executeQuery();
			PrintWriter out = null;
			
			if(rs.next()) {
				psmt = con.prepareStatement("update eproduct set pname=? , price=? where pid=?");
				psmt.setString(1, request.getParameter("name"));
				psmt.setDouble(2, Double.parseDouble(request.getParameter("price")));
//				psmt.setDate(3, new java.sql.Date(new java.util.Date().getTime()));
				psmt.setInt(3, id);
				
				psmt.executeUpdate();
				
				out=response.getWriter();
				out.println("<h1 style='color:green'>Product Updated successfully!!</h1>");

				con.close();
				 out.println("<a href='read'><button>View Products</button></a><br><br>");
				   out.println("<a href='Index.html'><button>Go back To Home Page</button></a>");
				   return;
				
			}
			
			out=response.getWriter();
			out.println("<h1 style='color:red'>Sorry No Product is Available with this Id !!</h1>");
			   con.close();

			 out.println("<a href='read'><button>View Products</button></a><br><br>");
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
