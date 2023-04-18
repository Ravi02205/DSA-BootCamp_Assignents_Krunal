package com.ASsignments.FirstJava;

import java.util.Scanner;

public class LargestofTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter number 1: ");
        double num1=input.nextDouble();
        System.out.print("Please Enter number 2: ");
        double num2=input.nextDouble();
        if(num1>num2){
            System.out.println("The largest Num : "+num1);
        }else{
            System.out.println("The largest Num : "+num2);
        }
    }
}
