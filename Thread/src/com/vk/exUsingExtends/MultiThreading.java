package com.vk.exUsingExtends;


class MultiThreadDemo extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Thread "+Thread.currentThread().getId()+" is Running");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class MultiThreading
{
public static void main(String[] args)
{
	int n=8;
	for(int i=0;i<n;i++)
	{
		MultiThreadDemo demo=new  MultiThreadDemo();
		demo.start();
	}
}
}
