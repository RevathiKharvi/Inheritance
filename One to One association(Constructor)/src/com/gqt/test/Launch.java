package com.gqt.test;

import com.gqt.entities.*;

public class Launch {

	public static void main(String[] args) 
	{
         Account a= new Account(1218,"Savings","Revathi");
        Employee emp = new Employee(118,"Revathi","Bangalore",a);
        emp.disp();
	}

}
