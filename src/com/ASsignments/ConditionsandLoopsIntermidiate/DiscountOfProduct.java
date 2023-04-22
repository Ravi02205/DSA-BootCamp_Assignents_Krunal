package com.ASsignments.ConditionsandLoopsIntermidiate;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a product Price : ");
        double n=input.nextDouble();
        System.out.print("Enter a product discount : ");
        double d=input.nextDouble();
        double finalPrice=(n)-((n*d)/100);
        System.out.println("The Final Price is : "+finalPrice);
    }
}
