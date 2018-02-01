package com.vk.socket;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DAilyAdviceServer
{
	String[] adviceList ={"Take smaller bites","Go for the tight jeans. No they do Not make you look fat.", "One word:inappropriate", 
			"Just for today, be honest. Tell your boss what you *really* think", "You might want to rethink that haircut."};
	public void go()
	{
		try
		{
			@SuppressWarnings("resource")
			ServerSocket ss=new ServerSocket(4242);
			while(true)
			{
				Socket socket=ss.accept();
				PrintWriter writer=new PrintWriter(socket.getOutputStream());
				String advice=getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private String getAdvice() 
	{
		int random=(int) (Math.random()*adviceList.length);
		return adviceList[random];
	}
	public static void main(String[] args)
	{
		DAilyAdviceServer server=new DAilyAdviceServer();
		server.go();
	}
}
