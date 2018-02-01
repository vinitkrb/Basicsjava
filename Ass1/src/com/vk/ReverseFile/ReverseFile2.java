package com.vk.ReverseFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReverseFile2
{
	public static void main(String [] args)
	{
		String CurrentLine;
		
		try
		{
			BufferedReader br =new BufferedReader(new FileReader("D:\\test.txt"));
			List<String> tmp = new ArrayList<String>();

			while((CurrentLine=br.readLine()) != null)
			    {
			    	
			    	tmp.add(CurrentLine);
			    }
			    for(int i=tmp.size()-1;i>=0;i--) 
			    {
			       System.out.println(tmp.get(i));
			      
			    }
			br.close();
		}
	 catch(IOException e)
			{
				e.printStackTrace();
			}
}
	}
