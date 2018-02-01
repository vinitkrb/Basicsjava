package cm.vk.Exception;

import java.util.Scanner;

class abc
{
  int power(int n, int p) throws Exception 
    {
        if (n < 0 || p < 0) 
        {
            throw new Exception("n and p should be non-negative");
        } 
        else 
        {
            return (int)Math.pow(n, p);
        }
    }
}

class MyCalculator
{

	 public static void main(String[] args)
	 {
	  Scanner in = new Scanner(System.in);
      System.out.println("Enter 2 integers n and p for calculating the n to the power p");
	  while ( in .hasNextInt())
	  {
	   int n = in .nextInt();
	   int p = in .nextInt();
	   abc my_calculator = new abc();
	   try 
	   {
	    System.out.println(my_calculator.power(n, p));
	   } 
	   catch (Exception e)
	   {
	    System.out.println(e);
	   }
	  }
	  in.close();
	 }
	}
