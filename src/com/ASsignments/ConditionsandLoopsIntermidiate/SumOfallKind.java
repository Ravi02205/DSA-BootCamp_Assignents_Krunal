package com.ASsignments.ConditionsandLoopsIntermidiate;

import java.util.Scanner;

public class SumOfallKind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOfOdd = 0;
        int sumOfEven = 0;
        int sumOfNegative = 0;
        while (true) {
            System.out.print("Please enter number (to terminate add Number as 0) : ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n > 0) {
                if (n % 2 == 0) {
                    sumOfEven += n;
                } else {
                    sumOfOdd += n;
                }
            } else {
                sumOfNegative += n;
            }
        }
        System.out.println("sum of positive even : " + sumOfEven);
        System.out.println("sum of positive odd : " + sumOfOdd);
        System.out.println("sum of negative : " + sumOfNegative);
    }
}
