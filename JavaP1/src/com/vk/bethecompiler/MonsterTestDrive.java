package com.vk.bethecompiler;

public class MonsterTestDrive {

	public static void main(String[] args)
	{
		Monster[] m=new Monster[3];
		m[0] =new Vampire();
		System.out.println(m[0].hashCode());
		m[1]= new Dragon();
		System.out.println(m[1].getClass());
		m[2] =new Monster();
		System.out.println(m[2].toString());
		for(int x = 0; x < 3; x++) 
		{
			m[x].frighten(x);
		}
	}

}
