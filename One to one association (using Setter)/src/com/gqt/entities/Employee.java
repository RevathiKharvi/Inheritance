package com.gqt.entities;

public class Employee 
{
	// Instance variable
		private int empId;
		private String empName;
		private String empAddr;
		// Has-A variable
		private Account acc;
		

		public void setEmpId(int empId) 
		{
			this.empId = empId;
		}
		
	public void setEmpName(String empName) 
		{
			this.empName = empName;
		}

	public void setEmpAddr(String empAddr) 
		{
			this.empAddr = empAddr;
		}

		public void setAcc(Account acc) 
		{
			this.acc = acc;
		}



		public String toString()
		{
			return "Employee details:"+'\n'+empId+" "+empName+" "+empAddr+'\n'+'\n'+"Account details:"+'\n'
		      +acc.getAccNo()+" "+acc.getAccType()+" "+acc.getAccName();
		}

}
