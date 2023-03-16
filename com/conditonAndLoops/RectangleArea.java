package com.conditonAndLoops;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area of Rectangle calculator");
        System.out.println("-------------------------");
        System.out.println("Enter a length: ");
        float length = (float) input.nextInt();
        System.out.println("Enter a width: ");
        float width = (float) input.nextInt();
        float area = length * width;

        System.out.println("the area is: " + area);
    }
}
