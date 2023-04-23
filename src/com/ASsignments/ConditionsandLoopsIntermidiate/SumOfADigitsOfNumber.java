package com.ASsignments.ConditionsandLoopsIntermidiate;

import java.util.Scanner;

public class SumOfADigitsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int n = input.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);

    }
}
