package com.vk.string;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution5_Regex 
{
	
	public static void main(String [] args) throws FileNotFoundException
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a line");
		
        String line = scan.nextLine();
        //split the method by finding the white space.(\\s is regex to split the line by findng whitespace)
        String[] S=line.split("\\s");
        //creating list to store all the string of line into an ArrayList named list.
        List<String> list = new ArrayList<>();
        
         //creating String named as string to store the values of Array of String S
        for (String string : S)
        {
        	//creating String e and storing the value of String named string by spliting the characters assigned in the regex.
            for (String e : string.split("[\\?\\.,'!_@]"))
                if (!e.matches(""))//matches is used to check whether the string matches the format assigned in regex.
                    list.add(e);//if not matches the format add into the list
        }
        System.out.println(list.size());
        for (String e : list)
            System.out.println(e);
        scan.close();
			
}
}