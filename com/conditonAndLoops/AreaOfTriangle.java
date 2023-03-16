package com.conditonAndLoops;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area of Triangle calculator");
        System.out.println("-------------------------");
        System.out.println("Enter a height: ");
        float height = (float) input.nextInt();
        System.out.println("Enter a base: ");
        float base = (float) input.nextInt();
        float area = (1.0f/2.0f) * height * base;

        System.out.println("the area is: " + area);
    }
}
