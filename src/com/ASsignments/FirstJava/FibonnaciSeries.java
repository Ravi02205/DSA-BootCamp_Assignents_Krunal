package com.ASsignments.FirstJava;
import java.util.Scanner;
public class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Add Number till you need Fibonacci Series : ");
        int num = input.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);

        for(int i=2;i<num;i++){
            n3=n2+n1;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }
}
