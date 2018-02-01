package vk.TwoCharacters;

import java.util.Scanner;

public class Solution
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
       String str="";
        char[] chars=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
        	chars[i]=s.charAt(i);
        }
        for(int j=0;j<s.length();j++)
        {
        	if(chars[j]==chars[s.length()-1-j])
        	{
            str+=chars[j];
        	}
        		
        }
        System.out.println(str.length()+1);
        in.close();
    }
}