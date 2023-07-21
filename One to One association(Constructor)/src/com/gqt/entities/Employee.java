package com.gqt.entities;

public class Employee 
{
	// Instance variable
	private int empId;
	private String empName;
	private String empAddr;
	// Has-A variable
	private Account acc;
	
	public Employee(int empId, String empName, String empAddr, Account acc) 
	{
		this.empId = empId;
		this.empName = empName;
		this.empAddr = empAddr;
		this.acc = acc;
	}
	
	public void disp()
	{
		System.out.println("Employee details:");
		System.out.println(empId+" "+ empName+" "+ empAddr);
		System.out.println("Accpunt details:");
		System.out.println(acc.getAccNo()+" "+ acc.getAccType()+" "+acc.getAccName());
		
	}
}
