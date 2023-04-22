package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter radius : ");
        double radius = sc.nextDouble();
        System.out.print("Please Enter Height : ");
        double height = sc.nextDouble();
        double volume = (2 * Math.PI * radius * height);
        System.out.println("The Curved Surface Area Of Cylinder : " + volume);
    }
}
