package com.ASsignments.FirstJava;

import java.util.Scanner;

public class RuppesToUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Amount in Rupees: ");
        double amount=input.nextDouble();
        System.out.println("Amount in USD: "+(amount*0.012));
    }
}
