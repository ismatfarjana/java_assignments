package com.syeda;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers separated by a space: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is the largest");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the largest");
        } else {
            System.out.println( "the numbers are same!");
        }
    }
}
