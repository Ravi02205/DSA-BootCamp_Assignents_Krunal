package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class AreaOfParallalogram {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Base: ");
        double b = sc.nextDouble();
        System.out.print("Please Enter Height : ");
        double h = sc.nextDouble();
        double area = (b * h);
        System.out.println("The area of parallalogram : " + area);
    }
}
