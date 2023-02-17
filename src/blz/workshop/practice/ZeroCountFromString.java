package blz.workshop.practice;

import java.util.Arrays;

public class ZeroCountFromString {
    int countZero(String[] arr) {
        int count = 0;
        for (String str : arr) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '0') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ZeroCountFromString zerCount = new ZeroCountFromString();
        String[] stringArr = {"1111", "1100", "1000", "0011", "0000"};
        System.out.println(Arrays.asList(stringArr));
        System.out.println("Total number of zeroes from array are : " + zerCount.countZero(stringArr));
    }
}