package vk.camelCase;

import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] r = s.split("(?=\\p{Upper})");
        int count=0;
        for(int i=0;i<r.length;i++)
        {
        	count++;
        }
       System.out.println(count);
        in.close();
    }
}
