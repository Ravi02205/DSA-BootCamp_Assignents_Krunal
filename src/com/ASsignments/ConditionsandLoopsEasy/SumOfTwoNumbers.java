package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Num 1: ");
        int sum = input.nextInt();
        System.out.print("Enter First Num 2: ");
        sum += input.nextInt();
        System.out.println("Sum of Two Numbers : " + sum);
    }
}
