package com.vk.operator;

import java.util.*;


public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        double tip=mealCost*tipPercent/100;
        double tax=mealCost*taxPercent/100;
        double totalcost=mealCost+tip+tax;
        int totalCost = (int) Math.round(totalcost);
      
        System.out.println("The total meal cost is "+totalCost+" dollars.");
    }
}