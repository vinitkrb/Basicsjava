package com.hm.vk.ass1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Day
{
	public static void main(String [] args)
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
		Scanner in=new Scanner(System.in);
	    System.out.println("Enter Date in format date/month/year:");
	    String searchday=in.nextLine();
	    LocalDate date = LocalDate.parse(searchday, dtf);
		System.out.print("The day of your date is: "+date.getDayOfWeek());
		in.close();
	}
	}

