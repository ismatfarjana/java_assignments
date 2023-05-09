package com.linearSearch;

public class SearchStrings {
    public static void main(String[] args) {
        String name = "dipty";
        char target = 'a';
        System.out.println(search(name, target));
    }
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        // else run for loop
        for(int i = 0; i < str.length(); i++) {
            int element = str.charAt(i);
            if (element == target) {
                return true;
            }
        }
        // if none of the return executed,
        return false;
    }

}
