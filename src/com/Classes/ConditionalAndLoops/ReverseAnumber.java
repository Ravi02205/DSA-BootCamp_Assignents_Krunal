package com.Classes.ConditionalAndLoops;

public class ReverseAnumber {
    public static void main(String[] args) {
        int n=1232312;
        int revNum=0;
        while(n>0){
            int rem=n%10;
            revNum=revNum*10+rem;
            n=n/10;
        }
        System.out.println(revNum);
    }
}
