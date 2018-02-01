package com.vk.comparatorString;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class MyComparator2 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		String s1=o1.toString();
		String s2=o2.toString();
		return s1.compareTo(s2);
	}

}
