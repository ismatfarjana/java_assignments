package com.binerySearch;

import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};
        int ans = binarySearch(arr, 8);
        System.out.println(ans);

    }
    // return the index
    // return -1 if dosenot exist
    static int binarySearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end) {
            // find the middle element
            int mid = start + (end - start)/2;

            if (target < arr[mid]) {
                end  = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
