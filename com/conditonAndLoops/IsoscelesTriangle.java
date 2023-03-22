package com.conditonAndLoops;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area of IsoscelesTriangle calculator");
        System.out.println("-------------------------");
        System.out.println("Enter  a height: ");
        float height = (float) input.nextInt();
        System.out.println("Enter a base: ");
        float base = (float) input.nextInt();
        float area = (height * base)/2;

        System.out.println("the area is: " + area);
    }
}
