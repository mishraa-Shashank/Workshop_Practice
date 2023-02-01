package com.practice3;
/*
Array of integers, return the first value that is repeating in the array else return -1
 */

/**
 * @author Shashank
 */
public class OOPs_St8 {
    int firstRepeatingNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        OOPs_St8 res = new OOPs_St8();
        int[] arr = {12, 14, 7, 6, 14, 12, 13, 15};
        System.out.println("First repeating number in the given array is : " + res.firstRepeatingNum(arr));
    }
}
