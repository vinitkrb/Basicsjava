package com.vk.ReverseFile;

import java.util.Arrays;

public class Try 
{
	
       public static void main(String args[] ) throws Exception
		{
    	  
	        int a[] = { 1, 2, 3, 4, 5, 6 };
	        int b[]={7,8,9};
	        if (Arrays.equals(a, b))
	            System.out.println("Same");
	        else
	            System.out.println("Not same");
	        int c[] = Arrays.copyOf(a, a.length+b.length);

 //System.arraycopy(a, 0, c, 0,a.length);
 //System.arraycopy(b, 0, c, a.length,b.length); 
 for(int i=0;i<c.length;i++)
 {
	 System.out.println(c[i]);
 }
	    }
}

