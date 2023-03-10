package com.conditonAndLoops;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area of Circle calculator");
        System.out.println("-------------------------");
        System.out.println("Enter a radius: ");
        float radius = (float) input.nextInt();
        float area = (float) (Math.PI * radius * radius);

        System.out.println("the area is: " + area);

    }
}
