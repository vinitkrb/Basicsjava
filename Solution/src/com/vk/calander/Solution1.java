package com.vk.calander;

import java.time.LocalDate;
import java.util.Scanner;

public class Solution1 
{
	public static void main(String[] args)
	{
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter the date");
	        int date = in.nextInt();
	        System.out.println("Enter the month");
	        int month = in.nextInt();
	        System.out.println("Enter the Year");
	        int year = in.nextInt();
	        
	        LocalDate dt = LocalDate.of(year, month, date);
	        
	        System.out.println(dt.getDayOfWeek());
	        in.close();
	}
}

