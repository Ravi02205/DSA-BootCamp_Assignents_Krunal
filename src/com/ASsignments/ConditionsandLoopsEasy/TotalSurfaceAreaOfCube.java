package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;
public class TotalSurfaceAreaOfCube {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter side length of cube : ");
        double length = sc.nextDouble();
        double volume = (length * length * length);
        System.out.println("The Total Surface Area Of Cube : " + volume);
    }
}
