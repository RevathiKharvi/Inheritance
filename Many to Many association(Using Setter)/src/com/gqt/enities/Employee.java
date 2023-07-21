package com.gqt.enities;


public class Employee 
{
	// Instance Variable
		private int empId;
		private String empName;
		
		//HAS-A Variable
		private Project[] projects;

		public void setEmpId(int empId)
		{
			this.empId = empId;
		}

		public void setEmpName(String empName) 
		{
			this.empName = empName;
		}

		public void setProjects(Project... projects) 
		{
			this.projects = projects;
		}
		
		public String toString()
		{
			String s= "Employee details:"+'\n'+empId+" "+empName+'\n'+"Project details:"+'\n';
			for(Project prj: projects)
			{
				s=s+prj.getpId()+" ";
				s= s+prj.getpName()+" ";
				s=s+prj.getpMgr()+'\n';
			}
			return s;

			
		}
		

}
