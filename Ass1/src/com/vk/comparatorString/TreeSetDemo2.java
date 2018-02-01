package com.vk.comparatorString;

import java.util.TreeSet;



public class TreeSetDemo2 
{
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args)
{
	TreeSet t=new TreeSet(new MyComparator2());
	t.add(new StringBuffer("Ankit"));
	t.add(new StringBuffer("Vinit"));
	t.add(new StringBuffer("Raju"));
	t.add(new StringBuffer("Sahu"));
	System.out.println(t);
}
}
