package com.vk.synchronizationEx;

public class SendMsgUsingThread extends Thread
{
private String msg;
@SuppressWarnings("unused")
private Thread t;
Sender sender;
SendMsgUsingThread(String m,Sender obj)
{
	msg=m;
	sender=obj;
}
public void run()
{
sender.send(msg);
}
}
