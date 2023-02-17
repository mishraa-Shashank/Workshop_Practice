package blz.workshop.practice;

import java.util.Scanner;

public class PositionOfAlphabets {
    static void countChar(String string) {
        for (int i = 0; i < string.length(); i++) {
            int post = 1;
            char ch = string.charAt(i);
            for (char j = 'a'; j < 'z'; j++) {
                if (ch == j) {
                    System.out.println(ch + "->" + post);
                }
                post++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string to find the position of chars : ");
        String str = scan.nextLine();
        PositionOfAlphabets.countChar(str);
    }
}