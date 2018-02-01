package com.vk.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class BoxDeserialization 
{
public static void main(String [] args)
{
	
	try
	{
		FileInputStream fs=new FileInputStream("d://foo.ser");
		ObjectInputStream os=new ObjectInputStream(fs);
		Box b=(Box)os.readObject();
		System.out.println(b.getClass());
		os.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
}
}
