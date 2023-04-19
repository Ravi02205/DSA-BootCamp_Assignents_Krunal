package com.Classes.ConditionalAndLoops;

public class NumberofOccurunce {
    public static void main(String[] args) {
        int n=1232313;
        int count=0;
        if(n>0){
            int rem=n%10;
            if(rem==3){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
