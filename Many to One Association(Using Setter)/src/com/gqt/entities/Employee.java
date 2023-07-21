package com.gqt.entities;

public class Employee 

{
	// Instance Variable
	private int empId;
	private String empName;
	
	// HAS-A Variable
	private Branch branch;
	
	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	
	
	public void setBranch(Branch branch) 
	{
		this.branch = branch;
	}
	public String toString()
	{
	return "Employee details:"+'\n'+empId+" "+empName+'\n'+"Branch details:"+'\n'+branch.getbId()+" "+branch.getbLoc();
	}
	

}
