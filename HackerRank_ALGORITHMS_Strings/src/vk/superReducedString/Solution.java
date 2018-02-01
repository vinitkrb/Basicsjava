package vk.superReducedString;

import java.util.Scanner;

public class Solution
{
public static void main(String [] args)
{
	Scanner scan=new Scanner(System.in);
	StringBuilder sb = new StringBuilder(scan.nextLine());
	int i=0;
	while(i< sb.length()-1)
    {
        if(sb.charAt(i) == sb.charAt(i+1))
        {
            sb.delete(i,i+2);
            i=0;
        }
        else
        {
            i++;
        }
    }
    if(sb.length() == 0)
    {
        System.out.println("Empty String");
    }
    else
    {
        System.out.println(sb.toString());
    }
    scan.close();
}
	
}

