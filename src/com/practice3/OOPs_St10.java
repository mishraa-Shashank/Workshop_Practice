package com.practice3;
/*
write a program to find the number which is second-largest repeated number of times
 */

/**
 * @author Shashank
 */
public class OOPs_St10 {
    int secondMaximumRepeatedNumber(int[] arr){
        int count = 0;
        int lastIndex = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    lastIndex = arr[i];
                    count++;
                }
            }
        }
        return lastIndex;
    }
}
