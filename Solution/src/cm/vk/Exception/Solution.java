package cm.vk.Exception;

import java.util.*;

	public class Solution 
	{
    public static void main(String[] args)
	      {
	        Scanner scan = new Scanner(System.in);
			try
	        {
				System.out.println("Enter 2 integers a and b to find a/b");
				int a = scan.nextInt();
				int b = scan.nextInt();
				int c = a/b;
				System.out.println(c);
			} 
	                catch (Exception e) 
	                {
	                String s = e.getClass().getCanonicalName();
	                if (s=="java.lang.ArithmeticException")
	                {
	                    s+= ": / by zero";                
	                }
	                System.out.println(s);
	            }
			scan.close();
	        }
	}

