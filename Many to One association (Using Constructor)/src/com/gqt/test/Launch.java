package com.gqt.test;

import com.gqt.entities.Branch;
import com.gqt.entities.Employee;

public class Launch {

	public static void main(String[] args) 
	{
		Branch branch = new Branch(6, "YLNK");
		Employee emp1 = new Employee(18, "Sachin",branch);
		Employee emp2 = new Employee(23, "Virat",branch);
		Employee emp3 = new Employee(34, "Dhoni",branch);
		emp1.disp();
		System.out.println();
		emp2.disp();
		System.out.println();
		emp3.disp();


	}

}
