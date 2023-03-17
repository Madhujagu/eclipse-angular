package com.angular.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.angular.demo.model.Student;
import com.angular.demo.service.StudentService;

@RestController
public class StudentController 
{	
	@Autowired
	StudentService studService;
	
	@GetMapping("/all")
	@CrossOrigin("http://localhost:4200")
	public List<Student> getAllStudents()
	{
		return studService.fetchAllStudents();
	}
	
	@GetMapping("/search")
	@CrossOrigin("http://localhost:4200")
	public List<Student> getStudentByMarks(@RequestParam int marks)
	{
		return studService.getStudentByName(marks);
	}
	
	@GetMapping("/searchByFee")
	@CrossOrigin("http://localhost:4200")
	public List<Student> getStudentByFee(@RequestParam int fee)
	{
		return studService.getStudentByFee(fee);
	}
}
