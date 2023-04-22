package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String... args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter Triangle side 1: ");
        double side1 = sc.nextDouble();
        System.out.print("Please Enter Triangle side 2 : ");
        double side2 = sc.nextDouble();
        double h = Math.sqrt((side1*side1)-((side2*side2)/4));
        System.out.println(h);
        double area=(h * side2)/2;
        System.out.println("The area of isosceles triangle : "+area);
    }
}
