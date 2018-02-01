package com.vk.BattleshipGame;

public class SimpleDotComTest
{
	public static void main (String[] args)
	{
		SimpleDotcom dot = new SimpleDotcom();
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		String testResult = "failed";
		if (result.equals("hit"))
		{
			testResult="passed";
		}
		System.out.println(testResult);
	}
}
