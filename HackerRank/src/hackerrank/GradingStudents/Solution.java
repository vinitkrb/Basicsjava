package hackerrank.GradingStudents;

import java.util.Scanner;

public class Solution 
{

    static int solve(int[] grades)
    {
    	for(int grade:grades)
    	{
    		if(grade<38)
    		{
    			System.out.println(grade);
    		}
    		else
    		{
    			int nextGrade=grade+(5-grade%5);
    			if(nextGrade-grade<3)
    			{
    				System.out.println(nextGrade);
    			}
    			else
    			{
    				System.out.println(grade);
    			}
    		}
    	}
		return 0;
		
        
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++)
        {
            grades[grades_i] = in.nextInt();
        }
        int result = solve(grades);
        
        in.close();
    }
}
