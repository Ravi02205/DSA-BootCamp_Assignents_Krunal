package com.Classes.ConditionalAndLoops;

import java.util.Scanner;

public class CalculatorIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter and Operator: ");
            char op = sc.next().trim().charAt(0);

            int ans=0;
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op=='+'){
                    ans=num1+num2;
                }else  if (op=='-'){
                    ans=num1-num2;
                }else  if (op=='*'){
                    ans=num1*num2;
                }else  if (op=='/'){
                    if(num2!=0){
                        ans=num1/num2;
                    }
                }else if (op=='%'){
                    if(num2!=0){
                        ans=num1%num2;
                    }
                }else{
                    System.out.println("Enter Valid Operator");
                }

            }else if(op=='x' || op=='X'){
                break;
            }else{
                System.out.println("Enter Valid Operator");
            }
            System.out.println(ans);
        }

    }
}