package com.syeda;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float num1 = (float) input.nextInt();
        System.out.println("Enter another number: ");
        float num2 = (float) input.nextInt();
        System.out.println("Enter an operator: ");
        char operator = input.next().trim().charAt(0);

        float result;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else {
            result = num1 / num2;
        }

        System.out.println("The result is: " + result);
    }
}
