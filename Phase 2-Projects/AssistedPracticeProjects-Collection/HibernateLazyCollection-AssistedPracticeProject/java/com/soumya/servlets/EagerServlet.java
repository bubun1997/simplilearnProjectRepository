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
import com.soumya.subjects.Subject;
import com.soumya.teacher.Teacher;

/**
 * Servlet implementation class EagerServlet
 */
public class EagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EagerServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Teacher teacher1 = new Teacher();
		Teacher teacher2 = new Teacher();
		
		teacher1.setTeacherName("Naina");
		teacher2.setTeacherName("Mahesh");
		
		Subject sub1 = new Subject();
		Subject sub2 = new Subject();
		Subject sub3 = new Subject();
		Subject sub4 = new Subject();
		Subject sub5 = new Subject();

		sub1.setSubjectName("Maths");
		sub2.setSubjectName("Chemistry");
		sub3.setSubjectName("Science");
		sub4.setSubjectName("Computer");
		sub5.setSubjectName("History");

		List<Subject> subjects = new ArrayList();
		
		subjects.add(sub1);
		subjects.add(sub4);
		subjects.add(sub3);
		
		teacher1.setSubjects(subjects);
		
		subjects = new ArrayList();
		subjects.add(sub2);
		subjects.add(sub5);
		
		teacher2.setSubjects(subjects);
		
		sub1.setTeacher(teacher1);
		sub4.setTeacher(teacher1);
		sub3.setTeacher(teacher1);
		
		sub2.setTeacher(teacher2);
		sub5.setTeacher(teacher2);
		
		Session session = sessionFactory.openSession();

		Transaction trans = session.beginTransaction();
		
		session.save(sub5);
		session.save(sub3);
		session.save(sub1);
		session.save(sub2);
		session.save(sub4);
		
		session.save(teacher2);
		session.save(teacher1);

		
		trans.commit();
		
		List<Teacher> list = session.createQuery("from Teacher").list();
		PrintWriter out = response.getWriter();

		for(Teacher teacher:list) {
			for(Subject sub:teacher.getSubjects()) {
				out.println("Id : "+teacher.getTeacherId()+" , Name: "+teacher.getTeacherName()+" , subjectId : "+sub.getSubjectId()+" , subjectName: "+sub.getSubjectName());

				
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
