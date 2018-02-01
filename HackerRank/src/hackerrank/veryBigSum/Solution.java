package hackerrank.veryBigSum;

import java.util.Scanner;

public class Solution
{
public static void main(String [] args)
{
	Scanner scan=new Scanner(System.in);
	//System.out.println("Enter the size of Array");
	int n=scan.nextInt();
	long[] Array = new long[n];
	long sum=0;
	for(int i=0;i<n;i++)
	{
		Array[i]=scan.nextLong();
		sum=sum+Array[i];
	}
	System.out.println(sum);
	scan.close();
}
}
