package hackerrank.birthdayCakeCandles;

import java.util.Arrays;
import java.util.Scanner;

public class Solution
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int count=0;
        
        for(int height_i=0; height_i < n; height_i++)
        {
            height[height_i] = in.nextInt();
            
        }
        Arrays.sort(height);
        int max = height[height.length - 1];
       
        for(int i=0;i<height.length;i++)
        {
        	if(height[i]>=max)
        	{
        		count=count+1;
        	}
        }
        
       
       System.out.println(count);
        
        in.close();
    }
}
