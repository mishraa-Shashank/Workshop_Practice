package com.practice1;

/**
 * @author  Shashank
 */
public class Multiple {
    /**
     * method to print the number which are divisible by both 5 & 7
     * 1) initializing the in variable.
     * 2) using while loop & setting it true so that we enter the loop
     * 3) using if-condition to get our result
     * 4) increamenting our variable once check the condition
     */
    static void printNumber1() {
        int num = 1;
        while (true) {
            if (num % 5 == 0 && num % 7 == 0) {
                System.out.println(num);
                break;
            }
            num++;
        }
    }
    public static void main(String[] args) {
        System.out.print("Number which is divisible by 5 & 7 both : ");
        printNumber1();
    }
}
