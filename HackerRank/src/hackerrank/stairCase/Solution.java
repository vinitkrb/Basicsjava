package hackerrank.stairCase;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of Staircase");
		int n=s.nextInt();
		for(int i=0; i<n; i++)
		{    
            for(int j=1; j<n-i; j++)//1 because for first value no space is required
            {
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("#");
            }
            System.out.println();
        }
		s.close();
				
	}

}
