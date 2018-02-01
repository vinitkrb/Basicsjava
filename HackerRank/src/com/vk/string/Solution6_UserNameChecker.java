package com.vk.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution6_UserNameChecker 
{

	public static void main(String[] args) 
	{
		 Scanner in = new Scanner(System.in);
		 
	        int n = Integer.parseInt(in.nextLine());

	        for (int i = 0; i < n; i++) 
	        {
	            try 
	            {
	                String expr = in.nextLine();
	                Pattern p = Pattern.compile(expr);
	                Matcher m = p.matcher(expr);
	                System.out.println("Valid");
	            }
	            catch (Exception e) 
	            {
	                System.out.println("Invalid");
	            }
	           
	        }
	        in.close();
	}

}
