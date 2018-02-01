package com.hm.vk.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx 
{
public static void main(String[] args) throws IOException 
	{
		Student s1 =new Student(211,"ravi");  
		  
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("d://serialization.ser"));  
		out.writeObject(s1);  
	    out.close();  
		System.out.println("success");  
	}

}
