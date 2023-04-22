package com.ASsignments.ConditionsandLoopsIntermidiate;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Product Price: ");
        double price = input.nextDouble();
        System.out.print("Enter commission Amount: ");
        double cAmount = input.nextDouble();
        double cPercentage = (cAmount * 100) / price;
        System.out.println("Commission Percentage : " + cPercentage);
    }
}
