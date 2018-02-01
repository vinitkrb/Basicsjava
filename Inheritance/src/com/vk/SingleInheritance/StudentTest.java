package com.vk.SingleInheritance;

public class StudentTest extends Student
{
String state;
String city;

public void studentAddress(String state,String city)
{
	System.out.println("State: "+state);
	System.out.println("City "+city);
}
public static void main(String [] args)
{
	StudentTest s=new StudentTest();
	s.studentDetails(1209007, 1209007, "Vnit");
	s.studentAddress("Bihar","Barbigha");
}
}
