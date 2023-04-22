package com.ASsignments.ConditionsandLoopsEasy;
import java.util.Scanner;
public class AreaOfEquilateralTriangle {
    public static void main(String... args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter side: ");
        double side = sc.nextDouble();
        double area=(Math.sqrt(3) * (side*side))/4;
        System.out.println("The area of triangle : "+area);
    }
}
