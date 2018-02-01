package com.hm.vinit;

import java.util.StringTokenizer;

public class Tokenizer {
public static void main(String args [])
{
	StringTokenizer st=new StringTokenizer("Vinit kumar is the emplotee of Happiest Minds");
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
}
}
