package com.vk.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient
{
public void go()
{
	try
	{
		@SuppressWarnings("resource")
		Socket s=new Socket("127.0.0.1",4242);
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String advice=br.readLine();
		System.out.println("Today's Advice "+advice);
		br.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public static void main(String [] args)
{
	DailyAdviceClient client=new DailyAdviceClient();
	client.go();
}
}
