package com.ASsignments.ConditionsandLoopsIntermidiate;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a String : ");
        String str = sc.nextLine();
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);
        }
        System.out.println("Reverse String : " + revStr);
    }
}
