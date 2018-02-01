package com.vk.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box implements Serializable
{

/**
	 * 
	 */
	private static final long serialVersionUID = -6836578639157847734L;
@SuppressWarnings("unused")
private int width;
@SuppressWarnings("unused")
private int height;
public void setWidth(int w)
{
	width=w;
}
public void setHeight(int h)
{
	height=h;
}
public static void main(String [] args)
{
	Box myBox=new Box();
	myBox.setWidth(50);
	myBox.setHeight(70);
	try
	{
		FileOutputStream fs=new FileOutputStream("d://foo.ser");
		ObjectOutputStream os=new ObjectOutputStream(fs);
		os.writeObject(myBox);
		os.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
