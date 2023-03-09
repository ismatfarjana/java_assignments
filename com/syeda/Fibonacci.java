package com.syeda;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a limit:");
        int limit = input.nextInt();
        int a = 0;
        int b = 1;

        for (int count = 0;count <= limit; count++) {
            int temp = a;
            a = a + b;
            b = temp;
//            System.out.print(b + ",");
        }

        System.out.println("The nth number is: "+ b);
    }
}
