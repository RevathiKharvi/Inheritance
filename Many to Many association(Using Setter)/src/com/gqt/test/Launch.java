package com.gqt.test;

import com.gqt.enities.Employee;
import com.gqt.enities.Project;

public class Launch {

	public static void main(String[] args) 
	{
		Project prj1 = new Project();
		prj1.setpId(3);
		prj1.setpName("Vensorlinks");
		prj1.setpMgr("Senthil");
		Project prj2 = new Project();
		prj2.setpId(7);
		prj2.setpName("Maya");
		prj2.setpMgr("Ramana");
		Project prj3= new Project();
		prj3.setpId(11);
		prj3.setpName("Loves");
		prj3.setpMgr("Abhishek");
		Employee emp1 = new Employee();
		emp1.setEmpId(23);
		emp1.setEmpName("Nandish");
		emp1.setProjects(prj1,prj2);
		Employee emp2 = new Employee();
		emp2.setEmpId(26);
		emp2.setEmpName("Shafi");
		emp2.setProjects(prj2,prj3);
		Employee emp3 = new Employee();
		emp3.setEmpId(32);
		emp3.setEmpName("Sneha");
		emp3.setProjects(prj1,prj2,prj3);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);




	}

}
