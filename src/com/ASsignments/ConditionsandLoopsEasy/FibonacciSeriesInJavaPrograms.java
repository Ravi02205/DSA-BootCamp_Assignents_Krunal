package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class FibonacciSeriesInJavaPrograms {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a length of fibbonacci Series:");
        int n = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        int n3;
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }

}
