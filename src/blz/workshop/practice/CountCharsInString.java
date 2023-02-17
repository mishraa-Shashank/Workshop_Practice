package blz.workshop.practice;

import java.util.Scanner;

public class CountCharsInString {
    static int countChar(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch != ' ') {
                System.out.print(ch + " ");
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any name : ");
        String name = scan.next();

        System.out.println("\nNumber of character : " + CountCharsInString.countChar(name));
    }
}