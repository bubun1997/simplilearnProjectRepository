package com.soumya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.soumya.Student.Student;
import com.soumya.hibernateutil.HibernateUtil;
import com.soumya.laptop.Laptop;

/**
 * Servlet implementation class LazyServlet
 */
public class LazyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LazyServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Student stud1 = new Student();
		Student stud2 = new Student();
		
		stud1.setStudentName("Ram");
		stud2.setStudentName("Shyam");
		
		Laptop lap1 = new Laptop();
		Laptop lap2 = new Laptop();
		Laptop lap3 = new Laptop();
		Laptop lap4 = new Laptop();
		Laptop lap5 = new Laptop();

		lap1.setLaptopName("Lenovo");
		lap2.setLaptopName("Dell");
		lap3.setLaptopName("Asus");
		lap4.setLaptopName("Hp");
		lap5.setLaptopName("Apple");

		List<Laptop> laptops = new ArrayList();
		
		laptops.add(lap1);
		laptops.add(lap4);
		laptops.add(lap3);
		
		stud1.setLaptops(laptops);
		
		laptops = new ArrayList();
		laptops.add(lap2);
		laptops.add(lap5);
		
		stud2.setLaptops(laptops);
		
		lap1.setStudent(stud1);
		lap4.setStudent(stud1);
		lap3.setStudent(stud1);
		
		lap2.setStudent(stud2);
		lap5.setStudent(stud2);
		
		Session session = sessionFactory.openSession();

		Transaction trans = session.beginTransaction();
		
		session.save(lap5);
		session.save(lap3);
		session.save(lap1);
		session.save(lap2);
		session.save(lap4);
		
		session.save(stud2);
		session.save(stud1);

		
		trans.commit();
		
		List<Student> list = session.createQuery("from Student").list();
		PrintWriter out = response.getWriter();

		for(Student stud:list) {
			for(Laptop lap:stud.getLaptops()) {
				out.println("Id : "+stud.getStudentId()+" , Name: "+stud.getStudentName()+" , LaptopId : "+lap.getLaptopId()+" , LaptopName: "+lap.getLaptopName());

				
			}
			out.println("------------------------------------------------------------------------------------------------------------");
		}
		
		session.close();
		

		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
