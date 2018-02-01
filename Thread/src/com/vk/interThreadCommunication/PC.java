package com.vk.interThreadCommunication;

import java.util.LinkedList;

public class PC
{
	 LinkedList<Integer> list = new LinkedList<>();
     int capacity = 2;
public void produce() throws InterruptedException
{
	int value = 0;
   for(int i=0;i<10;i++)
    {
	synchronized(this)
	{
		if (list.size()==capacity)
		
			wait();
			System.out.println("Producer Produced "+value);
			list.add(value++);
			  notify();
			  Thread.sleep(1000);
	}
	}
   
}
public void consume() throws InterruptedException
{
	for(int i=0;true;i++)
{
	synchronized(this)
	{
		if (list.size()==0)
            wait();
		int val = list.removeFirst();
		 
        System.out.println("Consumer consumed-"
                                        + val);

		notify();
		Thread.sleep(2000);
	}
}
}
}
