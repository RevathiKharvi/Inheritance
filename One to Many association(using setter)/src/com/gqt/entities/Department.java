package com.gqt.entities;

public class Department 
{

	private int deptId;
	private String deptName;
	private String deptLoc;
	private Employee [] employee;
	
	public void setDeptId(int deptId) 
	{
		this.deptId = deptId;
	}
	public void setDeptName(String deptName) 
	{
		this.deptName = deptName;
	}
	public void setDeptLoc(String deptLoc) 
	{
		this.deptLoc = deptLoc;
	}
	public void setEmployee(Employee[] employee) 
	{
		this.employee = employee;
	}
	
	
	public String toString()
	{
		
			        
	String s= "Department details:"+'\n'+deptId+'\n'+deptName+'\n'+deptLoc+'\n'+'\n'+"Employee details:"+'\n';
	for(Employee emp: employee)
	{
		s=s+emp.getEmpId()+'\n';
		s= s+emp.getEmpName()+'\n';
	}
	return s;

	}
}
	


