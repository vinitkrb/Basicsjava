package com.hm.vk.ass1;

import java.time.LocalDate;
import java.util.Scanner;

public class DayOfDate 
{
public static void main(String [] args)
{
	Scanner in=new Scanner(System.in);
    System.out.println("Enter Date:");
    int searchday=in.nextInt();
    System.out.println("Enter month:");
    int searchmonth=in.nextInt();
    System.out.println("Enter year:");
    int searchyear=in.nextInt();
    
    LocalDate date = LocalDate.of(searchyear, searchmonth, searchday);
    System.out.print("The day of your date is: "+date.getDayOfWeek());
    in.close();
}
}
