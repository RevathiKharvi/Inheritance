package com.gqt.test;

import com.gqt.entities.*;

public class Launch {

	public static void main(String[] args) 
	{
		Branch branch= new Branch();
		branch.setbId(6);
		branch.setbLoc("YLNK");
		Employee emp1= new Employee();
		emp1.setEmpId(18);
		emp1.setBranch(branch);
		emp1.setEmpName("Sachin");
		Employee emp2= new Employee();
		emp2.setBranch(branch);
		emp2.setEmpId(23);
		emp2.setEmpName("Virat");
		Employee emp3= new Employee();
		emp3.setBranch(branch);
		emp3.setEmpId(34);
		emp3.setEmpName("Dhoni");
		System.out.println(emp1);
		System.out.println();
		System.out.println(emp2);
		System.out.println();
		System.out.println(emp3);


		


		
		
	}

}
