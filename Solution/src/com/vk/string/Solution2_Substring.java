package com.vk.string;

import java.util.*;

public class Solution2_Substring 
{

        public static void main(String[] args)
        {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter String");
        
        String str = in.next();
        
        System.out.println("Enter Integer");
        
        int n = in.nextInt();
        
        List<String> list = new ArrayList<>();

        for(int i = 0; i < str.length() - n + 1; i++)
        {
            list.add(str.substring(i, i + n));
        }
        
        Collections.sort(list);
        
        System.out.println(list);
        
        System.out.println(list.get(0) + "\n" + list.get(list.size() - 1));
        in.close();
        }

}
