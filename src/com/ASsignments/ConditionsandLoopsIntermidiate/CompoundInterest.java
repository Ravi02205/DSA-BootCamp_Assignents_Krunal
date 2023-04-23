package com.ASsignments.ConditionsandLoopsIntermidiate;

import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial Value : ");
        double v = sc.nextDouble();
        System.out.print("Enter rate of compound : ");
        double r = sc.nextDouble();
        System.out.print("Enter time in years : ");
        double t = sc.nextDouble();
        double depre = (double) (v * Math.pow((1 + r / 100), t));
        System.out.println("compound Interest : " + depre);
    }
}
