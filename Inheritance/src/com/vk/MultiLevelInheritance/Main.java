package com.vk.MultiLevelInheritance;

public class Main
{
public static void main(String [] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException
{
	System.out.println("Calling Flat Class Objects");
	Flat f=(Flat) Class.forName("com.vk.MultiLevelInheritance.Flat").newInstance();
	f.flatAttributes(5,6,7);
	f.appartmentAttributes(2, 2);
	f.buildingAttributes(4, "Red", 600);
	System.out.println("Calling Appartment Objects");
	Appartment a=new Appartment();
	a.appartmentAttributes(45, 45);
	a.buildingAttributes(100, "blue", 56980);
}
}
