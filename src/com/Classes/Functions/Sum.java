package com.Classes.Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        int ans = sum2();
        System.out.println(ans);
        Scanner sc = new Scanner(System.in);
        System.out.print("PLease Enter Num 1: ");
        int n1 = sc.nextInt();
        System.out.print("PLease Enter Num 2: ");
        int n2 = sc.nextInt();
        ans = sum3(n1, n2);
        System.out.println(ans);
    }

    private static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }


//    passing a value ;


    //    return the value
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLease Enter Num 1: ");
        int n1 = sc.nextInt();
        System.out.print("PLease Enter Num 2: ");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        return sum;
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLease Enter Num 1: ");
        int n1 = sc.nextInt();
        System.out.print("PLease Enter Num 2: ");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        System.out.println("The Sum : " + sum);
    }
    /*
     * syntext
     *
     * access modifiers(will learn in OOP) return_type name_of_function () {
     *
     *    body
     *    return statement;
     *
     * }
     * */

//    static method should use only static things
}
