package com.pipe.demo.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pipe.demo.module.Employee;

@RestController
public class EmployeeController 
{
	@GetMapping("/all")
	@CrossOrigin(origins="*")
	public List<Employee> getAllEmployees()
	{
		return Arrays.asList(new Employee(101,"Madhu","1999-03-30",45000,new Date()),
							new Employee(102,"Sandy","1995-02-18",65000,new Date()),
							new Employee(103,"Harsith","1997-08-25",55000,new Date()),
							new Employee(104,"Varun","1998-06-21",75000,new Date()));
	}
}
