package com.gqt.entities;

public class Employee 
{
	// Instance Variable
	private int empId;
	private String empName;
	
	//HAS-A Variable
	private Project[] projects;

	public Employee(int empId, String empName, Project... projects) 
	{
		this.empId = empId;
		this.empName = empName;
		this.projects = projects;
	}
	
	

	public void disp()
	{
		System.out.println("Employee details:"+'\n'+empId+" "+ empName);
		System.out.println("Project details:");
		for(Project prj:projects)
		{
			System.out.println(prj.getpId()+" "+ prj.getpMgr()+" "+ prj.getpName());
		}
		System.out.println();
	}
	
	

}
