package com.vk.simpleExUsingRunnableInterface;

class MultiThreadDemo implements Runnable
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
public class MultiThread
{
public static void main(String[] args)
{
	int n=8;
	for(int i=0;i<n;i++)
	{
		Thread demo=new Thread(new MultiThreadDemo());
		demo.start();
	}
}
}
