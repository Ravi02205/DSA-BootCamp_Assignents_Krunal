package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter length : ");
        double length = sc.nextDouble();
        System.out.print("Please Enter Height : ");
        double height = sc.nextDouble();
        System.out.print("Please Enter width : ");
        double width = sc.nextDouble();
        double volume = (length * width * height);
        System.out.println("The volume of pyramid : " + volume);
    }
}
