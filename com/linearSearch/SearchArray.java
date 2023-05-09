package com.linearSearch;

public class SearchArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int ans = linearSearch(arr, 90);
        System.out.println(ans);
    }
    // search in the array: return index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        //if array empty
        if (arr.length == 0) {
            return -1;
        }
        // else run for loop
        for(int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        // if none of the return executed,
        return -1;
    };
}
