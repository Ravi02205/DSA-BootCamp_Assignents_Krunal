package com.ASsignments.ConditionsandLoopsEasy;
import java.util.Scanner;
public class AreaOfRhombus {
    public static void main(String... args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter Rhombus Diagonal 1: ");
        double side1 = sc.nextDouble();
        System.out.print("Please Enter Rhombus Diagonal 2 : ");
        double side2 = sc.nextDouble();
        double area=(side1 * side2)/2;
        System.out.println("The area of Rhombus : "+area);
    }
}
