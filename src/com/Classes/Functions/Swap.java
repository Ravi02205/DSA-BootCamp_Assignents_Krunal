package com.Classes.Functions;


public class Swap {
    public static void main(String[] args) {

        int a=10;
        int b=20;

//        swap number codE
//        int temp = a;
//        a=b;
//        b=temp;

        swap(a,b);

        System.out.print(a+" "+b);

        String name ="Ravi";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String name) {
        name = "Hello";
    }

    private static void swap(int a, int b) {
        int temp = a;
        a=b;
        b=temp;

//        for premitive
//        this change will only be valid in this function only; --> function scope
//        for non-primitive
//        the passing the value by the reference variable and if we change it then the previous one will be changes

    }
}
