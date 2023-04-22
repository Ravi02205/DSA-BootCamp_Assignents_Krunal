package com.ASsignments.ConditionsandLoopsIntermidiate;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x of Forst Point:");
        double p1x1=input.nextDouble();
        System.out.print("Enter y of First Point:");
        double p1y1=input.nextDouble();
        System.out.print("Enter x of second Point:");
        double p2x1=input.nextDouble();
        System.out.print("Enter y of second Point:");
        double p2y1=input.nextDouble();

        double distance=Math.sqrt(Math.pow((p2x1-p1x1),2)+Math.pow((p2y1-p1y1),2));
        System.out.println(distance);
    }
}
