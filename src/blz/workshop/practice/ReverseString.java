package blz.workshop.practice;

import java.util.Scanner;

public class ReverseString {
    private static void reverseString(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to reverse :");
        String str = scan.nextLine();
        String reverse = " ";
//        StringBuilder reverse = new StringBuilder(" ");
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
//            reverse.append(str.charAt(i));
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        ReverseString.reverseString();
    }
}