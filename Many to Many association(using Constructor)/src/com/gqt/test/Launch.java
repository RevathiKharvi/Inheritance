package com.gqt.test;

import com.gqt.entities.*;

public class Launch {

	public static void main(String[] args) 
	{
		Project prj1 = new Project(3,"Vendorlink","Senthil");
		Project prj2 = new Project(7,"Maya","Ramana");
		Project prj3 = new Project(11,"Loves","Abhishek");
		
		Employee emp1 = new Employee(23,"Nandish",prj1,prj2);
		Employee emp2 = new Employee(26,"Shafi",prj2,prj3);
		Employee emp3 = new Employee (32,"Sneha",prj1,prj2,prj3);
		emp1.disp();
		emp2.disp();
		emp3.disp();



	}

}
