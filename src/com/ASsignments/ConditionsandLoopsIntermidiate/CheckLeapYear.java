package com.ASsignments.ConditionsandLoopsIntermidiate;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int n = input.nextInt();
        if ((n % 400 == 0) || (n % 100 != 0 && n % 4 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not leap Year");
        }
    }
}
