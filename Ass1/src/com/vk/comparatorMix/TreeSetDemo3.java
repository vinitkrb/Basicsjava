package com.vk.comparatorMix;

import java.util.TreeSet;

public class TreeSetDemo3 
{
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String [] args)
{
	TreeSet t=new TreeSet(new MyComparatorMix());
	t.add("A");
	t.add( new StringBuffer("Vinit"));
	t.add("xxx");
	t.add(new StringBuffer("AAA"));
	t.add("ABCD");
	t.add("A");
	System.out.println(t);
}
}
