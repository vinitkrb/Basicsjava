package com.vk.MultipleThreadEx;

public class Display 
{
public static synchronized void displayn()
{
	for(int i=0;i<10;i++)
	{
	System.out.println(i);
	}
	try
	{
		Thread.sleep(1000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public static synchronized void displayc()
{
	for(int i=65;i<75;i++)
	{
		System.out.println((char)i);
	}
	try
	{
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
