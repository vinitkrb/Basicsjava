package com.vk.ReverseFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReverseFile
{
public static void main(String [] args)
{
	 
	String CurrentLine=null;
	String outFile="";
	try
	{
		BufferedReader br =new BufferedReader(new FileReader("D:\\test.txt"));
		while((CurrentLine=br.readLine()) != null)
		{
			outFile+=CurrentLine+"\n";
			System.out.println("File "+ outFile);
			String[] words=outFile.split("\\s");
			
			
			System.out.println("Reverse file");
			for(int i=words.length-1;i>=0;i--)
			{
				System.out.println(words[i]);
			}
				}
		br.close();
	}
 catch(IOException e)
		{
			e.printStackTrace();
		}
		
}}
