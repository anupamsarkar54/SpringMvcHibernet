package com.student.hibernet.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.hibernet.model.Student;
@Repository
public class StudentDAOImpl implements StudentDAO{
	@Autowired
	private SessionFactory sessionFactory ;
	


	public String addStudent(Student std) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student getStudent(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getAllStudent() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Student> stdList = session.createQuery("from Student").list();
		for(Student p : stdList){
			System.out.println("Person List::"+p);
		}
		return stdList;
		
	}

}
