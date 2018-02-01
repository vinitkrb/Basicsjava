package vk.pangram;

import java.util.HashSet;
import java.util.Scanner;


public class Solution
{
 public static void main(String[] args)
 {
	Scanner scan=new Scanner(System.in);
	String string=scan.nextLine(); 
	char chars[] = string.toCharArray();
	HashSet<Character> set = new HashSet<>();
	for(char c : chars)
	{
		if(Character.isLetter(c))
		
		set.add(Character.toUpperCase(c));
	}
	if(set.size()>=26)
		System.out.println("pangram");
	else
		System.out.println("not pangram");
	scan.close();
}
}
