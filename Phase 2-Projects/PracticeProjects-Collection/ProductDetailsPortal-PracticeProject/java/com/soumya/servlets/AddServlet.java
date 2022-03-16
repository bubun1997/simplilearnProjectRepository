package com.soumya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.soumya.products.Product;

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
		
		String productId = request.getParameter("id"); // Fetching product id entered by the user
		String productName = request.getParameter("name"); // Fetching product name entered by the user
		String productPrice = request.getParameter("price"); // Fetching product price entered by the user
		
		PrintWriter out = null;
		RequestDispatcher rd = null;
		
		// Validation of Product details entered by the user
		if(productId==null || productName==null || productPrice==null) {
			
			out = response.getWriter();
			rd = request.getRequestDispatcher("Home.jsp");
			rd.include(request, response);
			out.println("<h1 style='color:red'>Please provide details of the product !!</h1>");
			return;
			
		}
		
		// Validation of Product details entered by the user
		else if(productId.isEmpty() || productName.isEmpty() || productPrice.isEmpty()) {
			out = response.getWriter();
			rd = request.getRequestDispatcher("Home.jsp");
			rd.include(request, response);
			out.println("<h1 style='color:red'>Empty Fields !!</h1>");
			return;
		}
		
		Product pro = new Product(); // Creating Product class Instance
		HttpSession session = request.getSession(); // Getting current Session instance
		session.setAttribute("product", pro); // Adding our Product instance to the current session
		
		Date date = new Date();
		Timestamp time = new Timestamp(date.getTime()); // Generating current Timestamp
		
		// Setting attribute values of our product , which is added to the current session based on the values provided by the user
		pro.setProductId(Integer.parseInt(productId));
		pro.setProductName(productName);
		pro.setProductPrice(Double.parseDouble(productPrice));
		pro.setDateAdded(time);
		
		out = response.getWriter();
		rd = request.getRequestDispatcher("View.jsp");
		out.println("<h1 style='color:green'>Product added successfully !!</h1>");
		rd.include(request, response); // Forwarding request to the View.jsp page
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
