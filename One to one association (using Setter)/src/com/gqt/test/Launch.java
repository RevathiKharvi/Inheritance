package com.gqt.test;

import com.gqt.entities.Account;
import com.gqt.entities.Employee;

public class Launch {

	public static void main(String[] args) 
	{
		  
	      Employee emp = new Employee();
	      emp.setEmpId(118);
	      emp.setEmpName("Revathi");
	      emp.setEmpAddr("Bangalore");
	      Account a= new Account();
	      a.setAccNo(1218);
	      a.setAccType("Savings");
	      a.setAccName("Revathi");
	      // performing dependency injection using setter
	      emp.setAcc(a);
	      System.out.println(emp);

	}

}
