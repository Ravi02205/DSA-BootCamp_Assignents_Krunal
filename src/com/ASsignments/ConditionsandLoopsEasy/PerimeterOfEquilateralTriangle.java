package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {

    public static void main(String... args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter side: ");
        double side = sc.nextDouble();
        double area=3 * side;
        System.out.println("The area of triangle : "+area);
    }
}
