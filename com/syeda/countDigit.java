package com.syeda;

import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int temp = number;
        System.out.print("Enter the number you want to check: ");
        int checkNumber = input.nextInt();

        int count = 0;
        while (temp > 0) {
            int remainder = temp % 10;
            if ( remainder == checkNumber ) {
                count++;
            }
            temp = temp / 10;
        }
        System.out.println("The occurrence of " + checkNumber + " in " + number + " is: " + count);
    }
}
