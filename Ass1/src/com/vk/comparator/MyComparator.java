package com.vk.comparator;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class MyComparator implements Comparator 
{
public int compare(Object obj1,Object obj2)
{
	Integer I1=(Integer)obj1;
	Integer I2=(Integer)obj2;
	//compare method for reverse order
	if(I1<I2)
	{
		return +1;
	}
	else if(I1>I2)
	{
		return -1;
	}
	else 
		return 0;
	//just adding - into compareTo method for reverse order
	//return -I1.compareTo(I2);
	//reverse compareTo method for reverse method
	//return I2.compareTo(I1);
	//return +1;//insertion order and duplication because jvm is following your comparator.
    //return -1;//reverse of insertion order
	//return 0;//only 1 elements will be entered others will be cosidered as duplicate.
}
}
