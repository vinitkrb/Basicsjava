package com.hm.vk.Transient;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization 
{
	public static void main(String args[])throws Exception
	{  
		  Student s1 =new Student(211,"ravi",22);//creating object  
		  //writing object into file  
		 
		  ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("d://transient.txt"));  
		  out.writeObject(s1);  
		  out.flush();  
		  out.close();  
		 System.out.println("success");  
}
}