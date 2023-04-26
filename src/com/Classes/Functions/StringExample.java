package com.Classes.Functions;

public class StringExample {
    public static void main(String[] args) {
//        String greeting=greet();
//        System.out.println(greeting);
        String output=mygreet("Ravi");
        System.out.println(output);
    }
    static String mygreet(String Name){
        String statement="Hello Ravi";
        return statement;
    }

    static String greet(){
        String statement="Hello Ravi";
        return statement;
    }
}
