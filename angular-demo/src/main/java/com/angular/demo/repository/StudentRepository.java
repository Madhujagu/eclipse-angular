package com.angular.demo.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.angular.demo.model.Student;

@Component
public class StudentRepository 
{
	public List<Student> studList=Arrays.asList(
			new Student(101,"Madhu",89,89000),
			new Student(102,"AB-Devilliers",78,69000),
			new Student(103,"Ashwin",77,39000),
			new Student(104,"Virat",47,49000),
			new Student(105,"Ajay",57,59000),
			new Student(106,"Zabiulla",67,55000),
			new Student(107,"Sandy",63,29000),
			new Student(108,"Varun",37,19000),
			new Student(109,"Rakesh",84,25000),
			new Student(110,"Akash",55,70000));
	
	public List<Student> getAllStudents()
	{
		return studList;
	}
}
