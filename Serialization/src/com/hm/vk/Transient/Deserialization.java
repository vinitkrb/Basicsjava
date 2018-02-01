package com.hm.vk.Transient;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization 
{
	 public static void main(String args[])throws Exception
	 {  
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("d://transient.txt"));  
		  Student s=(Student)in.readObject();  
		  System.out.println(s.id+" "+s.name+" "+s.age);  
		  in.close();  
		 }  
}
