package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test 
{
public static void main(String [] args)
{
	SerializationAndDeserialization s=new SerializationAndDeserialization();
	System.out.println(s.getX()+" "+s.gety()+" "+s.getZ());
	try
	{
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("d://serializ.ser"));
		os.writeObject(s);
		os.close();
		ObjectInputStream is=new ObjectInputStream(new FileInputStream("d://serializ.ser"));
		s=(SerializationAndDeserialization)is.readObject();
		is.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	System.out.println(s.getX()+" "+s.gety()+" "+s.getZ());
}
}
