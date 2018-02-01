package com.vk.synchronizationEx;

public class Main {

	public static void main(String[] args)
	{
		Sender send = new Sender();
		SendMsgUsingThread S1 =
			new SendMsgUsingThread( " Hi " , send );
		SendMsgUsingThread S2 =
			new SendMsgUsingThread( " Bye " , send );
		
		S1.start();
		S2.start();
		
		
		try
		{
			S1.join();
			S2.join();
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}
	}

}
