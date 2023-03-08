package com.syeda;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
//        principal, time, and rate
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        int principle = input.nextInt();
        System.out.println("Enter interest rate: ");
        float interestRate = (float) input.nextInt();
        System.out.println("Enter time range: ");
        int range = input.nextInt();

        float simpleInterest = principle * (interestRate/100) * range;
        System.out.println("The simple interest of a loan for "+ principle +" with "+ interestRate +"% interest after " + range +"years is: " + simpleInterest);
    }
}
