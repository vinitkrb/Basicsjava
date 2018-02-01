package com.vk.string;

import java.util.*;

public class Solution_1stletterCaps 
{

    
	public static void main(String[] args) 
	{
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 String");
        String A=sc.next();
        String B=sc.next();
//find the length of string A and String B and add both the length.
        System.out.println(A.length()+B.length());
//find the 0th character of String A and String B and checks whether 0th character of A is greater than B, returns true if its greater else return false.
        System.out.println((A.charAt(0) > B.charAt(0)) ? "Yes" : "No");
//find the 1st character of String and convert that character into uppercase.
        String str1 = A.substring(0,1).toUpperCase()+A.substring(1);
        String str2= B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(str1 +" "+ str2);
        sc.close();
       
    }
}
