package com.ASsignments.FirstJava;

import java.util.Scanner;

public class CalculatewithIf {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please Enter number 1: ");
        double num1=input.nextDouble();
        System.out.print("Please Enter number 2: ");
        double num2=input.nextDouble();
        System.out.print("Please Enter operator(+, -, *, /) : ");
        char operator= input.next().charAt(0);

        if(operator == '+'){
            System.out.println("the sum : "+(num1+num2));
        }else if(operator=='-'){
            System.out.println("the sub : "+(num1-num2));
        }else if(operator=='*'){
            System.out.println("the mul : "+(num1*num2));
        }else if(operator=='/'){
            if(num2!=0) {
                System.out.println("the div : " + (num1 / num2));
            }
        }else{
            System.out.println("Please Enter Valid Operator");
        }
    }
}
