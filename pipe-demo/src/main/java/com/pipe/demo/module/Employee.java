package com.pipe.demo.module;

import java.util.Date;

public class Employee 
{
	private int empID;
	private String empName;
	private String DOB;
	private int salary;
	private Date joiningdate;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empID, String empName, String dOB, int salary, Date joiningdate) {
		super();
		this.empID = empID;
		this.empName = empName;
		DOB = dOB;
		this.salary = salary;
		this.joiningdate = joiningdate;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", DOB=" + DOB + ", salary=" + salary
				+ ", joiningdate=" + joiningdate + "]";
	}
	
	
}
