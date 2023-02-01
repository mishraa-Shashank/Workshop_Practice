package com.practice3;
/*
Find the total number of pairs in the array whose sum is equal to the given value x
 */
/**
 * @author Shashank
 */
public class OOPs_St5 {
    int targetValue(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        OOPs_St5 res = new OOPs_St5();
        int[] arr = {1, 5, 7, 6, 10, 8};
        System.out.println("Total number of pairs are : "+res.targetValue(arr,15));
    }
}
