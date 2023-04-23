package com.Classes.SwitchStatement;

import java.util.Scanner;

public class NestedSwitchStatement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int empId=sc.nextInt();
        String dep= sc.next();

        switch (empId){
            case 1:
                System.out.println("Employee 1");
                break;
            case 2:
                System.out.println("Employee 2");
                break;
            case 3:
                System.out.println("Employee 3");
                switch (dep){
                    case "IT":
                        System.out.println("It Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Enter Valid Dep");
                }
                break;
            default:
                System.out.println("Enter Valid Emp ID:");
        }

        switch (empId) {
            case 1 -> System.out.println("Employee 1");
            case 2 -> System.out.println("Employee 2");
            case 3 -> {
                System.out.println("Employee 3");
                switch (dep) {
                    case "IT" -> System.out.println("It Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Enter Valid Dep");
                }
            }
            default -> System.out.println("Enter Valid Emp ID:");
        }
    }
}
