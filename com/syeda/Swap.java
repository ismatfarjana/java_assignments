package com.syeda;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(arr.length - 1);
        int firstIndex = arr[0];
        int lastIndex = arr.length - 1;
        reverse(arr);
//        swap(arr, 0, 5);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[]arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            swap(arr, start, end);
            start += 1;
            end -= 1;
        }
    }

    static void swap(int[]arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
