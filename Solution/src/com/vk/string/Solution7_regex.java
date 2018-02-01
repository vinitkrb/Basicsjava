package com.vk.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution7_regex 
{
    public static void main(String[] args) 
    {

    	String regex = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
    	
        Pattern p = Pattern.compile(regex);//to compile the String

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of sentences you want to correct");
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) 
        {
        	System.out.println("Enter "+(numSentences+1)+" incorrect lines with repeted words");
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find())
            {
                input = input.replaceAll("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+", "$1");
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }}