package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String... args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter length : ");
        double length = sc.nextDouble();
        System.out.print("Please Enter width : ");
        double width = sc.nextDouble();
        double perimeter= 2*(length + width) ;
        System.out.println("The perimeter of rectangle : "+perimeter);
    }
}
