package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String... args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter Base : ");
        double base = sc.nextDouble();
        System.out.print("Please Enter Height : ");
        double height = sc.nextDouble();
        double area= (base * height);
        System.out.println("The volume of prism : "+area);
    }
}
