package hackerrank.TimeConversion;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution
{
	public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter time in hh:mm:ssAm/pm format.");
        String time = in.next();
        
        try
        {
    		SimpleDateFormat dtFormat= new SimpleDateFormat("hh:mm:ssa");
    		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    		Date date = dtFormat.parse(time);
    		System.out.println(formatter.format(date).split(" ")[1]);//
    	}
        catch(Exception ex)
        {
    		ex.printStackTrace();
    	}
        in.close();
}
}