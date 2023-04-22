package com.ASsignments.ConditionsandLoopsIntermidiate;

import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Units: ");
        int n = input.nextInt();
        double amount;
        if(n<=100){
            amount=n*4.22;
        }else if(n<=200) {
            amount=((n-100)*5.02)+(100*4.22);
        }else{
            amount=((n-200)*5.87)+(100*5.02)+(100*4.22);
        }
        System.out.println("Your bill is : " + amount + "RS");
    }
}
