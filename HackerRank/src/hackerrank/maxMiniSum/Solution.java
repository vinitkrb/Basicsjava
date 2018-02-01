package hackerrank.maxMiniSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution
{
public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);
	System.out.println("Enter 5 values");
    long a = in.nextLong();
    long b = in.nextLong();
    long c = in.nextLong();
    long d = in.nextLong();
    long e = in.nextLong();
    long min,max;
    List<Long> list=new ArrayList<Long>();
    list.add(a);
    list.add(b);
    list.add(c);
    list.add(d);
    list.add(e);
    Collections.sort(list);
    System.out.print(list.get(0)+list.get(1)+list.get(2)+list.get(3));
    System.out.print(" "+(list.get(1)+list.get(2)+list.get(3)+list.get(4)));
    in.close();
}
}
