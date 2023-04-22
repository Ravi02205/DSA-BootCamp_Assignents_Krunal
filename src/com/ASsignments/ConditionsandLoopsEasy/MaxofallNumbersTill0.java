package com.ASsignments.ConditionsandLoopsEasy;

import java.util.Scanner;

public class MaxofallNumbersTill0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        while (true) {
            System.out.print("Please Enter Number : ");
            int n = input.nextInt();
            if (n == 0) {
                break;
            }
            if(max<n){
                max=n;
            }
        }
        System.out.println("Max of entered Number : " + max);
    }
}
