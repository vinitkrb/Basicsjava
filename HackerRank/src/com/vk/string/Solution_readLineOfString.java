package com.vk.string;

import java.util.Scanner;

public class Solution_readLineOfString 
{
	
	public static void main(String[] args) {
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);
	        int secondInteger;
	        double secondDouble;
	        String secondString;
            System.out.println("Enter The value of Second Integer.");
	        secondInteger=scan.nextInt();
	        System.out.println("Enter The value of Second Double.");
	        secondDouble=scan.nextDouble();
	        System.out.println("Enter The  Second String for concatation.");
	        secondString=scan.nextLine();
	       
	        
	         System.out.println((i+secondInteger));
	         System.out.println((d+secondDouble));
			 System.out.println(s +scan.nextLine()+ secondString);
			 scan.close();
}
}
