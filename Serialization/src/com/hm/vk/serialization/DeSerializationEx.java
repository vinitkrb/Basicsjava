package com.hm.vk.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationEx
{
	public static void main(String args[])throws Exception
	{  
	    ObjectInputStream in=new ObjectInputStream(new FileInputStream("d://serializatio.ser"));  
		Student s=(Student)in.readObject();  
		System.out.println(s.id+" "+s.name);  
		in.close();  
}
}
