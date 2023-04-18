package com.ASsignments.FirstJava;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str=input.nextLine();
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr+=str.charAt(i);
        }
//      == compare the references only
//      .equals() method compares the original content of the string
/*
        compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
            s1 == s2 : The method returns 0.
            s1 > s2 : The method returns a positive value.
            s1 < s2 : The method returns a negative value.
*/
        if(revStr.equals(str)){
            System.out.println("Palindromic ");
        }else {
            System.out.println("not Palindromic ");
        }
    }
}
