package vk.ceaserCipher;

import java.util.Scanner;

public class Solution 
{
   public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String string=scan.next();
		int key=scan.nextInt();
		char check ;
        char a[] = string.toCharArray();
        for(int i = 0; i < a.length ; i++)
        {
            if(( a[i] >= 97 && a[i] <= 122) || (a[i] >= 65 && a[i] <= 90 ))
            {
                check = a[i];
                a[i] = (char) (a[i] + key);
                if(Character.isLowerCase(check))
                {
                    while(a[i] > 122)
                    {
                        a[i] = (char) (a[i]-26);
                    }
                }
                else
                {
                    while(a[i] > 90)
                    {
                        a[i] = (char) (a[i]-26);
                    }
                }
            }
            System.out.print(a[i]);
        }
        scan.close();
	}
}