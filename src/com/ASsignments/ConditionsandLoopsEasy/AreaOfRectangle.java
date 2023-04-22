package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String... args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter length : ");
        double length = sc.nextDouble();
        System.out.print("Please Enter width : ");
        double width = sc.nextDouble();
        double area= length * width ;
        System.out.println("The area of rectangle : "+area);
    }
}
