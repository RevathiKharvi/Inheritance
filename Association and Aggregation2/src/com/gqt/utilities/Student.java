package com.gqt.utilities;

public class Student 
{
	Heart heart = new Heart(100, 289);
	Brain brain = new Brain ("Grayish",1370);
	Bike bike;
	Book book;
	
	public void setBike(Bike bike) 
	{
		this.bike = bike;
	}
	public void setBook(Book book)
	{
		this.book = book;
	}
	
	
	
}
