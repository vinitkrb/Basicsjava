package hackerrank.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution_PrimeNumber 
{
public static void main(String [] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Number to check Prime Number Or Not");
	BigInteger b=scan.nextBigInteger();
	scan.close();
	System.out.println(b.isProbablePrime(10) ? "prime":"not Prime");
}

}
