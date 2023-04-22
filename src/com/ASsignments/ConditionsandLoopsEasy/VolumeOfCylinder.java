package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String... args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter radius : ");
        double radius = sc.nextDouble();
        System.out.print("Please Enter Height : ");
        double height = sc.nextDouble();
        double volume= Math.PI*(radius*radius * height);
        System.out.println("The volume of prism : " + volume);
    }
}
