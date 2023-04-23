package com.ASsignments.ConditionsandLoopsIntermidiate;

import java.util.Scanner;

public class SumofallNumbersTill0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        int temp=n;
        int count=0;
        int armNumber=0;
        while(n>0){
            n/=10;
            count++;
        }
        n=temp;
        while (n>0) {
            int rem=n%10;
            armNumber+=Math.pow(rem,count);
            n/=10;
        }
        if(temp==armNumber){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}
