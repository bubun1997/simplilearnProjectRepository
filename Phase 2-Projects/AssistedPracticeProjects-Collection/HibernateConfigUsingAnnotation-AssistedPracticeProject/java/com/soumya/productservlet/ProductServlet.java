package com.soumya.productservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.soumya.hibernateutil.HibarnateUtil;
import com.soumya.products.EProduct;

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
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  try {
			  SessionFactory factory = HibarnateUtil.getSessionFactory();
              
	             Session session = factory.openSession();
	             PrintWriter out = null;
	             List<EProduct> list = session.createQuery("from EProduct").list();
	            session.close();
	             if(!list.isEmpty()) {
	            	 out = response.getWriter();
	                 out.println("<html><body>");
	                 out.println("<b>Product Listing</b><br>");
	                 for(EProduct p: list) {

	                         out.println("ID: " + p.getProductId() + ", Name: " + p.getProductName() +
	                                         ", Price: " + p.getProductPrice() + ", Date Added: " + p.getDateAdded() + "<br>");
	                 	}
	                 session.close();
	                 return;
	            }
                 session.close();

            	 out = response.getWriter();
                  
            	 out.println("<h1 style='color:red'>No Products available!!</h1><br><br>");
            	 out.println("<a href='Index.html'><button>Go to Home Page</button></a>");
            	 
                
		  }
		  catch(Exception e) {
			  
		  }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
