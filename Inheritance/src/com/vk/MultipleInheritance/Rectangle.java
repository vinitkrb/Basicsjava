package com.vk.MultipleInheritance;

interface InterfaceA 
{
void draw();
void show();
}
 interface InterfaceB
{
	 void area(int length,int width);
	 void parameter(int length,int width);
	 
}
 public class Rectangle implements InterfaceA,InterfaceB
 {
	 
	@Override
	public void area(int length,int width) {
		int area=length*width;
		System.out.println("Area: "+area);
	}

	@Override
	public void parameter(int length,int width) {
		int parameter=2*(length+width);
		System.out.println("Parameter "+parameter);
	}

	@Override
	public void draw() {
		System.out.println("Drawing");
	}

	@Override
	public void show() {
		System.out.println("Showing");
		
	}
	
 public static void main(String args[])
 {
	 Rectangle r=new Rectangle();
	    r.draw();
		r.parameter(20,30);
		r.area(20, 30);
		r.show();
		
 
}
 }