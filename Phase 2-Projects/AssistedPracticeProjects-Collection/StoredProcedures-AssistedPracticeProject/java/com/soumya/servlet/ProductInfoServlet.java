package com.soumya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
 * Servlet implementation class ProductInfoServlet
 */
public class ProductInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection con = DBConnection.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Bubun1234");
			Statement stmt = con.createStatement();
			PrintWriter out = null;
			
			ResultSet result = stmt.executeQuery("select * from eproduct");
             Map<Integer,Product> map = new LinkedHashMap<Integer,Product>();
             int count=1;
             boolean flag=false;           

             while(result.next()) {
            	 Product pro = new Product();
            	 pro.setProductId(result.getInt(1));
            	 pro.setProductName(result.getString(2));
            	 pro.setProductPrice(result.getInt(3));
            	 pro.setDateOfPurchase(result.getDate(4));
            	 map.put(count++, pro);
            	 flag=true;
            	 
             }

            if(!flag) {
             out = response.getWriter();
			 out.println("<h1 style='color:red'>No Products available!!</h1><br>");
			 con.close();
			 out.println("<a href='Index.html'><button>Go Back</button></a>");
			 return;
            }
//            HttpSession session = request.getSession();
            request.setAttribute("pdetails", map);
            RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
            rd.forward(request, response);
//            response.sendRedirect("View.jsp");
            
			
             
             
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			  Connection con = DBConnection.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Bubun1234");
                
			  CallableStatement cst = con.prepareCall("{call product_proc(?,?,?,?)}");
				cst.setInt(1, Integer.parseInt(request.getParameter("id")));
				cst.setString(2, request.getParameter("name"));
				cst.setInt(3, Integer.parseInt(request.getParameter("price")));

				cst.setDate(4, new java.sql.Date(new java.util.Date().getTime()));
//				pst.setString(5, "dd/mm/yy");


				cst.executeUpdate();

				PrintWriter out = response.getWriter();
				out.println("<h1 style='color:green'>Product Addedd successfully Through Stored Procedure...</h1>");
				out.println("<br><br>");
				con.close();
				out.println("<a href='Index.html'><button>Go Back</button></a>");

				
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
