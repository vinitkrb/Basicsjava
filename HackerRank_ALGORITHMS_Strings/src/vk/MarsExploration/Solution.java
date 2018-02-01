package vk.MarsExploration;

import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
	    String s = scan.next();
	    int count=0;
	    for(int i=0;i<s.length();i+=3)
	      {
	        char i1=s.charAt(i);
	        char i2=s.charAt(i+1);
	        char i3=s.charAt(i+2);
	        if(!(i1=='S'))
	        	count++;
	        if(!(i2=='O'))
	        	count++;
	        if(!(i3=='S'))
	        	count++;
	      }

	    System.out.println(count);
	    scan.close();
    }
}
