/**
 * 
 */
package hackerrank.plusMinus;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Vinit.kumar
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
    DecimalFormat df = new DecimalFormat("#,###,##0.000000");
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of input");
    int n=scan.nextInt();
    int [] array=new int[n];
    double negative = 0,positive = 0,zero = 0;
    System.out.println("Enter " +n+ " values");
    for(int i=0;i<n;i++)
    {
    	array[i]=scan.nextInt();
    	if(array[i]<0)
    		negative+=1;
    	if(array[i]==0)
    		zero+=1;
    	if(array[i]>0)
    		positive+=1;
    }
    
    System.out.println(df.format(positive/n));
    System.out.println(df.format(negative/n));
    System.out.println(df.format(zero/n));
    scan.close();		
    	
    }
    
    
	}


