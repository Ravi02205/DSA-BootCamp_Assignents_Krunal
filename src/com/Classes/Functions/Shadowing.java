package com.Classes.Functions;

public class Shadowing {
    static int x = 90; //This variable has its own scope
//    x will be available in shadowing block
//    static means object independent
//    this will be shadowed for 12 13 line
    public static void main(String[] args) {
        System.out.println(x); // not giving error
        fun();

//        int x=49;
//        System.out.println(x);
//        lower level is overriding the upper level

        int x;
//        System.out.println(x);
        x=20;
//        scope of the x will be starting after initialisation
    }

    static void fun(){
        System.out.println(x); //not giving error
    }
}


//when we use two variables with same name in the scope where both are overlaps
//the variable with higher level scope is hidden
//