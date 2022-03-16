package com.soumya.addservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.soumya.hibernateutil.HibarnateUtil;
import com.soumya.products.EProduct;

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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  SessionFactory factory = HibarnateUtil.getSessionFactory();
          
          Session session = factory.openSession();
          
          Transaction trans = session.beginTransaction();
          
          EProduct product = new EProduct();
          
          product.setProductName(request.getParameter("pname"));
          product.setProductPrice(Double.parseDouble(request.getParameter("price")));
          
          session.save(product);
          trans.commit();
          session.close();
          PrintWriter out = response.getWriter();
          out.println("<h1 style='color:green'>Product Added...</h1><br><br>");
          out.println("<a href='list'><button>View Products</button></a>");
          
          
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
