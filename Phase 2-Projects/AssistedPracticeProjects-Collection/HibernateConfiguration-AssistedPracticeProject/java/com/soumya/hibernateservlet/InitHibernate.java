package com.soumya.hibernateservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.soumya.hibernateutil.ecommerce.HibernateUtil;

/**
 * Servlet implementation class InitHibernate
 */
public class InitHibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitHibernate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
                PrintWriter out = response.getWriter();
                out.println("<html><body>");

                SessionFactory factory = HibernateUtil.getSessionFactory();
                       
                Session session = factory.openSession();
                out.println("<h3 style='color:green'>Hibernate Session opened</h3>");
                session.close();
                out.println("<h3 style='color:blue'>Hibernate Session closed.</h3><br>");
                       
                out.println("</body></html>");
                   
                    
                } catch (Exception ex) {
                        throw ex;
                }



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
