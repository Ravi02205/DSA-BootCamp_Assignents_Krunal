package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class SumofallNumbersTill0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Please Enter Number : ");
            int n = input.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
        }
        System.out.println("Sum of entered Number : " + sum);
    }
}
