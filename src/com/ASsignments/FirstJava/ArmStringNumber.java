package com.ASsignments.FirstJava;

import java.util.Scanner;
public class ArmStringNumber {
    public static int pow(int num,int length){
     if(length==0){
         return 1;
     }else{
         return num*pow(num,length-1);
     }
    }
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Please Enter left Range: ");
    int left=input.nextInt();
    System.out.print("Please Enter right Range: ");
    int right=input.nextInt();
    System.out.print("the armstrong Numbers in range: ");
    for(int i = left;i<=right;i++){
        int temp=i;
        int sum=0;
        int length=0;
        while(temp>0) {
            temp=temp/10;
            length++;
        }
        temp=i;
        while(temp>0){
            int rem=temp%10;
            sum+=pow(rem,length);
            temp=temp/10;
        }
        if(sum==i){
            System.out.print(i+" ");
        }else{

        }
    }

    }
}
