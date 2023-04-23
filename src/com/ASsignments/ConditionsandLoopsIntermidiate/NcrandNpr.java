package com.ASsignments.ConditionsandLoopsIntermidiate;

import java.util.Scanner;

public class NcrandNpr {
    public static int getFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        System.out.print("Please Enter r : ");
        int r = input.nextInt();

        double npr = (double) (getFactorial(n) / getFactorial(n - r));
        double ncr = (double) (getFactorial(n) / (getFactorial(r) * getFactorial(n - r)));

        System.out.println("NPR : " + npr);
        System.out.println("NCR : " + ncr);
    }
}
