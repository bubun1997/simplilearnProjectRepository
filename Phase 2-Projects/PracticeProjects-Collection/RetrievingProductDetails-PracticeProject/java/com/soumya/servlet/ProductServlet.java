package com.soumya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soumya.dbutil.DBConnection;
import com.soumya.pojo.Product;
/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		  int productId = Integer.parseInt(request.getParameter("id"));
		  
			try {
				Connection con = DBConnection.getConnection("jdbc:mysql://localhost:3306/eproducts","root","Bubun@1234");
				
				PreparedStatement pst = con.prepareStatement("select * from products where productid=?");
				pst.setInt(1, productId);
				ResultSet rs = pst.executeQuery();
				boolean flag = false;
				  Product pro = null;

				if(rs.next()) {
					  flag = true;
					  
					  pro = new Product();
					  pro.setProductId(rs.getInt(1));
					  pro.setProductName(rs.getString(2));
					  pro.setProductPrice(rs.getDouble(3));
					  pro.setDateOfPurchase(rs.getTimestamp(4));
					  
					  
					  
				}
				if(flag) {
					RequestDispatcher rd = request.getRequestDispatcher("View.jsp");
					request.setAttribute("product", pro);
					rd.forward(request, response);
					return;
				}
				PrintWriter out = response.getWriter();
				out.println("<h1 style='color:red'>Sorry No Products are available with this Id !!</h1>");
				out.println("<br>");
				out.println("<a href='Home.html'><button>Go to Home Page</button></a>");
				
				
				
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
