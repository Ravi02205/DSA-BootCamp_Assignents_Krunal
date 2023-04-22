package com.ASsignments.ConditionsandLoopsEasy;
import java.util.Scanner;
public class Factorsofthatnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = input.nextInt();
//        for(int i=1;i<=num;i++){
//            if((num%i)==0){
//                System.out.print(i+" ");
//            }
//        }
        for(int i=1;i<=Math.sqrt(num);i++){
            if((num%i)==0){
                if(num/i==i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" "+num/i+" ");
                }
            }
        }
    }
}
