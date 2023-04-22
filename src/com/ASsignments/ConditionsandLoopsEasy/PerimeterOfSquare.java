package com.ASsignments.ConditionsandLoopsEasy;
import java.util.Scanner;
public class PerimeterOfSquare {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter side: ");
        double side = sc.nextDouble();
        double perimeter = 4*(side);
        System.out.println("The perimeter of square : " + perimeter);
    }
}
