package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Base: ");
        double b = sc.nextDouble();
        System.out.print("Please Enter side : ");
        double a = sc.nextDouble();
        double area = 2*(a + b);
        System.out.println("The perimeter of parallelogram : " + area);
    }
}
