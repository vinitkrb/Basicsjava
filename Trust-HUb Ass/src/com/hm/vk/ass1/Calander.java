package com.hm.vk.ass1;

import java.util.Scanner;

public class Calander
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.print("Enter Year:");
		int Year = in.nextInt();
		System.out.print("Enter Month:");
		int Month = in.nextInt();
		if (Month < 1 || Month > 12 || Year < 1900)
			System.out.println("Please Enter the month between 1 and 12 and year greater than 1900");
		else
			calander(Year, Month);
		in.close();
	}
	static void calander(int Year, int Month)
	{
		title(Year, Month);
		body(Year, Month);
	}
	static void title(int Year, int Month)
	{
		System.out.println("         " + monthName(Month) + " " + Year);
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	static String monthName(int Month)
	{
		String monthName = null;
		switch (Month) 
		{
		case 1:
			monthName = "January";
			break;
	    case 2:
	    	monthName = "February"; 
		    break;
		case 3: 
			monthName = "March"; 
		    break;
		case 4:
			monthName = "April";
		    break;
		case 5: 
			monthName = "May"; 
		    break;
		case 6:
			monthName = "June"; 
		    break;
		case 7: 
			monthName = "July"; 
		    break;
		case 8: 
			monthName = "August"; 
		    break;
		case 9:
			monthName = "September"; 
		    break;
		case 10: 
			monthName = "October";
		    break;
		case 11: 
			monthName = "November";
		break;
		case 12:
			monthName = "December";
		}
		return monthName;
		    }
	static void body(int Year, int Month)
	{
		int startDay = firstDay(Year, Month);
		int numberOfDaysInMonth = numberOfDaysInMonth(Year, Month);
		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("    ");
		for (i = 1; i <= numberOfDaysInMonth; i++)
			{
			if (i < 10)
				System.out.print("   " + i);
			else
				System.out.print("  " + i);
			if ((i + startDay) % 7 == 0)
		        System.out.println();
		    }
		System.out.println();
}
	private static int firstDay(int Year, int Month)
	{
		int startDay1800 = 3;
		int totalNumberOfDays = getTotalNumberOfDays(Year, Month);
		return (totalNumberOfDays + startDay1800) % 7;
	}
	private static int getTotalNumberOfDays(int Year, int Month) 
	{
		int total = 0;
		for (int i = 1800; i < Year; i++)
		if (isLeapYear(i))
		total = total + 366;
		else
		total = total + 365;
		for (int i = 1; i < Month; i++)
		total = total + numberOfDaysInMonth(Year, i);
		return total;
	}
	private static int numberOfDaysInMonth(int Year, int Month)
	{
		if (Month == 1 || Month == 3 || Month == 5 || Month == 7 ||Month == 8 || Month == 10 || Month == 12)
			return 31;
			if (Month == 4 || Month == 6 || Month == 9 || Month == 11)
			return 30;
			if (Month == 2) 
			return isLeapYear(Year) ? 29 : 28;
			return 0; 
	}
	private static boolean isLeapYear(int Year)
	{
		return Year % 400 == 0 || (Year % 4 == 0 && Year % 100 != 0);
	}
}

		    
