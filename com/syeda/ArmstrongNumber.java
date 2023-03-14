package com.syeda;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        num1 = input.nextInt();
        num2 = input.nextInt();

        for(int i = num1; i < num2; i++ ) {
            int sum = 0;
            int resizedNumber = i;
            while( resizedNumber != 0 ) {
                int remainder = resizedNumber % 10;
                sum = sum + (remainder * remainder * remainder);
                resizedNumber = resizedNumber/10;
            }
            if (sum == i) {
                System.out.println(i + " is a armstrong number!!");
            }
       }
    }
}
