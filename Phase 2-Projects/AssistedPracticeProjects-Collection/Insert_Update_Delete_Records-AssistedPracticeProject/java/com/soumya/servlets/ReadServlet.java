package com.soumya.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
 * Servlet implementation class ReadServlet
 */
public class ReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection con = DBConnection.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Bubun@1234");
			
			Map<Integer,Product> map = new LinkedHashMap<Integer,Product>();
			System.out.println(con);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from eproduct");
			int count = 1;
			while(rs.next()) {
				Product pro = new Product();
				pro.setProductId(rs.getInt(1));
				pro.setProductName(rs.getString(2));
				pro.setProductPrice(rs.getDouble(3));
				pro.setDateOfPurchase(rs.getTimestamp(4));
				
				
				map.put(count++, pro);
			}
			System.out.println(map);
			request.setAttribute("productdetails", map);
			RequestDispatcher rd = request.getRequestDispatcher("View.jsp");
			rd.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
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
