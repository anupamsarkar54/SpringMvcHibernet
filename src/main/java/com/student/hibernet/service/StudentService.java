package com.student.hibernet.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.student.hibernet.dao.StudentDAO;
import com.student.hibernet.dao.StudentDAOImpl;
import com.student.hibernet.model.Student;

@Component
public class StudentService {
	
	@Autowired
	StudentDAOImpl stdDAO;
	
	@Transactional
	public List<Student> getAllStudent() {
		return this.stdDAO.getAllStudent();
	}

}
