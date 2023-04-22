package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String... args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter Triangle Base radius : ");
        double radius = sc.nextDouble();
        System.out.print("Please Enter Height : ");
        double height = sc.nextDouble();
        double area= Math.PI*radius*radius*(height /2);
        System.out.println("The area of triangle : "+area);
    }
}
