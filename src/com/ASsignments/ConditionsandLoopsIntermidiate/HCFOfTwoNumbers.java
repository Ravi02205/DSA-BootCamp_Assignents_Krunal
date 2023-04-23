package com.ASsignments.ConditionsandLoopsIntermidiate;

import java.util.Scanner;

public class HCFOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial Number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter  initial Number 1  : ");
        int n2 = sc.nextInt();
        int hcf = 1;
        for (int i = 2; i < Math.min(n1, n2); i++) {
            while (n1 % i == 0 && n2 % i == 0) {
                hcf *= i;
                n1 /= i;
                n2 /= i;
            }
        }
        System.out.println(hcf);
    }
}
