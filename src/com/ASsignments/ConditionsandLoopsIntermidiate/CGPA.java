package com.ASsignments.ConditionsandLoopsIntermidiate;
import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum=0;
        double count=0;
        System.out.println("to terminate the input give input as 0");
        while(true){
            System.out.print("Enter Marks:");
            int n=input.nextInt();
            if(n==0){
                break;
            }
            sum+=(double) (n/10);
            count++;
        }
        double average=(sum/count);
        System.out.print("The CGPA:" + average);
    }
}
