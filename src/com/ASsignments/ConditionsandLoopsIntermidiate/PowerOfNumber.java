package com.ASsignments.ConditionsandLoopsIntermidiate;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        System.out.print("Enter Power");
        int p = sc.nextInt();
        int ans = 1;
        for (int i = 0; i < p; i++) {
            ans *= n;
        }
        System.out.println(ans);
    }
}
