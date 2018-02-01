package com.vk.HiererichalInheritance;

public class Main 
{
public static void main(String [] args)
{
	System.out.println("My Car");
	Car c=new Car();
	c.attributes("White", 120, 500000);
	c.carAttributes(20,"Swift-Desire");
	System.out.println("My Bike");
	Bike b=new Bike();
	b.attributes("Black", 140, 950000);
	b.bikeAttributes(40, 60,"Avengers");
}
}
