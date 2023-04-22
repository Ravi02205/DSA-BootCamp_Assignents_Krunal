package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String... args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter Triangle Base : ");
        double base = sc.nextDouble();
        System.out.print("Please Enter Height : ");
        double height = sc.nextDouble();
        double area= (base * height) /2;
        System.out.println("The area of triangle : "+area);
    }
}
