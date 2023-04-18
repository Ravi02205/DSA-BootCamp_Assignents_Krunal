package com.ASsignments.FirstJava;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter principal : ");
        double principle=input.nextDouble();
        System.out.print("Please Enter time : ");
        double time=input.nextDouble();
        System.out.print("Please Enter rate : ");
        double rate=input.nextDouble();
        double interest=(principle*rate*time)/100;
        System.out.println("Your Simple Interest : " + interest);
    }
}
