package hackerrank.utoPianTree;

import java.util.Scanner;

public class Solution 
{
public static void main(String [] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the no of trial");
	int t = scan.nextInt();
	for(int i=0;i<t;i++)
	{
		int h = 1;
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		if(n>0)
		{
		for(int j=1;j<=n;j++)
		{
			
			if(j%2!=0)
			{
				h = h*2;
			}
			else
			{
				h = h+1;
			}
			
		}
		}
		System.out.println(h);
	}
	scan.close();
}
}