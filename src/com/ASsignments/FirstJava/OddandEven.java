package com.ASsignments.FirstJava;

import java.util.Scanner;
public class OddandEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int num1 = sc.nextInt();
        if(num1/2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
