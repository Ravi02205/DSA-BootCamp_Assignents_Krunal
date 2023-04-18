package com.ASsignments.FirstJava;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter Name : ");
        String name = sc.next();
        System.out.println("Hello "+name+",Good Morning " );
    }
}
