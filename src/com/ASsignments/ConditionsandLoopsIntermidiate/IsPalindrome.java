package com.ASsignments.ConditionsandLoopsIntermidiate;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number : ");
        int number = sc.nextInt();
        int revNumber = 0;
        int temp = number;
        int multiplication = 1;
        while (temp > 0) {
            int rem = temp % 10;
            revNumber += rem * multiplication;
            temp /= 10;
            multiplication *= 10;
        }
        if (revNumber == number) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
}
