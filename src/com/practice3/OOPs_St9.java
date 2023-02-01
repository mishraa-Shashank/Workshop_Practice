package com.practice3;
/*
For an integer array return the last repeating number in the array else return -1
 */

/**
 * @author Shashank
 */
public class OOPs_St9 {
    int lastRepeatingNum(int[] arr) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    lastIndex = arr[i];
//                    System.out.println(lastIndex);
                }
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        OOPs_St9 res = new OOPs_St9();
        int[] arr = {12, 14, 6, 14, 12, 13, 5};
        System.out.println("Last repeating number in the array is : " + res.lastRepeatingNum(arr));
    }
}