package blz.workshop.practice;

import java.util.Arrays;

public class ReplaceZeroWithOne {
    static void replaceZero(String[] arr) {
        System.out.println(Arrays.asList(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replace('0', '1');
        }
        System.out.println(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        String[] stringArr = {"1111", "1100", "1000", "0011", "0000"};
        ReplaceZeroWithOne.replaceZero(stringArr);
    }
}