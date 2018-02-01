package com.vk.RyanAndMonicaEx;

public class RyanAndMonica implements Runnable
{
private BankAccount acc=new BankAccount();
public static void main(String [] args)
{
	RyanAndMonica rm=new RyanAndMonica();
	Thread one=new Thread(rm);
	Thread two=new Thread(rm);
	one.setName("Ryan");
	two.setName("Monica");
	one.start();
	two.start();
}
	@Override
	public synchronized void run()
	{
		for(int i=0;i<=10;i++)
		{
			makeWithdrawal(10);
			if(acc.getBalance()<0)
			{
				System.out.println("OverDrawn");
			}
		}
		
	}
	private synchronized void makeWithdrawal(int amount)
	{
		if(acc.getBalance()>=amount)
		{
			System.out.println(Thread.currentThread().getName()+" is about to withdraw.");
			try
			{
				System.out.println(Thread.currentThread().getName()+" is going to sleep");
				Thread.sleep(500);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" Woke up");
			acc.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+" Completes the Withdrawl.");
		}
		else
		{
			System.out.println("Sorry Not Enough For "+Thread.currentThread().getName());
		}
		
	}
	
}

