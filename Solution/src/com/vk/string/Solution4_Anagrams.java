package com.vk.string;

import java.util.Arrays;
import java.util.Scanner;

public class Solution4_Anagrams 
{
	//static method to check anagrams.
	static boolean isAnagram(String a, String b) 
    {
       if(a.length() == b.length())
        {  
    	 //create 2 Array of characters of size String a and String b.  
        char[] A = new char[a.length()];
        char[] B = new char[b.length()];
        //store all the characters of String a into Array A.
        for(int i=0; i<a.length(); i++)
        {
            A[i] = a.toLowerCase().charAt(i);
        }
        //store all the characters of String B into Array B.
        for(int j=0; j< b.length(); j++)
        {
            B[j] = b.toLowerCase().charAt(j);
        }
        //sort the Array A and B in alphabetical order
        Arrays.sort(A);
        Arrays.sort(B);
        //check whether both Array A and B has the same characters if yes retuurn true or return false.
        if(Arrays.equals(A,B))
        {
          return true;
        }
        else
        {
            return false;
        }
        
    }
	return false;
    
}
	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Two String to check Anagrams");
        String a = scan.next();
        String b = scan.next();
        scan.close();
        //passing String a and String b to static isAnagram method to check whether both are same or not.
        boolean ret = isAnagram(a, b);
        //iteratoe operator to check the bolean ret results if true then it returns Anagrams if false then Not Anagrams.
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

