package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter Radius : ");
        int radius = sc.nextInt();
        double area= Math.PI*radius*radius;
        System.out.println(area);
    }
}
