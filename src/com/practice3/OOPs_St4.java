package com.practice3;
/*
Find the smallest & largest number from the given array
 */

import java.util.Arrays;
/**
 * @author Shashank
 */
public class OOPs_St4 {
    int[] smallestLargest(int[] arr) {
        /*
        sorting the array, like if any small comes later in the array then it will first sort
        the array then extract the small & large value from the array.
         */
        /*
        using bubble sorting
         */
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
//                swapping the numbers
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        int[] ans = {arr[0], arr[arr.length - 1]};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        OOPs_St4 result = new OOPs_St4();
        int[] arr = {1, 0, 6, 4, 10, 8, 2, 3, 7, 9};
        System.out.println(Arrays.toString(result.smallestLargest(arr)));
    }
}
