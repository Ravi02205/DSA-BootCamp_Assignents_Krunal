package com.Classes.Functions;

import java.util.Arrays;


public class ChangeValue {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

        String name = "Hi ravi";
        changeName(name);
        System.out.println(name);
//        Nothing in java is passed by reference, and since a string is immutable,
//        that assignment creates a new string object that the copy of the reference
//        now points to. The original reference still points to the empty string.
    }

     static void changeName(String naam) {
//        now naam has the reference of the name object value
            naam = "hello";
//            above we are creating a new object which has the hello as a value so that is the reason
//         why the naam object is not being changes
    }

    static void change(int[] nums) {
        nums[0]=99;
//        if you make a change to object via this ref variable,
//        same obj will be changed
    }
}
