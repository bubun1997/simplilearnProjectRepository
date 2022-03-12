package com.soumya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soumya.dbutil.DBConnection;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
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
				psmt = con.prepareStatement("delete from eproduct where pid=?");
				psmt.setInt(1, id);
				psmt.executeUpdate();
				out=response.getWriter();
				out.println("<h1 style='color:green'>Product Deleted successfully!!</h1>");
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
