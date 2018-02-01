package com.vk.binarySearch;

import java.util.Scanner;

public class BinarySearch
{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		int n,first,last,mid,search;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Elements");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" Integers in asecnding order.");
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		System.out.println("Enter the value to search");
		search=sc.nextInt();
		first=0;
		last=n-1;
		mid=(first+last)/2;
		while(first<=last)
		{
			if(a[mid]<search)
			
				first=mid+1;
			else if(a[mid]==search)
			{
				System.out.println(search+" found at location "+(mid));
				break;
			}
			else
			
				last=mid-1;
			mid=(first+last)/2;
		}
		if ( first > last )
	          System.out.println(search + " is not found.\n");
	}

}
