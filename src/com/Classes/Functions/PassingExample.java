package com.Classes.Functions;


public class PassingExample {
    public static void main(String[] args) {
        String name = "Ravi";
        greet(name);
//        System.out.println(naam);
    }

    static void greet(String naam) {
        System.out.println("Hello" + naam);
    }
}
