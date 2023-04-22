package com.ASsignments.ConditionsandLoopsEasy;
import java.util.*;
public class VolumeOfSphere {
    public static void main(String... args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter radius : ");
        double radius = sc.nextDouble();
        double volume= (4/3)*Math.PI*(radius*radius*radius);
        System.out.println("The volume of Sphere : "+volume);
    }
}
