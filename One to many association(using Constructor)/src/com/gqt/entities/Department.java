package com.gqt.entities;

public class Department 
{
	// Instance variables
	private int deptId;
	private String deptName;
	private String deptLoc;
	
	// HAS-A Variable
	private Employee [] employees;
	
	// performing constructor injection
	public Department(int deptId, String deptName, String deptLoc, Employee[] employees) 
	{
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
		this.employees = employees;
	}
	
	public void disp()
	{
		System.out.println("Department details:");
		System.out.println(deptId+" "+ deptName+" "+ deptLoc);
		System.out.println("Employee details:");
		for(Employee emp: employees)
		{
			System.out.println(emp.getEmpId()+" "+ emp.getEmpName());
			
		}
	}
	
	
	

}
