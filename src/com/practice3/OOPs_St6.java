package com.practice3;
/*
Find the unique number from the array where other numbers repeated in the array.
 */
/*
Find the maximum number of repeated number.
 */

/**
 * @author Shashank
 */
public class OOPs_St6 {
    int countRepeatedNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    int uniqueNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int j : arr) {
            if (j != -1) {
                ans = j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        OOPs_St6 res = new OOPs_St6();
        int[] arr = {1, 2, 3, 5, 2, 1, 5, 4, 4};
        System.out.println("Unique number from the array is : " + res.uniqueNumber(arr));
        int[] arr1 = {1, 1, 2, 3, 4, 4, 4, 6, 1};
        System.out.println("Maximum time repeated number is : " + res.countRepeatedNumber(arr1));
    }
}