package com.hm.thread;

public class MyRunnableThread implements Runnable
{

	@Override
	public void run() 
	{
		go();
		
	}

	private void go() 
	{
		/*try
		{
			Thread.sleep(2000);
			doMore();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}*/
		doMore();
		
	}

	private void doMore() 
	{
		System.out.println("Thread Example");
	}
}
	class ThreadTester
	{
		public static void main(String [] args)
		{
			Runnable threadJob=new MyRunnableThread();
			Thread myThread=new Thread(threadJob);
			myThread.start();
			System.out.println("Thread Started");
		}
	}


