package com.gqt.test;

import com.gqt.entities.*;

public class Launch {

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee(18,"Sachin");
		Employee emp2 = new Employee(24,"Virat");
		Employee emp3 = new Employee(42,"Zabi");
		
		// Creating an array to perform One to Many association
		
		Employee [] e= new Employee[3];
		e[0]=emp1;
		e[1]=emp2;
		e[2]=emp3;
		
		//Creating Target object using Constructor injection
		
		Department dept = new Department(123,"BCCI","Dubai",e);
		dept.disp();



	}

}
