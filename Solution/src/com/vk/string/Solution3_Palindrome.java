package com.vk.string;

import java.util.*;

public class Solution3_Palindrome
{

   
	public static void main(String[] args) 
	{
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word to check palindrome");
        String A=sc.next();
        String rev = new StringBuffer(A).reverse().toString();

    if(A.equals(rev))
    {
        System.out.println("Yes");
    }
    else
    {
        System.out.println("No");
    }
        sc.close();
    }
}

