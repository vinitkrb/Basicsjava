package com.vk.comparatorMix;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class MyComparatorMix implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		int length1=s1.length();
		int length2=s2.length();
		if(length1<length2)
			return -1;
		else if(length1>length2)
			return +1;
		else
			return s1.compareTo(s2);
	}

}
