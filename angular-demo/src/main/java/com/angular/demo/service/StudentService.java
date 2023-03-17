package com.angular.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angular.demo.model.Student;
import com.angular.demo.repository.StudentRepository;

@Service
public class StudentService 
{

	@Autowired
	private StudentRepository studRepo;
	
	public List<Student> fetchAllStudents() {
		return studRepo.getAllStudents();
	}

	public List<Student> getStudentByName(int marks)
	{
		return studRepo.getAllStudents().stream().filter((stud)->stud.getMarks()>marks).collect(Collectors.toList());
	}

	public List<Student> getStudentByFee(int fee) {
		return studRepo.getAllStudents().stream().filter((stud)->stud.getFee()>fee).collect(Collectors.toList());
	}

}
