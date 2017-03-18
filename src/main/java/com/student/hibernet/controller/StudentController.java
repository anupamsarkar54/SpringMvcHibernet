package com.student.hibernet.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.hibernet.model.Student;
import com.student.hibernet.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService stdservice;
	
	@RequestMapping(value="/getAllStudent",method=RequestMethod.GET)
	public @ResponseBody List<Student> getAllStudent(){
		List<Student> stdList = new ArrayList<Student>();
		
		return stdservice.getAllStudent();
	}

}
