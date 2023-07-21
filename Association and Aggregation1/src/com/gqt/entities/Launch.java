package com.gqt.entities;

public class Launch {

	public static void main(String[] args) 
	{
		Charger chg = new Charger("Samsung",22.5);
		Mobile m= new Mobile();
		m.setCharger(chg);
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		System.out.println(m.charger.getBrand());
		System.out.println(m.charger.getVoltage());
		
	}

}