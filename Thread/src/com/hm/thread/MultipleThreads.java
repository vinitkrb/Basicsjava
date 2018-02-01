package com.hm.thread;

public class MultipleThreads implements Runnable 
{

	@Override
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			String threadName=Thread.currentThread().getName();
			System.out.println(threadName+" Running.");
		}
		
	}
	public static void main(String [] args)
	{
		MultipleThreads m=new MultipleThreads();
		Thread A=new Thread(m);
		Thread B=new Thread(m);
		Thread C=new Thread(m);
		A.setName("Thread A Started");
		B.setName("Thread B started");
		C.setName("Thread C started");
		A.start();
		try
		{
			A.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		B.start();
		try
		{
			B.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		C.start();
	}

}
