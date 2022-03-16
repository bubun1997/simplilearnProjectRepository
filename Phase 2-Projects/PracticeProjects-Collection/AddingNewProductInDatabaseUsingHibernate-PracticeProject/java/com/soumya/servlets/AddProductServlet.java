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

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.soumya.hibernateutil.HibernateUtil;
import com.soumya.product.Product;

/**
 * Servlet implementation class AddProductServlet
 */
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
		String productName = request.getParameter("pname");  // Fetching product name provided by the user
		String productPrice = request.getParameter("price"); // Fetching product provided by the user
		
		RequestDispatcher rd = null;
		PrintWriter out = null;
		if(productName==null || productPrice==null) {
			
			out = response.getWriter();
			rd = request.getRequestDispatcher("Home.jsp");
			rd.include(request, response);
			out.println("<h1 style='color:red'>please provide details !!</h1>");
			return;
			
		}
		else if(productName.equals("") || productPrice.equals("")) {
			
			out = response.getWriter();
			rd = request.getRequestDispatcher("Home.jsp");
			rd.include(request, response);
			out.println("<h1 style='color:red'>Fields can't be empty !!</h1>");
			return;
			
		}
		
		try {
			
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); // Getting SessionFactory class instance
			
			Session session = sessionFactory.openSession(); // Opening a new Session
			
			Product product = new Product(); // Creating Product class instance which is to be stored in the database as a record/tuple 
			
			product.setProductName(productName); // setting productName
			product.setProductPrice(Double.parseDouble(productPrice)); // setting productPrice
			
			 Date date= new Date(); // creating Date class instance of util package
			 long time = date.getTime(); // Fetching current Time 
			 Timestamp ts = new Timestamp(time); // creating  Timestamp class instance based upon current Time
			 
			 product.setDateAdded(ts); // setting addedDate
			 
			 Transaction trans = session.beginTransaction(); // Begin a Transaction
			 
			 session.save(product); // Moving our Product instance from Transient to the Persistent State
			 
			 trans.commit(); // storing our Product to the database permanently 
			
			 session.close(); // Closing current Session
			 
			 
			 out = response.getWriter();
			 out.println("<h1 style='color:green'>Product Added To the database</h1><br>");
			 
			 out.println("<a href='View.jsp'><button>View products</button></a>");
			
			
		}
		
		catch(Exception e) {
			throw e;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
