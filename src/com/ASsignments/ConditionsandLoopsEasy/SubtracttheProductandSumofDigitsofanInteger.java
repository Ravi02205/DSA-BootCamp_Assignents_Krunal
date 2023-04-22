package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class SubtracttheProductandSumofDigitsofanInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLease Enter the Number : ");
        int n = sc.nextInt();
        int product = 1;
        int sum = 0;
        int rem;
        int temp = n;
        while (temp > 0) {
            rem = temp % 10;
            product *= rem;
            sum += rem;
            temp /= 10;
        }
        System.out.println(product - sum);
    }
}
