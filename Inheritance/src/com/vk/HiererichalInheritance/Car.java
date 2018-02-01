package com.vk.HiererichalInheritance;

public class Car extends Vechile
{
	int mileage;
	String model;
	public void carAttributes(int mileage,String model)
	{
		System.out.println("Mileage:"+mileage);
		System.out.println("Model: "+model);
	}
}
