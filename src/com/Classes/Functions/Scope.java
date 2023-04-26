package com.Classes.Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Ravi";
        {
//            int a=100;
//            will give and error because a is initialised in
//            the same functional scope where the block is hence we can not initialise again.
            a = 99;// but we can change the value (reassign the original ref variable to some other value)
            System.out.println(a);
            int c = 9;
//            values initialised in a block, will remain in block
            name = "rahul";
        }
        int c=100;
        System.out.println(a);
//        System.out.println(c);
//        we cant access the c because it is defined inside a block;
        System.out.println(name);
    }
}
