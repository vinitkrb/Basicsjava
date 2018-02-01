package com.vk.bethecompiler;

public class Monster
{
	boolean frighten(int z) 
	{
		System.out.println("arrrgh");
		return true;
	}
}
class Vampire extends Monster
{
	boolean frighten(int x)
	{
		System.out.println("a bite?");
		return true;
    }
}
class Dragon extends Monster 
{
boolean frighten(int degree) 
{
	System.out.println("breath fire");
	return true;
}
}
