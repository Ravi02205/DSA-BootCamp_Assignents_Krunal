package com.ASsignments.ConditionsandLoopsIntermidiate;


import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        int fact = 1;
        for (int i = 1; i <=n; i++) {
            fact *= i;
        }
        System.out.println("The Factorial of that Number:" + fact);
    }
}
