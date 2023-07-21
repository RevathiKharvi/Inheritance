package com.gqt.utilities;

public class Launch {

	public static void main(String[] args) 
	{
		Bike bike = new Bike("Yamaha",62);
		Book book = new Book("Object-Oriented Programing Language","Danny poo");
		Student student= new Student();
		student.setBike(bike);
		student.setBook(book);
		System.out.println("Heartbeat :" + student.heart.getHeartbeat());
		System.out.println("Weight of a heart :" + student.heart.getWeight());
		System.out.println("colour of a brain :"+ student.brain.getColour());
		System.out.println("Weight of a brain :"+ student.brain.getWeight());
		System.out.println("Brand of a bike :" + student.bike.getBrand());
		System.out.println("Milage of a bike :"+ student.bike.getMilage());
		System.out.println("Author of abook :" + student.book.getAuthor());
		System.out.println("Title of the book :"+ student.book.getTitle());

		
	}

}
