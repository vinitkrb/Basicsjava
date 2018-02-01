package hackerrank.diagonalDiffrence;

import java.util.Scanner;

public class Solution  
{
	public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the sixe of matrix");
        int n = in.nextInt();
        int array[][] = new int[n][n];
        int d1 = 0, d2 = 0;
        System.out.println("Enter the " +n*n+ " elements");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                array[i][j] = in.nextInt();
                if (i == j) 
                {
                    d1 = d1 + array[i][j];
                }
                if (i + j == n - 1) 
                {
                    d2 = d2 + array[i][j];
                }
            }
        }
        System.out.println(" The primary and Secondary diagonal diffrence of matrix is "+Math.abs(d1 - d2)); 
        in.close();
    }
}
