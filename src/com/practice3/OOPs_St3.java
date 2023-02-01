package com.practice3;

/**
 * @author Shashank
 */
public class OOPs_St3 {
    boolean isSorted(int[] arr) {
        boolean check = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        OOPs_St3 is = new OOPs_St3();
        int[] arr = {5, 9, 10, 3};
        System.out.println(is.isSorted(arr));
    }
}
