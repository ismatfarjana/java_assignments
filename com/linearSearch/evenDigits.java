package com.linearSearch;

public class evenDigits {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,22,33,4543534,555,-44, 00};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
    int count = 0;
    for (int num: nums) {
        if (even(num)) {
            count++;
        }
    }
    return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
//        if (numberOfDigits % 2 == 0) {
//            return true;
//        }
//        return false;
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            num = 1;
        }
        while(num > 0) {
            count++;
            num = num/10;
        }
        return count;
    }

}
