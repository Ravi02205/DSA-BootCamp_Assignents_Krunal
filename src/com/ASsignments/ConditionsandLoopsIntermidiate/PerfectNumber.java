package com.ASsignments.ConditionsandLoopsIntermidiate;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int n= input.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not perfect Number");
        }
    }
}
