package com.practice3;

/**
 * @author Shashank
 */
public class OOPs_St7 {
    int findMax(int[] arr) {
        int max = 0;
        /*
        sorting the array
         */
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        /*
        finding the maximum number from the array
         */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    /*
    find the second maximum number from the array
     */
    int findSecondMax(int[] arr) {
        int max = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = -1;
            }
        }
        return findMax(arr);
    }

    public static void main(String[] args) {
        OOPs_St7 res = new OOPs_St7();

        int[] arr = {12, 5, 9, 0, 36, 14};
        System.out.println("Maximum number from the array : " + res.findMax(arr));
        System.out.println("Second maximum number from the array is : " + res.findSecondMax(arr));
    }
}