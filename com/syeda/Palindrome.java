package com.syeda;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("PALINDROME CHECKER");
        System.out.println("------------------");
        System.out.println("Enter a word:");
        String word = input.nextLine();
        String reversedString = "";

        for (int index = 0; word.length() > index; index++) {
            reversedString = word.charAt(index) + reversedString;
        }

        if (reversedString.equals(word)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("BOOOOO!!! NOT A PALINDROME");
        }
        System.out.println("------------------");
    }
}
