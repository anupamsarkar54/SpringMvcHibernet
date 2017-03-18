package com.student.hibernet.dao;

import java.util.List;

import com.student.hibernet.model.Student;

public interface StudentDAO {
	public String addStudent(Student std);
	public Student getStudent(int Id);
	public List<Student> getAllStudent();
}
