package blz.workshop.practice;

import java.util.Scanner;

public class SecondMaxRepeatedNumber_InArray {
    static void secondMaxRepeatedValue(int[] arr) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter number of elements :");
//        int size = scan.nextInt();
//        int[] arr = new int[size];
//        System.out.println("Enter elements :");
//        for (int i = 0; i < size; i++) {
//            arr[i] = scan.nextInt();
//        }
        int maxCount = 0;
        int maxRepeated = 0;
        int secondMaxRepeated = 0;
        for (int j : arr) {
            int count = 0;
            for (int k : arr) {
                if (j == k) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxRepeated = j;
            } else if (j != maxRepeated) {
                secondMaxRepeated = j;
            }
        }
        System.out.println(secondMaxRepeated);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 5, 4, 1, 1, 9, 2, 1, 3};
        SecondMaxRepeatedNumber_InArray.secondMaxRepeatedValue(arr);
    }
}