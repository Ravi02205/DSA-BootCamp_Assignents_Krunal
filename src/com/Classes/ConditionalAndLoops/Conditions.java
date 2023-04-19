package com.Classes.ConditionalAndLoops;

public class Conditions {
    public static void main(String[] args) {

        /*
         * Syetxt of IF Statement
         *
         * if(boolean Value of T or F){
         *   //body
         * }else{
         *   //do this
         * }
         * */

        /*
        int salary = 2300;
        if (salary > 1000) {
            salary += 2000;
        } else {
            salary += 1000;
        }
        */

//        multiple if else conditions

        int salary = 4000;
        if (salary > 2000) {
            salary += 2000;
        } else if (salary > 1000) {
            salary += 1000;
        } else {
            salary += 500;
        }

        System.out.println(salary);
    }
}

