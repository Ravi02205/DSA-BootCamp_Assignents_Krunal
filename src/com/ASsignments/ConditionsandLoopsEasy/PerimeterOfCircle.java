package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter Radius : ");
        int radius = sc.nextInt();
        double parameter= 2*Math.PI*radius;
        System.out.println(parameter);
    }
}
