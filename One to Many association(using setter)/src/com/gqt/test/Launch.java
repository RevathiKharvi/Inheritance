package com.gqt.test;

import com.gqt.entities.Department;
import com.gqt.entities.Employee;

public class Launch {

	public static void main(String[] args) 
	{
		Department dept= new Department();
		dept.setDeptId(123);
		dept.setDeptName("BCCI");
		dept.setDeptLoc("Dubai");		
		Employee [] emp= new Employee[3];
		dept.setEmployee(emp);
		Employee emp1= new Employee();		
		emp[0]=emp1;
		emp1.setEmpId(13);
		emp1.setEmpName("Sachin");
		Employee emp2= new Employee();
		emp[1]=emp2;
		emp2.setEmpId(24);
		emp2.setEmpName("Virat");
		Employee emp3= new Employee();
		emp[2]=emp3;
		emp3.setEmpId(40);
		emp3.setEmpName("Zabi");
		System.out.println(dept);
		
	}

}
