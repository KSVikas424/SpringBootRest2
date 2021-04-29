package com.example.demojpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService; 
	
	@RequestMapping("students")
	public List<Student> getStudents(){   //fetching all resources

		return studentService.getStudents();
		
	}
	
	@RequestMapping("students/{id}")
	public Student getStudent(@PathVariable int id) {
		return studentService.getStudent(id);
	}
}