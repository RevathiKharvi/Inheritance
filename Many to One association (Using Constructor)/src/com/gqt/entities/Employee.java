package com.gqt.entities;

public class Employee 
{
	// Instance variable
	private int empId;
	private String empName;
	
	//HAS-A variable
	private Branch branch;

	public Employee(int empId, String empName, Branch branch) 
	{
		this.empId = empId;
		this.empName = empName;
		this.branch = branch;
	}
	
	public void disp()
	{
		System.out.println("Employee details:");
		System.out.println(empId+" "+ empName );
		System.out.println("Branch details:");
		System.out.println(branch.getbId()+" "+branch.getbLoc());

	}
	
	
}
