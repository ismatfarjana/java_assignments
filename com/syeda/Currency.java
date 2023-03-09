package com.syeda;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter currency in rupees: ");
        int rupees = input.nextInt();
        float rupeesInF = (float) rupees;
        float usd =  (float) (rupeesInF * 0.012);
        System.out.println(rupees + "rupees = " + usd +"USD");
    }
}
