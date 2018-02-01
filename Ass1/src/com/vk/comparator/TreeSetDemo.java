package com.vk.comparator;

import java.util.TreeSet;

public class TreeSetDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		TreeSet t=new TreeSet(new MyComparator());
		t.add(0);
		t.add(5);
		t.add(10);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}

}
