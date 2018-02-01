package hackerrank.compareTheTriplets;


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int Alice=0;
        int Bob=0;
        
        if(a0>b0)
        {
            Alice=Alice+1;
        }
        else
        {
            if(a0<b0)
            Bob=Bob+1;
        }
        
        if(a1>b1)
            Alice=Alice+1;
        else
        {
            if(a1<b1)
            Bob=Bob+1;
            
        }
        
        if(a2>b2)
            Alice=Alice+1;
        else
        {
            if(a2<b2)
            Bob=Bob+1;
          
        }
        
        
        System.out.print(Alice+" "+Bob);
       
       
        in.close();
    }
}
