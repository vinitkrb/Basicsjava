package com.vk.araylist;

import java.util.*;

class Student{}
class Rockstar{}
class Hacker{}

public class Solution
{
   
   @SuppressWarnings("rawtypes")
static String count(ArrayList mylist)
   {
      int a = 0,b = 0,c = 0;
      for(int i = 0; i < mylist.size(); i++)
      {
         Object o=mylist.get(i);
         if(o instanceof  Student)
            a++;
         if(o instanceof  Rockstar)
            b++;
         if(o instanceof  Hacker)
            c++;
      }
      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }

   @SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String []args)
   {
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no of instances");
      int t = sc.nextInt();
      System.out.println("Enter "+t+" Instance");
      for(int i=0; i<t; i++)
      {
         String s=sc.next();
         if(s.equals("Student"))
         {
        	 mylist.add(new Student());
         }
         if(s.equals("Rockstar"))
         {
        	 mylist.add(new Rockstar());
         }
         if(s.equals("Hacker"))
        {
        	mylist.add(new Hacker());
        }
      }
      System.out.println(count(mylist));
      sc.close();
   }
}