package com.vk.MultipleThreadEx;
class MyThread1 extends Thread
{
	Display d;
	MyThread1(Display d)
	{
		this.d=d;
	}
	public void run()
	{
		Display.displayn();
	}
}
class MyThread2 extends Thread
{
	Display d;
	MyThread2(Display d)
	{
		this.d=d;
	}
	public void run()
	{
		Display.displayc();
	}
}
public class SynchronizedDemo1
{
	public static void main(String [] args)
	{
		Display d=new Display();
		MyThread1 t1=new MyThread1(d);
		MyThread2 t2=new MyThread2(d);
		t1.start();
		t2.start();
	}
}